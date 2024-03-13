public class Java240228Test {
    public static void main(String[] args) {

        System.out.println(2 + 3 / 2);       // 3
        System.out.println(10 % 3 + 5 / 3);  // 2
        System.out.println((4 + 5 / 2) % 4); // 2
        System.out.println();

//        int a = 5;
//        int b = a++; // b=5, a=6
//
//        System.out.println(a);         // 6
//        System.out.println(b);         // 5
//        System.out.println(++a);       // 7
//        System.out.println(++b);       // 6
//        System.out.println(a++ + --b); // 7 + 5 = 12
//        System.out.println(a + b);     // 8 + 5 = 13
//        System.out.println();

        System.out.println(5 & 3);     // 1
        System.out.println(5 | 3);     // 111 (4+2+1=7)
        System.out.println(5 ^ 3);     // 110 (4+2=6)
        System.out.println(~5);        // 11111010 (-(101+1)) => -(4+0+1+1) => -6
        System.out.println();

        System.out.println(7 << 2);    // 0b00000111 => 0b00011100 => (16+8+4+0+0=>28)
        System.out.println(7 >> 2);    // 0b00000111 => 0b00000001 => 1
        System.out.println(-7 << 2);   // 0b11111001 => 0b11100100 => -(11011 + 1) = -(16+8+0+2+1+1)=-28
        System.out.println(-7 >> 2);   // 0b11111001 => 0b11111110 => -2
        System.out.println(-1 >>> 30); // 0b11111111111111111111111111111111 => 0b00000000000000000000000000000011 => 3
        System.out.println(Integer.toBinaryString(-1));
        System.out.println();

        System.out.println(3 < 3);  // false
        System.out.println(5 >= 3); // true
        System.out.println(5 <= 5); // true
        System.out.println(5 == 5); // true
        System.out.println(5 != 5); // false
        System.out.println();

        System.out.println(false && true);       // false
        System.out.println((4 <= 4) || (6 < 3)); // true
        System.out.println(false ^ (3 >= 4));    // false
        System.out.println(!(3 <= 3));           // false
        System.out.println();

        int a = 3;
        int b = 5;
        int c = 7;
        System.out.println((a > b)? "안녕하세요":"반갑습니다");
        System.out.println((a < b) ? (b > c) ? "타입A":"타입B" :(b > c) ? "타입C":"타입D");
        System.out.println(true ? (b > c) ? "타입A":"타입B" :(b > c) ? "타입C":"타입D");
        System.out.println(true ? false ? "타입A":"타입B" : false ? "타입C":"타입D");
        System.out.println();

//        int a = 3;
//        a <<= 1;
//        System.out.println(a);
//        a &= 5;
//        System.out.println(a);
//        a -= 1;
//        System.out.println(a *= 2);
//        System.out.println();

//        int a = 4, b = 5, c = 6;
//        System.out.println(false && a-- > 6); // false
//        System.out.println();
//        System.out.println(true | b++ > 6);   // true
//        System.out.println(true | false);     // true
//        System.out.println();
//
//        System.out.println(true ^ c++ > 6);   // false
//        System.out.println(true ^ 7 > 6);     // false
//        System.out.println(true ^ true);      // false
//        System.out.println(true ^ false);     // false
//        System.out.println();
//
//        System.out.println(a);                // 4
//        System.out.println(b);                // 6
//        System.out.println(c);                // 7
//        System.out.println();

    }
}
