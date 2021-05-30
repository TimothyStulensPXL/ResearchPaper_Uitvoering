import java.io.Serializable;
import java.util.List;

public class ZoomMeetingObjectDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String uuid;

    private String assistant_id;

    private String host_email;

    private String registration_url;

    private String topic;

    private Integer type;

    private String start_time;

    private Integer duration;

    private String schedule_for;

    private String timezone;

    private String created_at;

    private String password;

    private String agenda;

    private String start_url;

    private String join_url;

    private String h323_password;

    private Integer pmi;

    private ZoomMeetingRecurrenceDTO recurrence;

    private List<ZoomMeetingTrackingFieldsDTO> tracking_fields;

    private List<ZoomMeetingOccurenceDTO> occurrences;

    private ZoomMeetingSettingsDTO settings;

    @Override
    public String toString() {
        return "ZoomMeetingObjectDTO [" + "\n" +  "agenda=" + agenda + "\n" + "assistant_id=" + assistant_id + "\n" +  "created_at="
                + created_at + "\n" +  "duration=" + duration + "\n" +  "h323_password=" + h323_password + "\n" +  "host_email="
                + host_email + "\n" +  "id=" + id + "\n" +  "join_url=" + join_url + "\n" +  "occurrences=" + occurrences + "\n" +  "password="
                + password + "\n" +  "pmi=" + pmi + "\n" +  "recurrence=" + recurrence + "\n" +  "registration_url=" + registration_url
                + "\n" +  "schedule_for=" + schedule_for + "\n" +  "settings=" + settings + "\n" +  "start_time=" + start_time
                + "\n" +  "start_url=" + start_url + "\n" +  "timezone=" + timezone + "\n" +  "topic=" + topic + "\n" +  "tracking_fields="
                + tracking_fields + "\n" +  "type=" + type + "\n" +  "uuid=" + uuid + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssistant_id() {
        return assistant_id;
    }

    public void setAssistant_id(String assistant_id) {
        this.assistant_id = assistant_id;
    }

    public String getHost_email() {
        return host_email;
    }

    public void setHost_email(String host_email) {
        this.host_email = host_email;
    }

    public String getRegistration_url() {
        return registration_url;
    }

    public void setRegistration_url(String registration_url) {
        this.registration_url = registration_url;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSchedule_for() {
        return schedule_for;
    }

    public void setSchedule_for(String schedule_for) {
        this.schedule_for = schedule_for;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getStart_url() {
        return start_url;
    }

    public void setStart_url(String start_url) {
        this.start_url = start_url;
    }

    public String getJoin_url() {
        return join_url;
    }

    public void setJoin_url(String join_url) {
        this.join_url = join_url;
    }

    public String getH323_password() {
        return h323_password;
    }

    public void setH323_password(String h323_password) {
        this.h323_password = h323_password;
    }

    public Integer getPmi() {
        return pmi;
    }

    public void setPmi(Integer pmi) {
        this.pmi = pmi;
    }

    public ZoomMeetingRecurrenceDTO getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(ZoomMeetingRecurrenceDTO recurrence) {
        this.recurrence = recurrence;
    }

    public List<ZoomMeetingTrackingFieldsDTO> getTracking_fields() {
        return tracking_fields;
    }

    public void setTracking_fields(List<ZoomMeetingTrackingFieldsDTO> tracking_fields) {
        this.tracking_fields = tracking_fields;
    }

    public List<ZoomMeetingOccurenceDTO> getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(List<ZoomMeetingOccurenceDTO> occurrences) {
        this.occurrences = occurrences;
    }

    public ZoomMeetingSettingsDTO getSettings() {
        return settings;
    }

    public void setSettings(ZoomMeetingSettingsDTO settings) {
        this.settings = settings;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}