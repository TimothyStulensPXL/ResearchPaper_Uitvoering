import java.io.Serializable;
import java.util.List;

public class ZoomMeetingsListResponseDTO implements Serializable {

    private static final long serialVersionUID = -218290644483495371L;

    private Integer page_size;

    private Integer page_number;

    private Integer page_count;

    public Integer total_records;

    public String next_page_token;

    public List<ZoomMeetingObjectDTO> meetings;

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public Integer getPage_number() {
        return page_number;
    }

    public void setPage_number(Integer page_number) {
        this.page_number = page_number;
    }

    public Integer getPage_count() {
        return page_count;
    }

    public void setPage_count(Integer page_count) {
        this.page_count = page_count;
    }

    public Integer getTotal_records() {
        return total_records;
    }

    public void setTotal_records(Integer total_records) {
        this.total_records = total_records;
    }

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public List<ZoomMeetingObjectDTO> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<ZoomMeetingObjectDTO> meetings) {
        this.meetings = meetings;
    }

    @Override
    public String toString() {
        return "ZoomMeetingsListResponseDTO [meetings=" + meetings + ", next_page_token=" + next_page_token
                + ", page_count=" + page_count + ", page_number=" + page_number + ", page_size=" + page_size
                + ", total_records=" + total_records + "]";
    }
}