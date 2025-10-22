class student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(String name, int age){      // parameterised constructor
       /*object name*/ this.name= /*parameter name*/name;
        this.age= age;
    }
  /*   student(){
        System.out.println("Constructor call"); //Non parameterised constructor 
    }*/
}
public class classes{
    public static void main(String[] args) {
        student s1= new student("Jashan", 19);
        s1.info();

        student s2= new student("Shanky",19);
        s2.info();
    }
        
}