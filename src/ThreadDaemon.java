public class ThreadDaemon implements Runnable {
    private Thread thread;

    @Override
    public void run() {
        System.out.println(thread.getName() + "begin");
        int i = 0;
        while (true) {
            System.out.println(thread.getName() + " " + i++ + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.setName("Daemon ");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
