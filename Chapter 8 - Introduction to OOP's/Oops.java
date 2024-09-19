// 1) What is Object Oriented Programming?
// Object Oriented Programming tries to map code instructions with real world making the code short and easier to understand. Solving  a problem by creating objects is one of the most popular approaches in programming. This is called Object Oriented Programming

// 2) What is DRY in OOPs?
// DRY stands for Do Not Repeat Yourself. It focus on code resuability.

// 3) What is Class?
// A class is a blueprint for creating objects.

// 4) What is Object?
// An object is an instantiation of a class. When a class is defined, a template (info) is defined. Memory is allocated only after Object instantiation.


// Here we have created a class name Employee. It has two attributes id & name.
class Employee{
    int id;
    String name;
    
}

public class Oops{
    public static void main(String[] args) {
        // Here we have created an object emp of Employee Class.
        Employee emp = new Employee();
        
        emp.id = 522;
        emp.name = "Angela Yu";

        System.out.println("Employee Id is "+emp.id);
        System.out.println("Employee Name is "+emp.name);
    }
}