import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for "+i+" Index:");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        sc.close();
    System.out.println();
        /* bubble sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int t= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=t;
                }
            }
        }*/

        /*selection sort
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for(int j =i+1; j < arr.length; j++){
                if (arr[smallest]>arr[j]) {
                    smallest= j;
                }
                int t=arr[smallest];
                arr[smallest]= arr[i];
                arr[i]= t;
            }
        }*/
       // insertion sort
       for (int i = 1; i < arr.length; i++) {
        int current= arr[i];
        int j=i-1;
        while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
       }

        System.out.println("Sorted array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
