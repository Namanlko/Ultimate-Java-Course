// Question 3: Create a class Monkey with Jump() and Bite() methods. Create a class Human which inherits this Monkey class and inmplements BasicAnimal interface with eat() and sleep methods.

interface BasicAnimal{

    void Eat();
    void Sleep();

}

class Monkey{

    void Jump(){
        System.out.println("Jumping...");
    }

    void Bite(){
        System.out.println("Biting...");
    }

}

class Human extends Monkey implements BasicAnimal{

    public void Eat(){
        System.out.println("Eating...");
    }

    public void Sleep(){
        System.out.println("Sleeping...");
    }

}

public class Question3 {
    public static void main(String[] args) {
        
        Human h = new Human();
        h.Bite();
        h.Eat();
        h.Jump();
        h.Sleep();

    }
}
