package Java240315;

public class Java240315Test1 {
    public static void main(String[] args) {

        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";
        String str2 = str.replace(" ", "");
        str2 = str2.toLowerCase();
        char[] charArray = str2.toCharArray(); // 원본
        char[] charCheck = new char[]{'a','e','i','o','u'}; // 비교

        int cnt1 = 0;
        for (int i=0; i<charArray.length; i++) {
            for (int j=0; j<charCheck.length; j++) {
                if (charArray[i] == charCheck[j]) {
                    cnt1++;
                }
            }
        }
        System.out.println("모음의 갯수는 "+cnt1+"개"); // 10개
        System.out.println("자음의 갯수는 "+(charArray.length-cnt1)+"개"); // 27-10개

    }
}
