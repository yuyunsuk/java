package Java240328;

public class LectureHistory {
    String ltDate;
    String ltTime;
    String ltID;
    String userID;
    int playDuration;

    public LectureHistory() {
    }

    public LectureHistory(String ltDate, String ltTime, String ltID, String userID, int playDuration) {
        this.ltDate = ltDate;
        this.ltTime = ltTime;
        this.ltID = ltID;
        this.userID = userID;
        this.playDuration = playDuration;
    }

    public String getLtDate() {
        return ltDate;
    }

    public void setLtDate(String ltDate) {
        this.ltDate = ltDate;
    }

    public String getLtTime() {
        return ltTime;
    }

    public void setLtTime(String ltTime) {
        this.ltTime = ltTime;
    }

    public String getLtID() {
        return ltID;
    }

    public void setLtID(String ltID) {
        this.ltID = ltID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getPlayDuration() {
        return playDuration;
    }

    public void setPlayDuration(int playDuration) {
        this.playDuration = playDuration;
    }

    @Override
    public String toString() {
        return "LectureHistory{" +
                "ltDate='" + ltDate + '\'' +
                ", ltTime='" + ltTime + '\'' +
                ", ltID='" + ltID + '\'' +
                ", userID='" + userID + '\'' +
                ", playDuration='" + playDuration + '\'' +
                '}';
    }
}
