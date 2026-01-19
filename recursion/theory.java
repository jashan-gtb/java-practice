package recursion;
public class theory {
  /*   public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    } 

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int s= n+sum(n-1);
        return s;
    }
   public static int fact(int n){
    if (n==1) {
        return 1;
    }
        int f= n* fact(n-1);
        return f;
   }
  public static void fib(int a, int b, int n){
    if (n==0) {
        return;
    }
    int c=a+b;
    System.out.println(c);
    fib(b,c,n-1);
  }
    stack height = n
 public static int pow(int x, int n){
    if (n==0) {
        return 1;
    }
    if (x==0) {
        return 0;
    }
    int xpow= x* pow(x, n-1);
    return xpow;
 }*/

    //stack height logn
    public static int pow(int x, int n){
    if (n==0) {
        return 1;
    }
    if (x==0) {
        return 0;
    }
    if (n%2==0){
        return pow(x , n/2)* pow(x, n/2);
    }
    if (n%2!=0){
        return pow(x, n/2)* pow(x,n/2)* x;
    }
    return -1;
}
  
      public static void main(String[] args) {
        int x= 2;
        int n=3;
        int r= pow(x,n);
        System.out.println(r);
      }
}
