package Java240327;

// 1. 사용자 일반 예외
class MyException extends Exception {
    public MyException () {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

// 2. 사용자 실행 예외
class MyRTException extends RuntimeException {
    public MyRTException () {
        super();
    }
    public MyRTException (String message) {
        super(message);
    }
}

class A {
    // 3. 사용자 정의 예외 객체 생성
//    MyException me1 = new MyException();
//    MyException me2 = new MyException("예외 메시지: MyException");
//
//    MyRTException mre1 = new MyRTException();
//    MyRTException mre2 = new MyRTException("예외 메시지: MyRTException");

    // 4. 예외 던지기(throw): 던진 시점에서 예외 발생
    // 방법 1: 예외를 직접 처리
    void abc_1(int num) {
        try {
            // 사용자가 만든 예외의 경우는 조건에 따라 사용자가 던짐.
            if (num > 70)
                System.out.println("정상 작동");
            else
                //throw me1; // 예외를 던진 시점에 예외 발생
                throw new MyException("나이가 70 이하임: " + num); // 이런 식으로 많이 사용됨
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("예외 처리 1");
        }
    }

    void bcd_1() {
        abc_1(65);
    }

    // 방법 2: 예외 전가
    void abc_2(int num) throws MyException {
        if (num > 70)
            System.out.println("정상 작동");
        else
            //throw me1; // 예외를 던진 시점에 예외 발생
            throw new MyException("예외전가 => 나이가 70이하임: " + num);
    }

    void bcd_2() {
        try {
            abc_2(65);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("예외 처리 2");
            e.printStackTrace();
        }
    }
}

public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();

    }
}