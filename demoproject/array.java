import java.util.*;
public class array {
    public static void main(String[] args) {
// 1D array

       /*  System.out.print("How many values you would like to enter: ");
        Scanner sc=new Scanner(System.in);
        int max= sc.nextInt();
        int marks[]=new int[max];
        for(int i=0; i<max; i++){
           System.out.print("Enter "+(i+1)+" value: ");
           marks[i]=sc.nextInt();
        }
        System.out.print("The number which you would like to search: ");
        int s=sc.nextInt();
        for (int i = 0; i < max; i++) {
          if (marks[i]==s) {
            System.out.println(s+" has the index value "+i);
          }
        }*/
//2D array
        Scanner sc=new Scanner(System.in);
        System.out.print("NUmebr of rows: ");
        int row=sc.nextInt();
        System.out.print("Number of columns: ");
        int col=sc.nextInt();
        int marks[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for(int j=0; j<col; j++){
                System.out.print("Enter values for "+(i+1)+" row: ");
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number you want to search for: ");
        int s=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for(int j=0; j<col; j++){
                if (marks[i][j]==s) {
                    System.out.println(s+" has indices ("+i+","+j+")");
                }
            }
        }
        sc.close();
    }
}
