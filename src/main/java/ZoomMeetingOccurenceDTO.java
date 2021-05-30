import java.io.Serializable;

public class ZoomMeetingOccurenceDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String occurrence_id;

    private String start_time;

    private Integer duration;

    private String status;

    public String getOccurrence_id() {
        return occurrence_id;
    }

    public void setOccurrence_id(String occurrence_id) {
        this.occurrence_id = occurrence_id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ZoomMeetingOccurenceDTO [duration=" + getDuration() + ", occurrence_id=" + getOccurrence_id() + ", start_time="
                + getStart_time() + ", status=" + getStatus() + "]";
    }
}