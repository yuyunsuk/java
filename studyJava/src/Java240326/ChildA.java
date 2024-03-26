package Java240326;

public class ChildA implements A, B{ //public class ChildA extends Object implements A, B{
    @Override
    public void abc() {
        System.out.println("child of A");
    }

    @Override
    public void bcd() {
        System.out.println("child of B");
    }
}
