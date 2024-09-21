

class ExceptionHandlingDemo {

  
    public static void riskyMethod() throws Exception {
        System.out.println("Inside riskyMethod...");
      
        throw new Exception("An error occurred!");
    }

    public static void main(String[] args) {
        try {
           
            riskyMethod();
        } catch (Exception e) {
           
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            
            System.out.println("This is the finally block.");
        }
    }
}
