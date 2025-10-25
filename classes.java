// ABSTACTION
abstract class animal{
    abstract void walk();
}
class horse extends animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class classes{
    public static void main(String args[]){
        horse h= new horse();
        h.walk();
        chicken c= new chicken();
        c.walk();
        animal a= new animal(); // This line will cause an error because you cannot instantiate an abstract class
    }
}

