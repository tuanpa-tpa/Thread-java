public class ThreadSumNumber extends Thread {
    public int sum = 0;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            notify();
        }
    }
}
