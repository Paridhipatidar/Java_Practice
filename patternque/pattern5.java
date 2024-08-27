
class pattern5{
       public static void main(String args[]){
        for(int row=1;row<=2*5;row++){
            int totalcol;
            if(row<5)
            totalcol=row;
            else
            totalcol=(2*5)-row;
            for(int col=1;col<=totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
 }