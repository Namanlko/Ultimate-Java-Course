// Question 1: Create a class Employee with the following properties and methods.

// salary (Property - int)
// getSalary (Method returning int)
// name (Property - String)
// getName (Method returning String)
// setName (Method changing name)

class Employee{
    
    public int salary = 45000;
    public String name;

    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class Question1{
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setName("Angela Yu");

        System.out.println("Employee Salary is "+emp.getSalary());
        System.out.println("Employee Name is "+emp.getName());


    }
}