package Java240328;

import java.time.LocalDate;

public class User {
    String userId; // User ID
    private String password; // User 비밀번호
    LocalDate birthDate; // 생일
    private String userGrade; // User 등급 (강의수강자, 강의자, 관리자)
    String userName; // User 이름
    String userTel; // User 전화
    String userEmail; // User 이메일
    String userAddress; // User 주소
    String userGender; // User 성별
    int userAge; // User 나이

    public User() {
    }

    public User(String userId, String userName, String userTel, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userTel = userTel;
        this.userEmail = userEmail;
    }

    public User(String userId, String userName, String userTel, String userEmail, String userAddress, String userGender, int userAge, LocalDate birthDate) {
        this.userId = userId;
        this.userName = userName;
        this.userTel = userTel;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userGender = userGender;
        this.userAge = userAge;
        this.birthDate = birthDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userBirthDate=" + birthDate.toString() +
                '}';
    }

}
