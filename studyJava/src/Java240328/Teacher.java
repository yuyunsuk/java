package Java240328;

import java.time.LocalDate;

public class Teacher {
    String teacherId; // teacher ID
    private String password; // teacher 비밀번호
    LocalDate birthDate; // 생일
    private String teacherGrade; // teacher 등급 (강의수강자, 강의자, 관리자)
    String teacherName; // teacher 이름
    String teacherTel; // teacher 전화
    String teacherEmail; // teacher 이메일
    String teacherAddress; // teacher 주소
    String teacherGender; // teacher 성별
    int teacherAge; // teacher 나이

    public Teacher() {
    }

    public Teacher(String teacherId, String teacherName, String teacherTel, String teacherEmail) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherTel = teacherTel;
        this.teacherEmail = teacherEmail;
    }

    public Teacher(String teacherId, String teacherName, String teacherTel, String teacherEmail, String teacherAddress, String teacherGender, int teacherAge, LocalDate birthDate) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherTel = teacherTel;
        this.teacherEmail = teacherEmail;
        this.teacherAddress = teacherAddress;
        this.teacherGender = teacherGender;
        this.teacherAge = teacherAge;
        this.birthDate = birthDate;
    }

    public String getteacherId() {
        return teacherId;
    }

    public void setteacherId(String teacherId) {
        teacherId = teacherId;
    }

    public String getteacherName() {
        return teacherName;
    }

    public void setteacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getteacherTel() {
        return teacherTel;
    }

    public void setteacherTel(String teacherTel) {
        this.teacherTel = teacherTel;
    }

    public String getteacherEmail() {
        return teacherEmail;
    }

    public void setteacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getteacherAddress() {
        return teacherAddress;
    }

    public void setteacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public String getteacherGender() {
        return teacherGender;
    }

    public void setteacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    public int getteacherAge() {
        return teacherAge;
    }

    public void setteacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String getteacherGrade() {
        return teacherGrade;
    }

    public void setteacherGrade(String teacherGrade) {
        this.teacherGrade = teacherGrade;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherTel='" + teacherTel + '\'' +
                ", teacherEmail='" + teacherEmail + '\'' +
                ", teacherAddress='" + teacherAddress + '\'' +
                ", teacherGender='" + teacherGender + '\'' +
                ", teacherAge=" + teacherAge +
                ", teacherBirthDate=" + birthDate.toString() +
                '}';
    }

}
