class student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(student s2){    
       this.name =s2.name;
       this.age =s2.age;    //copy constructor
    }
    student(){
        //default constructor
    }
}
public class classes{
    public static void main(String[] args) {
        student s1= new student();
        s1.name="jashan";
        s1.age=19;
        student s2= new student(s1);
        s2.info();

        
    }
        
}