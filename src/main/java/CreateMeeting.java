import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.security.Key;
import java.util.Date;
import java.util.UUID;

public class CreateMeeting {
    private String zoomUserId = "timothystulens@gmail.com";
    private String yourPass = "test123";
    private String zoomApiKey = "ZIFCKdwRQuKxiUDci3AIPg";
    private String zoomApiSecret = "Ncn76hfed7Nd56xJC6i99O0aTYQgD3wHih9P";
    public ZoomMeetingObjectDTO createMeeting(ZoomMeetingObjectDTO zoomMeetingObjectDTO) {
        System.out.println("Request to create a Zoom meeting");
        // replace zoomUserId with your user ID
        String apiUrl = "https://api.zoom.us/v2/users/" + zoomUserId + "/meetings";

        // replace with your password or method
        zoomMeetingObjectDTO.setPassword(yourPass);
        // replace email with your email
        zoomMeetingObjectDTO.setHost_email(zoomUserId);

        // set time and timezone
        zoomMeetingObjectDTO.setStart_time("2021-05-18T20:50:00");
        zoomMeetingObjectDTO.setTimezone("Europe/Brussels");

        // Optional Settings for host and participant related options
        ZoomMeetingSettingsDTO settingsDTO = new ZoomMeetingSettingsDTO();
        settingsDTO.setJoin_before_host(true);
        settingsDTO.setParticipant_video(true);
        settingsDTO.setHost_video(false);
        settingsDTO.setAuto_recording("cloud");
        settingsDTO.setMute_upon_entry(true);
        zoomMeetingObjectDTO.setSettings(settingsDTO);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + generateZoomJWTTOken());
        headers.add("content-type", "application/json");
        HttpEntity<ZoomMeetingObjectDTO> httpEntity = new HttpEntity<ZoomMeetingObjectDTO>(zoomMeetingObjectDTO, headers);
        ResponseEntity<ZoomMeetingObjectDTO> zEntity = restTemplate.exchange(apiUrl, HttpMethod.POST, httpEntity, ZoomMeetingObjectDTO.class);
        if(zEntity.getStatusCodeValue() == 201) {
            System.out.println("Zoom meeting response {} \n" + zEntity);
            return zEntity.getBody();
        } else {
            System.out.println("Error while creating zoom meeting {} \n" + zEntity.getStatusCode());
        }
        return zoomMeetingObjectDTO;
    }


    /**
     * Generate JWT token for Zoom using api credentials
     *
     * @return JWT Token String
     */
    private String generateZoomJWTTOken() {
        String id = UUID.randomUUID().toString().replace("-", "");
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        Date creation = new Date(System.currentTimeMillis());
        Date tokenExpiry = new Date(System.currentTimeMillis() + (1000 * 60));

        Key key = Keys
                .hmacShaKeyFor(zoomApiSecret.getBytes());
        return Jwts.builder()
                .setId(id)
                .setIssuer(zoomApiKey)
                .setIssuedAt(creation)
                .setSubject("")
                .setExpiration(tokenExpiry)
                .signWith(key, signatureAlgorithm)
                .compact();
    }
}
