package Java240327;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 1); // 3/0 ArithmeticException
            int a = Integer.parseInt("20"); // "20A" NumberFormatException

            int[] arr = {1, 2, 3, 4, 5};
            arr[5] = 6; // ArrayIndexOutOfBoundsException 발생

            System.out.println("프로그램 종료 try");
        } catch (ArithmeticException e) {
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료 catch");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } catch (NullPointerException e) {
            System.out.println("Null 관리 예외 처리");
        } catch (Exception e) {
            System.out.println("[기타 예외 처리] 예기치 못한 에러로 인하여 프로그램을 종료합니다.");
        } finally {
            // 보통 리소스 회수 목적으로 사용
            System.out.println("프로그램 종료 finally");
        }
        //System.out.println("여기가 실행될까?");

    }
}
