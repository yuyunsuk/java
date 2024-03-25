package Java240325;

public class Example {
    public static void main(String[] args) {
        // 첫번째 미션
        // 아래 코드가 실행될 수 있도록 Students 클래스를 완성하시오.
        // 힌트 : 세터메서드를 만들어야함. toString()는 오버라이딩 필요.
        Students students0 = new Students();
        students0.setName("Steve");
        students0.setDepartment("Physics");
        students0.setStudentId(10001);
        System.out.println(students0.toString()); // Steve, Physics, 10001\
        System.out.println();

        // 두번째 미션
        // 아래 메서드를 완성하시오.
        // 주어진 배열을 이용하여 Students 타입의 배열을 만들고 출력
        createStudentsInfo();

    }

    public static void createStudentsInfo() {
        String[] names = {"Steve", "tom", "Laura", "Susie"};
        String[] departments = {"Physics", "Computer", "English", "Law"};
        int[] studentsIds = {10001, 10002, 10003, 10004};

        // 데이터베이스의 raw data(가공하지 않은 순수 데이터)를
        // Students 객체형태로 만들고 이를 배열에 담는다.

//        Students st1 = new Students();
//        Students st2 = new Students();
//        Students st3 = new Students();
//        Students st4 = new Students();
//
//        Students[] stArrayList = {st1, st2, st3, st4};
//
//        for (int i=0; i<stArrayList.length; i++) {
//            stArrayList[i].setName(names[i]);
//            stArrayList[i].setDepartment(departments[i]);
//            stArrayList[i].setStudentId(studentsIds[i]);
//
//            System.out.println(stArrayList[i].toString());
//        }

        Students[] stArrayList = new Students[names.length];

        for (int i=0; i<stArrayList.length; i++) {
            stArrayList[i] = new Students();
            stArrayList[i].setName(names[i]);
            stArrayList[i].setDepartment(departments[i]);
            stArrayList[i].setStudentId(studentsIds[i]);

            System.out.println(stArrayList[i].toString());
        }



    }
}
