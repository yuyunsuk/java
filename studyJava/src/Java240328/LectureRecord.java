package Java240328;

public class LectureRecord {
    String userId;
    String ltID;
    String recordDate;
    String recodeTime;

    public LectureRecord() {
    }

    public LectureRecord(String userId, String ltID) {
        this.userId = userId;
        this.ltID = ltID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLtID() {
        return ltID;
    }

    public void setLtID(String ltID) {
        this.ltID = ltID;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public String getRecodeTime() {
        return recodeTime;
    }

    public void setRecodeTime(String recodeTime) {
        this.recodeTime = recodeTime;
    }

    @Override
    public String toString() {
        return "LectureRecord{" +
                "userId='" + userId + '\'' +
                ", ltID='" + ltID + '\'' +
                '}';
    }
}
