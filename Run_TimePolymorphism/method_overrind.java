package Run_TimePolymorphism;

public class method_overrind {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// parent and child classes both contain the same
//  function with a different defination
 
class Animal{
    void eat(){
        System.out.println("eats anything");
    }

}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating");
    }
}
