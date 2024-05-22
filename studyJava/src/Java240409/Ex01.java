package Java240409;

class MyThread extends Thread {
    @Override
    public void run() {
        for(long i=0; i<100000000; i++) {
            for(long j=0; j<100; j++) {}
        }
        System.out.println(getName() + " 우선순위: " + getPriority());
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Thread curThread = Thread.currentThread();
        System.out.println(curThread.getName());
        System.out.println(Thread.activeCount());

        for(int i=0; i<3; i++) {
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
        }

        for(int i=0; i<3; i++) {
            Thread thread = new Thread();
            System.out.println(i + "번째 쓰레드");
            thread.start();
        }

        for(int i=0; i<3; i++) {
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
        }

        System.out.println(Thread.activeCount());

        System.out.println("테스트 시작!!!");

        System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());

        for(int i=0; i<3; i++) {
            Thread thread = new MyThread();
            thread.start();
        }

        try {Thread.sleep(1000);} catch (InterruptedException e) {}

        for(int i=0;i<10;i++) {
            Thread thread = new MyThread();
            thread.setName(i + "번째 쓰레드");
            if(i==9) thread.setPriority(10);
            thread.start();
        }

        System.out.println("테스트 종료!!!");

    }
}
