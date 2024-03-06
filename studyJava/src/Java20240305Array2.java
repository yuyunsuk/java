import java.util.Arrays;

public class Java20240305Array2 {
    public static void main(String[] args) {
        // 기본자료형의 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b); // 3, 3
        b = 5;
        System.out.println(a + " " + b); // 3, 5
        System.out.println();

        // 참조자료형의 복사 ==> 참조복사 또는 주소복사
        int[] intList1 = {3,4,5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2));
        intList2[0] = 10;
        System.out.println(Arrays.toString(intList2));
        System.out.println(Arrays.toString(intList1));
        System.out.println();

        // 배열과 for 문의 사용
        // 조건식에 배열의 갯수를 사용
        for (int i=0; i<intList2.length; i++) {
            System.out.println(intList2[i]);
        }
        System.out.println();

        // char 배열과 String 은 틀림
        char[] charList = {'a','b','c'};
        String str1 = new String("abc");
        String str2 = "abc";

        // String 특징 1. 리터널형태로 값 변경시 새로운 메모리 위치에 생성!
        // (객체 안의 값을 변경하면 새로운 객체를 생성)
        String str11 = new String("안녕");
        String str12 = str11;
        System.out.println(str11);
        System.out.println(str12);
        if (str11 == str12) {
            System.out.println("주소는 같음");
        } else {
            System.out.println("주소는 틀림");
        }

        str11 = "안녕하세요";
        System.out.println(str11);
        System.out.println(str12);
        if (str11 == str12) {
            System.out.println("주소는 같음");
        } else {
            System.out.println("주소는 틀림");
        }
        System.out.println();

        // String 특징 2. 리터럴 형태로 생성시 동일한 값인 경우 메모리 주소를 공유
        // (리터럴을 바로 입력한 데이터는 문자열이 같을 때 하나의 객체를 공유)
        String str21 = new String("안녕");
        String str22 = "안녕";
        String str23 = "안녕";
        String str24 = new String("안녕");

        if (str21 == str22) {
            System.out.println("str21 와 str22의 주소는 같음");
        } else {
            System.out.println("str21 와 str22의 주소는 틀림");
        }

        if (str21 == str24) {
            System.out.println("str21 와 str24의 주소는 같음");
        } else {
            System.out.println("str21 와 str24의 주소는 틀림");
        }
        if (str22 == str23) {
            System.out.println("str22 와 str23의 주소는 같음");
        } else {
            System.out.println("str22 와 str23의 주소는 틀림");
        }
        System.out.println(str22.equals(str23)); // 문자열 자체를 비교하면 true

        // String 클래스의 첫번째 특징
        // 객체의 값을 변경하면 새로운 객체를 생성(주소값이 새로운 주소로 변경)
        // String 객체변수는 값이 수정되지 않고 항상 새로운 값을 만듬!!

        // String 클래스의 두번째 특징
        // 리터럴로 입력하는 경우, 해당 문자열을 재사용(=공유)함
        // 리터럴로 입력되는 값은 런타임 이전에 이미 메모리에 만들어짐

        // 문자열의 '+' 연산
        String a1 = "Hello";
        String a2 = "World";
        System.out.println(a1 + " " + a2);

        // 문자열과 숫자의 '+' 연산
        System.out.println(1 + "Hi"); // 1Hi
        System.out.println(1 + 2 + "Hi"); // 3Hi
        System.out.println("Hi" + 1 + 2); // Hi12
        System.out.println("Hi" + (1 + 2)); // Hi3

        double[] aa = {1.2, 3.4, 5.6};
        double[] bb = aa;
        bb[0] = 7.8;
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));

        int[] a3 = new int[]{1,2,3,4,5};
        for (int k : a3) {
            System.out.println(k);
        }

        String a9 = "방가";
        String b9 = new String("방가");
        String c9 = "방가";
        String d9 = new String("방가");
        String e9 = "방가";
        String f9 = new String("방가");

        System.out.println(a9 == b9);
        System.out.println(a9 == c9);
        System.out.println(a9 == d9);
        System.out.println(a9 == e9);
        System.out.println(a9 == f9);
        System.out.println();

        System.out.println(b9 == c9);
        System.out.println(b9 == d9);
        System.out.println(b9 == e9);
        System.out.println(b9 == f9);
        System.out.println();

        String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
        String name;
        String strAge;
        int age;

        name = str.substring(str.indexOf("[")+1, str.indexOf("]"));
        age = Integer.parseInt(str.substring(str.lastIndexOf("[")+1, str.lastIndexOf("]")));

        System.out.println(name);
        System.out.println(age);



    }
}
