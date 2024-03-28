package Java240328;

public class Lecture {
    String ltID; // 강의 ID
    String ltName; // 강의 명칭
    String ltCategory; // 강의카테고리(사회,철학,교육 등)
    String ltGrade; // 강의단계(초급,중급,고급)
    String ltDataType; // 강의자료형태(동영상,음성파일 등)
    int ltDuration; // 강의시간
    int ltPrice; // 강의료

    public Lecture() {
    }

    public Lecture(String ltID, String ltName, String ltCategory, String ltGrade, String ltDataType, int ltDuration) {
        this.ltID = ltID;
        this.ltName = ltName;
        this.ltCategory = ltCategory;
        this.ltGrade = ltGrade;
        this.ltDataType = ltDataType;
        this.ltDuration = ltDuration;
    }

    public String getLtID() {
        return ltID;
    }

    public void setLtID(String ltID) {
        this.ltID = ltID;
    }

    public String getLtName() {
        return ltName;
    }

    public void setLtName(String ltName) {
        this.ltName = ltName;
    }

    public String getLtCategory() {
        return ltCategory;
    }

    public void setLtCategory(String ltCategory) {
        this.ltCategory = ltCategory;
    }

    public String getLtGrade() {
        return ltGrade;
    }

    public void setLtGrade(String ltGrade) {
        this.ltGrade = ltGrade;
    }

    public String getLtDataType() {
        return ltDataType;
    }

    public void setLtDataType(String ltDataType) {
        this.ltDataType = ltDataType;
    }

    public int getLtDuration() {
        return ltDuration;
    }

    public void setLtDuration(int ltDuration) {
        this.ltDuration = ltDuration;
    }

    public int getLtPrice() {
        return ltPrice;
    }

    public void setLtPrice(int ltPrice) {
        this.ltPrice = ltPrice;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "ltID='" + ltID + '\'' +
                ", ltName='" + ltName + '\'' +
                ", ltCategory='" + ltCategory + '\'' +
                ", ltGrade='" + ltGrade + '\'' +
                ", ltDataType='" + ltDataType + '\'' +
                ", ltDuration=" + ltDuration +
                '}';
    }

}
