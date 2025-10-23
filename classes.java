// COMPILE-TIME POLIMORPHISM
// Funtion Overloading
class student{
    String name;
    int age;
    public void info(String name, int age){
        System.out.println("Name: " + name + "\nage: " + age);
    }
    public void info(String name){
        System.out.println("Name: " + name);
    }
    public void info(int age){
        System.out.println("Age: " + age);
    }
    }
    

public class classes{
    public static void main(String[] args) {
        student s1= new student();
        s1.name="jashan";
        s1.age=19;
        s1.info(s1.name, s1.age);
    }
        
}