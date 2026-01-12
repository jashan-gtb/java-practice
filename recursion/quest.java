package recursion;
public class quest {
    // TOWER OF HANOI
    /* 
    public static void towerofhanoi(int n, String src, String helper, String dest){
        if (n==1) {
            System.out.println("move disk "+ n+ " from "+ src+ " to "+ dest);
            return;
        }
        towerofhanoi(n-1, src, dest, helper);
        System.out.println("move disk "+ n+ " from "+ src+ " to "+ dest);
        towerofhanoi(n-1, helper, src, dest);
    }*/

        // REVERSE STRING
   /* public static void rev(String str, int ind){
        if (ind==0) {
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        rev(str, ind-1);}*/
        
        // 1st and  last occurance of a character
   /* static int first=-1;
    static int last=-1;
    public static void occ(String str, int ind, char element){
        if (ind==str.length()) {
            System.out.println("first occurance at "+ first);
            System.out.println("last occurance at "+ last);
            return;
        }
    
        int charAtIndex= str.charAt(ind);
        if (charAtIndex==element) {
            if (first==-1) {
                first=ind;
            }
            else{
                last=ind;
            }
        }
        occ(str, ind+1, element);
    }*/

        // CHECK IF ARRAY IS SORTED OR NOT
  /* public static boolean sort(int arr[], int ind){
    if (ind==arr.length-1) {
        System.out.println("array is sorted");
        return true;
    }
    if (arr[ind]> arr[ind+1]){
        return false;    
    }
    else{
        return sort(arr, ind+1);}
    }*/
   public static void move(String str, int ind, char element, String newstr, String newstr2){
    if (ind==str.length()) {
        newstr= newstr + newstr2;   
        System.out.println(newstr);
        return;
    }
    char currentchar= str.charAt(ind);
    if (currentchar!=element) {
      newstr= newstr + currentchar;  
    }
    else{
        newstr2= newstr2 + currentchar;
    }
    move(str, ind+1, element, newstr, newstr2);
   }
   
   
    public static void main(String[] args) {
        String str= "abacdeag";
        String newstr="";
        String newstr2="";
        move(str, 0, 'a', newstr, newstr2);
    }
}
