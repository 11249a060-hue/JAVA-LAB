Aim:
To create two threads with different priorities and display their execution steps.

Algorithm:
1. Create a CountWorker class implementing Runnable.
2. Create low-priority and high-priority threads.
3. Set priorities to 1 and 10.
4. Start both threads.
5. Display the thread name, priority, and processing steps.

 Program:   
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
        low.setPriority(Thread.MIN_PRIORITY);  
        high.setPriority(Thread.MAX_PRIORITY); 

        // Start both threads at the same time
        low.start();
        high.start();
    }
}

Output:
LowThread (Priority: 1) has STARTED.
HighThread (Priority: 10) has STARTED.
HighThread is processing step 1
LowThread is processing step 1
...
HighThread has FINISHED.
LowThread has FINISHED.

 Result:
Thus, two threads with different priorities were created and executed successfully.
