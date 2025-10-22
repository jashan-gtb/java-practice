import java.util.*;//package
public class loop { //class
    public static void main(String[] args) { //function
         /*    System.out.print("Enter number: ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();      
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;}
            System.out.println("The sum of n numbers is "+sum);

        int num=12;
        do{System.out.println("loops");}
        while (num<=3);*/
        
// solid rectangle

      /*   for (int i = 0; i <=4; i++) {
            System.out.println();
            for (int j=0; j<=5; j++){
                System.out.print("* ");
            }
            }*/
 // hollow rectangle
       /*  for(int i=1; i<=4; i++){
            for(int j=1; j<=9; j++){
                if(j==1 || j==9 || i==1 || i==4){
                    System.out.print("*");
                }
                else {System.out.print(" ");}
            }
            System.out.println();
        }*/
// half pyramid   
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4; j++) {
                if (i==4 || j==1 || i==j) {
                    System.out.print("*");
                }
                else if(i==3 && j==2){
                    System.out.print("*");
                }
                else {System.out.print(" ");}
            }
            System.out.println();
        
         for (int i = 1; i <= 4; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }*/
// inverted half pyramid
       /*  for (int i = 4; i >=1 ; i--) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }*/
// inverted half pyramid 180 deg
      /*   for (int i = 1; i <=4; i++) {
            for(int j=1; j<=4; j++){
                if(i==4 || j==4 || i+j==5){
                    System.out.print("*");
                }
                else if(i==3 && j==3){
                    System.out.print("*");
                }
                else {System.out.print(" ");
                }

            }
            System.out.println();
        }
    
        for (int i = 1; i <=4 ; i++) {
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        
         System.out.println();}*/
// half pyramid numbers
        /*for (int i = 1; i <=5 ; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
// inverted half pyramid numbers
        /*for (int i = 5; i >=1 ; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }*/
        /*int c=1;
        
        for (int i = 1; i <=5 ; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }*/
       /* 
          for (int i = 1; i <=5 ; i++) {
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){System.out.print("1");}
                else{System.out.print("0");}
            }System.out.println();}*/
// pyramid   
    /*     Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }*/

  // Butterfly
       for (int i = 1; i <=4 ; i++) {
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }  
    for (int i = 4; i >=1 ; i--) {
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
//solid rohmbus
 /*    for (int i = 1; i <=5; i++) {
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=5-i; j++){
            System.out.print("*");
        }
        System.out.println();
        
    }*/
// number pyramdi
 /*   for (int i = 1; i <=5 ; i++) {
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        int c=0;
        for(int j=1; j<=i; j++){
            c+=1;
        }
        for(int j=1; j<=i; j++){
        System.out.print(c);}
        System.out.println();
    }*/
  /*  for (int i = 1; i <=5; i++) {
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        int c=0;
        for(int j=1; j<=i; j++){
            c+=1;
        }
        for(int j=1; j<=i; j++){
            System.out.print(c+" ");

        }
        System.out.println();
    }*/
  //palindrome
    /*  for(int i=1; i<=5; i++){
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        int c=i;
        for(int j=1; j<=i; j++){
            System.out.print(c);
            c-=1;
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
      }  */
  // diamond
    