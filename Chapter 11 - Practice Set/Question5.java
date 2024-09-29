// Question 5: Demonstrate ploymorphism using Monkey class from Question 3.

interface NewBasicAnimal{
    void Eat();
    void Sleep();
}

class NewMonkey{
    void Jump(){
        System.out.println("Jumping...");
    }
    void Bite(){
        System.out.println("Biting...");
    }
}

class NewHuman extends NewMonkey implements NewBasicAnimal{

    public void Eat(){
        System.out.println("Eating...");
    }

    public void Sleep(){
        System.out.println("Sleeping...");
    }

}

public class Question5 {
    public static void main(String[] args) {
    
        NewMonkey obj1 = new NewHuman(); //Here we are taking reference of NewMonkey Class means we can use NewHuman as NewMonkey Only!!
        obj1.Bite();
        obj1.Jump();

        NewBasicAnimal obj2 = new NewHuman(); //Here we are taking reference of NewBasicAnimal interface means we can use NewHuman as NewBasicAnimal Only!!
        obj2.Eat();
        obj2.Sleep();

        // This is called Polymorphism. As we are using NewHuman as NewMonkey and NewHuman as NewBasicAnimal depending upon the requirement.

    }    
}
