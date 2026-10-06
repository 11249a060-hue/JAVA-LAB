class CountWorker implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        
        System.out.println(threadName + " (Priority: " + priority + ") has STARTED.");
        
        // A simple loop to simulate workload
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is processing step " + i);
        }
        
        System.out.println(threadName + " has FINISHED.");
    }
}

public class PriorityLoopExample {
    public static void main(String[] args) {
        // Create the low and high priority threads
        Thread low = new Thread(new CountWorker(), "LowThread");
        Thread high = new Thread(new CountWorker(), "HighThread");

        // Assign explicit priority values (1 and 10)
        low.setPriority(Thread.MIN_PRIORITY);  // 1
        high.setPriority(Thread.MAX_PRIORITY); // 10

        // Start both threads at the same time
        low.start();
        high.start();
    }
}
