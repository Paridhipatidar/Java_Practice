
class patttern7{
    public static void main(String args[]){
        for(int row=1;row<=5;row++){
            for(int space=0;space<5-row;space++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--)
            System.out.print(col+" ");
            for(int col=2;col<=row;col++)
            System.out.print(col+" ");
            System.out.println();
        }
    }
}