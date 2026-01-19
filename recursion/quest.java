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

        // MOVE ALL 'x' TO THE END OF THE STRING
   /*public static void move(String str, int ind, char element, String newstr, String newstr2){
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
   }*/
   
     // REMOVE DUPLICATES
    /*public static boolean[] map= new boolean[26];
    public static void dup(String str, int ind, String newstr){
        if (ind== str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar= str.charAt(ind);
        if (map[currentchar-'a']== true) {
            dup(str, ind+1, newstr);
        }
        else{
            newstr= newstr+ currentchar;
            map[currentchar-'a']= true;
            dup(str, ind+1, newstr);
        }
    }*/

        // SUBSEQUENCES OF A STRING
    /*public static void seq(String str, int ind, String newstr){
        if (ind==str.length()) {
            System.out.println(newstr);
            return;
        }
        char currentchar= str.charAt(ind);
        //to be
        seq(str, ind+1, newstr+ currentchar);
        //not to be
        seq(str, ind+1, newstr);
    }*/

        // PRINT KEYPAD COMBINATIONS
    public static String[] key= {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void printcomb(String str, int ind, String combination){
        if (ind == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentchar= str.charAt(ind);
        String map=key[currentchar-'0'];
        for (int i = 0; i < map.length(); i++) {
            printcomb(str, ind+1, combination+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str= "45";
        printcomb(str, 0, "");
    }
}
