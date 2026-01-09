import java.util.*;
public class cond {
   public static void main(String[] args) {
    System.out.print("Enter your age: ");
    try (Scanner s= new Scanner(System.in)){
    int n= s.nextInt();
    if (n>=18) {System.out.println("Adult");
    }
    else{System.out.println("Minor");}}
}
}