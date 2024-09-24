// Quick Quick: Create a class Animal and Derive another class Dog from it.

class Dog extends Animal{
    void Bark(){
        System.out.println("Barking....");
    }
}


class Animal{
    void Eat(){
        System.out.println("Eating....");
    }

    void Run(){
        System.out.println("Running....");
    }
}

public class QuickQuiz{
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.Eat();
        a.Run();

        Dog d = new Dog();
        d.Bark();
        d.Eat();
        d.Run();
        
    }
}