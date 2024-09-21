// Constructor Overloading: Constructors can be overloaded just like other methods in Java.

class MyMainEmployee{

    int id;
    String name;

    // Constructor of class MyEmployee
    public MyMainEmployee(){
        this.id = 5;
        this.name = "New Employee";
    }

    public MyMainEmployee(String name){
        this.name = name;
    }

    public MyMainEmployee(String name,  int id){
        this.name = name;
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        
        MyMainEmployee emp1 = new MyMainEmployee();
        MyMainEmployee emp2 = new MyMainEmployee("Angela Yu");
        MyMainEmployee emp3 = new MyMainEmployee("Angela Yu",23);

        System.out.println(emp1.getId());
        System.out.println(emp1.getName());

        System.out.println(emp2.getName());

        System.out.println(emp3.getName());
        System.out.println(emp3.getId());

    }
}
