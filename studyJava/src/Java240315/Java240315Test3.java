package Java240315;

public class Java240315Test3 {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        // 특수문자 제외
        String str = "This is a really simple sentence!!!";
        String str2 = str.replace(" ", "");
        str2 = str2.toLowerCase();
        char[] charArray = str2.toCharArray(); // 원본
        char[] charCheck = new char[]{'a','e','i','o','u'}; // 비교

        int cnt1 = 0, cnt2 = 0;
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] < 'a' || charArray[i] > 'z') continue; // 특수문자 제외
            cnt2++;
            for (int j=0; j<charCheck.length; j++) {
                if (charArray[i] == charCheck[j]) {
                    cnt1++;
                }
            }
        }
        System.out.println("모음의 갯수는 "+cnt1+"개"); // 10개
        System.out.println("자음의 갯수는 "+(cnt2-cnt1)+"개");
        System.out.println();

//        // [선생님 코드]
//        int vCount = 0, cCount = 0;
//        str = str.toLowerCase();
//        for (int i=0; i<str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') cCount++;
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') vCount++;
//        }

        System.out.println("모음의 갯수는 "+cCount+"개"); // 10개
        System.out.println("자음의 갯수는 "+(vCount-cCount)+"개"); // 27-10개

    }
}
