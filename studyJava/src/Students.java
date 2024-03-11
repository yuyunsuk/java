public class Students {
    // 필드 영역
    private String name;
    private int age;
    private String address;
    private String personalNum; // 주민번호

    // 생성자 영역
    // 생성자는 보통 2개를 사용, 입력이 없는 생성자와, 입력이 있는 생성자
    public Students() { // 기본생성자
    }
    // 생성자
    public Students(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter : 읽어오는 역할, 반드시 리턴(호출한 사람에게 주는 것)이 있음, 괄호가 비어있는 이유는 이미 있는 자료를 읽어 리턴
    // Setter : 저장하는 역할, 괄호에는 바꿔야할 값을 받아야 함, 매개변수(parameter)
    public String getName() { // String 으로 리턴
        return name;
    }
    public void setName(String name) { // 리턴값이 없음
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }
    // Setter 값을 막거나 없앰
//    public void setPersonalNum(String personalNum) {
//        this.personalNum = personalNum;
//    }

    // 메소드 영역(계산 또는 실행하기 위한 기능 수행)
    public void displayName() { // 메소드
        System.out.println("성명 : "+this.name);
    }
    public void displayAge() { // 메소드
        System.out.println("나이 : "+this.age);
    }
    public void displayAddress() { // 메소드
        System.out.println("주소 : "+this.address);
    }
    public void displayAll() { // 메소드
        System.out.println("전체 : "+this.name+" "+this.age+" "+this.address);
    }



}
