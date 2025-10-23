// Hybrid Inheritance
class shape{
    public void area(){
        System.out.println("gives area");
    }
}
class triangle extends shape{
    public void area(int base, int height){
        System.out.println(1/2 * base * height);
    }
}// Multi level Inheritance
class equalateral extends triangle{
    public void area(int side){
        System.out.println(3 /4*side *side);
    }
}//Hierarchical Inheritance
class circle extends shape{
    public void area(int radius){
        System.out.println(3.14 * radius * radius);
    }
}

public class inhert {
    public static void main(String[] args) {}
    
}
