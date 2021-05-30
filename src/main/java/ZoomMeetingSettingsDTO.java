import java.io.Serializable;
import java.util.List;

public class ZoomMeetingSettingsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean host_video;

    private Boolean participant_video;

    private Boolean cn_meeting;

    private Boolean in_meeting;

    private Boolean join_before_host;

    private Boolean mute_upon_entry;

    private Boolean watermark;

    private Boolean use_pmi;

    private Integer approval_type;

    private Integer registration_type;

    private String audio;

    private String auto_recording;

    private String alternative_hosts;

    private Boolean close_registration;

    private Boolean waiting_room;

    List<String> global_dial_in_countries;

    List<ZoomGlobalDialInNumbersDTO> global_dial_in_numbers;

    private Boolean registrants_email_notification;

    private String contact_name;

    private String contact_email;

    private Boolean registrants_confirmation_email;

    private Boolean meeting_authentication;

    private String authentication_option;

    private String authenticated_domains;

    private String authentication_name;

    private Boolean show_share_button;

    private Boolean allow_multiple_devices;

    private String encryption_type;

    public List<ZoomInterpreterDTO> interpreters;

    public Boolean getHost_video() {
        return host_video;
    }

    public void setHost_video(Boolean host_video) {
        this.host_video = host_video;
    }

    public Boolean getParticipant_video() {
        return participant_video;
    }

    public void setParticipant_video(Boolean participant_video) {
        this.participant_video = participant_video;
    }

    public Boolean getCn_meeting() {
        return cn_meeting;
    }

    public void setCn_meeting(Boolean cn_meeting) {
        this.cn_meeting = cn_meeting;
    }

    public Boolean getIn_meeting() {
        return in_meeting;
    }

    public void setIn_meeting(Boolean in_meeting) {
        this.in_meeting = in_meeting;
    }

    public Boolean getJoin_before_host() {
        return join_before_host;
    }

    public void setJoin_before_host(Boolean join_before_host) {
        this.join_before_host = join_before_host;
    }

    public Boolean getMute_upon_entry() {
        return mute_upon_entry;
    }

    public void setMute_upon_entry(Boolean mute_upon_entry) {
        this.mute_upon_entry = mute_upon_entry;
    }

    public Boolean getWatermark() {
        return watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    public Boolean getUse_pmi() {
        return use_pmi;
    }

    public void setUse_pmi(Boolean use_pmi) {
        this.use_pmi = use_pmi;
    }

    public Integer getApproval_type() {
        return approval_type;
    }

    public void setApproval_type(Integer approval_type) {
        this.approval_type = approval_type;
    }

    public Integer getRegistration_type() {
        return registration_type;
    }

    public void setRegistration_type(Integer registration_type) {
        this.registration_type = registration_type;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getAuto_recording() {
        return auto_recording;
    }

    public void setAuto_recording(String auto_recording) {
        this.auto_recording = auto_recording;
    }

    public String getAlternative_hosts() {
        return alternative_hosts;
    }

    public void setAlternative_hosts(String alternative_hosts) {
        this.alternative_hosts = alternative_hosts;
    }

    public Boolean getClose_registration() {
        return close_registration;
    }

    public void setClose_registration(Boolean close_registration) {
        this.close_registration = close_registration;
    }

    public Boolean getWaiting_room() {
        return waiting_room;
    }

    public void setWaiting_room(Boolean waiting_room) {
        this.waiting_room = waiting_room;
    }

    public List<String> getGlobal_dial_in_countries() {
        return global_dial_in_countries;
    }

    public void setGlobal_dial_in_countries(List<String> global_dial_in_countries) {
        this.global_dial_in_countries = global_dial_in_countries;
    }

    public List<ZoomGlobalDialInNumbersDTO> getGlobal_dial_in_numbers() {
        return global_dial_in_numbers;
    }

    public void setGlobal_dial_in_numbers(List<ZoomGlobalDialInNumbersDTO> global_dial_in_numbers) {
        this.global_dial_in_numbers = global_dial_in_numbers;
    }

    public Boolean getRegistrants_email_notification() {
        return registrants_email_notification;
    }

    public void setRegistrants_email_notification(Boolean registrants_email_notification) {
        this.registrants_email_notification = registrants_email_notification;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public Boolean getRegistrants_confirmation_email() {
        return registrants_confirmation_email;
    }

    public void setRegistrants_confirmation_email(Boolean registrants_confirmation_email) {
        this.registrants_confirmation_email = registrants_confirmation_email;
    }

    public Boolean getMeeting_authentication() {
        return meeting_authentication;
    }

    public void setMeeting_authentication(Boolean meeting_authentication) {
        this.meeting_authentication = meeting_authentication;
    }

    public String getAuthentication_option() {
        return authentication_option;
    }

    public void setAuthentication_option(String authentication_option) {
        this.authentication_option = authentication_option;
    }

    public String getAuthenticated_domains() {
        return authenticated_domains;
    }

    public void setAuthenticated_domains(String authenticated_domains) {
        this.authenticated_domains = authenticated_domains;
    }

    public String getAuthentication_name() {
        return authentication_name;
    }

    public void setAuthentication_name(String authentication_name) {
        this.authentication_name = authentication_name;
    }

    public Boolean getShow_share_button() {
        return show_share_button;
    }

    public void setShow_share_button(Boolean show_share_button) {
        this.show_share_button = show_share_button;
    }

    public Boolean getAllow_multiple_devices() {
        return allow_multiple_devices;
    }

    public void setAllow_multiple_devices(Boolean allow_multiple_devices) {
        this.allow_multiple_devices = allow_multiple_devices;
    }

    public String getEncryption_type() {
        return encryption_type;
    }

    public void setEncryption_type(String encryption_type) {
        this.encryption_type = encryption_type;
    }

    public List<ZoomInterpreterDTO> getInterpreters() {
        return interpreters;
    }

    public void setInterpreters(List<ZoomInterpreterDTO> interpreters) {
        this.interpreters = interpreters;
    }

    @Override
    public String toString() {
        return "ZoomMeetingSettingsDTO [allow_multiple_devices=" + allow_multiple_devices + ", alternative_hosts="
                + alternative_hosts + ", approval_type=" + approval_type + ", audio=" + audio
                + ", authenticated_domains=" + authenticated_domains + ", authentication_name=" + authentication_name
                + ", authentication_option=" + authentication_option + ", auto_recording=" + auto_recording
                + ", close_registration=" + close_registration + ", cn_meeting=" + cn_meeting + ", contact_email="
                + contact_email + ", contact_name=" + contact_name + ", encryption_type=" + encryption_type
                + ", global_dial_in_countries=" + global_dial_in_countries + ", global_dial_in_numbers="
                + global_dial_in_numbers + ", host_video=" + host_video + ", in_meeting=" + in_meeting
                + ", interpreters=" + interpreters + ", join_before_host=" + join_before_host
                + ", meeting_authentication=" + meeting_authentication + ", mute_upon_entry=" + mute_upon_entry
                + ", participant_video=" + participant_video + ", registrants_confirmation_email="
                + registrants_confirmation_email + ", registrants_email_notification=" + registrants_email_notification
                + ", registration_type=" + registration_type + ", show_share_button=" + show_share_button + ", use_pmi="
                + use_pmi + ", waiting_room=" + waiting_room + ", watermark=" + watermark + "]";
    }
}
