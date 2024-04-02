package Java240328;

public class LectureTeacher {
    String teacherId; // teacher ID
    String ltID; // 강의 ID
    public LectureTeacher() {
    }
    public LectureTeacher(String teacherId, String ltID) {
        this.teacherId = teacherId;
        this.ltID = ltID;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
    public String getLtID() {
        return ltID;
    }
    public void setLtID(String ltID) {
        this.ltID = ltID;
    }

    @Override
    public String toString() {
        return "LectureTeacher{" +
                "teacherId='" + teacherId + '\'' +
                ", ltID='" + ltID + '\'' +
                '}';
    }
}
