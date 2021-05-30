public class ZoomApp {
    public static void main(String[] args) {
        CreateMeeting create = new CreateMeeting();
        ZoomMeetingObjectDTO zoomMeetingObjectDTO = new ZoomMeetingObjectDTO();
        create.createMeeting(zoomMeetingObjectDTO);
    }
}
