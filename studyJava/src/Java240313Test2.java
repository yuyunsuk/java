public class Java240313Test2 {
    public static void main(String[] args) {

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;

        int stringLen = string.replace(" ", "").length();

        System.out.println("문자열의 갯수는 : "+stringLen);

        char[] charArray = string.toCharArray();

        int cnt = 0;
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] == ' ') continue;
            cnt ++;
        }
        System.out.println("문자열의 갯수는 : "+ cnt);

        // [선생님 코드]
        int cnt1 = 0;
        for (int i=0; i<charArray.length; i++) {
            if (string.charAt(i) != ' ') {
                cnt1++;
            }
        }
        System.out.println("문자열의 갯수는 : "+ cnt1);

    }
}
