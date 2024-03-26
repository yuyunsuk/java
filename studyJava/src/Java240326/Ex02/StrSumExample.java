package Java240326.Ex02;

public class StrSumExample {
    // 문자열 "12345"의 각 자리에 있는 숫자를 더하는 코드를 완성하시오
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

// Case 1
//        System.out.println((int)str.charAt(0));

        for (int i=0; i<str.length(); i++) {
            sum = sum + ((int)str.charAt(i)) - '0';
            //sum = sum + ((int)str.charAt(i)) - 48;
        }

//// Case 2
//        for (int i=0; i<str.length(); i++) {
//            sum = sum + Character.getNumericValue(str.charAt(i));
//        }

//// Case 3
//        for (int i=0; i<str.length(); i++) {
//            sum = sum + Integer.valueOf(String.valueOf(str.charAt(i)));
//        }

        System.out.println("합계는 " + sum); // 15

    }
}
