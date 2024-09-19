// OOP's Terminology in Java.

// 1) Abstraction: Abstraction means hiding internals details and showing only essentials inforamation that are required.
// Ex: We are using the phone without bothering about how it was made.

// 2) Encapsulation: Encapsulation is an act of putting various components together (in a single capsule).
// Ex: Like laptop is single entity with Wifi, Speaker, Storage in a Single Box.

// 3) Inheritance: Inheritance is an act of deriving new things from existing things.
// Ex: Rickshaw -> E-Rickshaw, Phone -> Smart Phone.

// 4) Polymorphism: When an enity has different forms then it is called Polymorphism.
// Ex: Smart Phone -> Phone, Smart Phone -> Calculator.

// We have created a class named Employee.
class Employee{
    
    // Properties of Class:
    public int id;
    public String name;

    // Class Constructor: Used to assign values to the properties of class.
    Employee(){
        this.id = 0;
        this.name = "NA";
    }

    Employee(String name, int id){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

}

public class OopsTerminology {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();
        
        System.out.println("Employee 1 ID is "+emp1.getId());
        System.out.println("Employee 1 Name is "+emp1.getName());

        Employee emp2 = new Employee("Angela Yu",100);
        
        System.out.println("Employee 2 ID is "+emp2.getId());
        System.out.println("Employee 2 Name is "+emp2.getName());

    }
}
