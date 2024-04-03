package Java240403;

interface EA {
    void abc(EB b, int k);
}

class EB {
    void bcd(int k) {
        System.out.println(k);
    }
}

public class Ex07 {
    public static void main(String[] args) {
        EA a = EB::bcd;
        //a.abc(3, 5.8);

        EB b = new EB();
        a.abc(b, 3);

    }
}
