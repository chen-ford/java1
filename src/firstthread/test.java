package firstthread;

public class test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
//        my.run();
        mt1.setName("线程1");
        mt2.setName("线程2");

        mt1.start();
        mt2.start();


    }
}
