public class ThreadPriorityExample extends Thread {

    // This method will run when the thread starts
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName() + 
                           " with priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        // Create three threads
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();
        
        // Set names for each thread
        th1.setName("Thread 1");
        th2.setName("Thread 2");
        th3.setName("Thread 3");
        
        // Set different priorities for each thread
        th1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        th2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        th3.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        
        // Start the threads
        th1.start();
        th2.start();
        th3.start();
    }
}

