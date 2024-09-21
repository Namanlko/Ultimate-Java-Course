// Quick Quiz 2: Overload the Employee constructor to iniltilize the salary to Rs 10,000.

class HelloEmployee{
    
    int salary;
    String name;

    // Constuctor Overloading
    public HelloEmployee(){
        salary = 10000;
        name = "New Employee";
    }

    public HelloEmployee(String name){
        this.name = name;
    }

    public HelloEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void getSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

}

public class QuickQuiz2 {
    public static void main(String[] args) {
        
        HelloEmployee emp1 = new HelloEmployee();
        HelloEmployee emp2 = new HelloEmployee("Angela Yu");
        HelloEmployee emp3 = new HelloEmployee("Angela Yu",23000);

        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());

        System.out.println(emp2.getName());
        System.out.println(emp2.getSalary());

        System.out.println(emp3.getName());
        System.out.println(emp3.getSalary());

    }
}
