
class pattern9{
    public static void main(String args[]){
        int originalN=4;
        int n=2*4;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
             int ateveryindex= originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
              System.out.print(ateveryindex+" ");
            }
             System.out.println();
        }
    }
}