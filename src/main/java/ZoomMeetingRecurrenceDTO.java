import java.io.Serializable;

public class ZoomMeetingRecurrenceDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer type;

    private Integer repeat_interval;

    private String weekly_days;

    private Integer monthly_day;

    private Integer monthly_week;

    private Integer monthly_week_day;

    private Integer end_times;

    private String end_date_time;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRepeat_interval() {
        return repeat_interval;
    }

    public void setRepeat_interval(Integer repeat_interval) {
        this.repeat_interval = repeat_interval;
    }

    public String getWeekly_days() {
        return weekly_days;
    }

    public void setWeekly_days(String weekly_days) {
        this.weekly_days = weekly_days;
    }

    public Integer getMonthly_day() {
        return monthly_day;
    }

    public void setMonthly_day(Integer monthly_day) {
        this.monthly_day = monthly_day;
    }

    public Integer getMonthly_week() {
        return monthly_week;
    }

    public void setMonthly_week(Integer monthly_week) {
        this.monthly_week = monthly_week;
    }

    public Integer getMonthly_week_day() {
        return monthly_week_day;
    }

    public void setMonthly_week_day(Integer monthly_week_day) {
        this.monthly_week_day = monthly_week_day;
    }

    public Integer getEnd_times() {
        return end_times;
    }

    public void setEnd_times(Integer end_times) {
        this.end_times = end_times;
    }

    public String getEnd_date_time() {
        return end_date_time;
    }

    public void setEnd_date_time(String end_date_time) {
        this.end_date_time = end_date_time;
    }

    @Override
    public String toString() {
        return "ZoomMeetingRecurrenceDTO [end_date_time=" + end_date_time + ", end_times=" + end_times
                + ", monthly_day=" + monthly_day + ", monthly_week=" + monthly_week + ", monthly_week_day="
                + monthly_week_day + ", repeat_interval=" + repeat_interval + ", type=" + type + ", weekly_days="
                + weekly_days + "]";
    }

}
