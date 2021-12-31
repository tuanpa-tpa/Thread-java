public class Main {

    public static void main(String[] args) {
        System.out.println("Main begin");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        ThreadDaemon t3 = new ThreadDaemon();
        ThreadSumNumber t4 = new ThreadSumNumber();
//        test luồng 1 sử dụng Runnable
        t1.start();
//        test luồng 2 sử dụng extend Thread ( sử dụng join - khi chạy xong luồng này thì luồng sau mới chạy)
        t2.start();
//        test luồng daemon ( sẽ kết thúc khi các luồng khác chạy xong)
        t3.start();
//        test luồng sử dụng notify and wait
        t4.start();
        synchronized (t4) {
            try {
                System.out.println("wait..");
                t4.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t4.sum);
        }
        System.out.println("Main end");
    }
}
