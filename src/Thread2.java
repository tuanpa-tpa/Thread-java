public class Thread2 extends Thread {
    private Thread thread;

    @Override
    public void run() {
        System.out.println(thread.getName() + "begin");
        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName() + " " + i + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(thread.getName() + "end");
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.setName("Thread 2 ");
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
