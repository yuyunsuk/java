package Java240325;

public class Students {

    String stName;
    String stDepartment;
    int stID;

    public Students() {
    }

    public Students(String stName, String stDepartment, int stID) {
        this.stName = stName;
        this.stDepartment = stDepartment;
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public String getStDepartment() {
        return stDepartment;
    }

    public int getStID() {
        return stID;
    }

    public void setName(String stName) {
        this.stName = stName;
    }

    public void setDepartment(String stDepartment) {
        this.stDepartment = stDepartment;
    }

    public void setStudentId(int stID) {
        this.stID = stID;
    }

    @Override
    public String toString() {
        return this.stName + " " + this.stDepartment + " " + this.stID;
    }

}
