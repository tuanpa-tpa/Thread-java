public class Thread1 implements Runnable {
    private Thread thread;

    @Override
    public void run() {
        System.out.println(thread.getName() + "begin");
        for (int i = 0; i < 15; i++) {
            System.out.println(thread.getName() + " " + i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(thread.getName() + "end");
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.setName("Thread 1 ");
            thread.start();
        }
    }
}
