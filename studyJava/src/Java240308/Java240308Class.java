package Java240308;

public class Java240308Class {
    public static void main(String[] args) {
        Students tom = new Students("Tome", 18, "Daejeon", "123456");
        Students steve = new Students("Steve", 25, "Seoul", "246810");
        Students paul = new Students();
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
        tom.displayAll();
        steve.displayAll();
        paul.displayAll();

        //System.out.println(tom.personalNum); // private 인 경우는 불가능
        System.out.println(tom.getPersonalNum()); // private 인 경우도 가능

        System.out.println();

        // 메소드 호출
        int[] numberList1 = {12, 34, 56, 32, 84, 99, 73, 69};
        int[] numberList2 = {123, 345, 235, 7898, 467};
        getSumAvg(numberList1);
        getSumAvg(numberList2);
    }

    public static void getSumAvg(int[] numberList) { // main 이 static 이기 때문에 메소드에도 static 으로 정의
        // 7. 아래 배열의 총합과 평균을 출력하시오.
        int intTotal = 0; // 총합을 위한 정수 변수
        float fAvg = 0.0f; // 평균을 위한 실수 변수

        for (int i=0; i<numberList.length; i++) {
            intTotal += numberList[i];
        }
        fAvg = (float)intTotal / (float)numberList.length;

        System.out.println("총합은 : "+intTotal);
        System.out.println("평균은 : "+fAvg);
    }
}
