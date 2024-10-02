public class ThreadJoin extends Thread {
    
    // This method will run when the thread starts
    public void run() {
        for (int j = 0; j < 2; j++) {
            try {
                // Sleep for 300 milliseconds
                Thread.sleep(300);
                // Print the current thread's name
                System.out.println("The current Thread is: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                // Handle interrupted exception
                System.out.println("Exception in thread: " + Thread.currentThread().getName() + " - " + e);
            }
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        // Create three threads
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();
        
        // Start t1 and join t1 with individual exception handling
        try {
            t1.start();
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught during t1 execution: " + e);
        }
        
        // Start t2 and join t2 with individual exception handling
        try {
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught during t2 execution: " + e);
        }
        
        // Start t3 and join t3 with individual exception handling
        try {
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Exception caught during t3 execution: " + e);
        }
        
        System.out.println("All threads have finished execution.");
    }
}


