// Constructors: Constructor is a member function used to initialize an object while creating it.

class MyEmployee{

    int id;
    String name;

    // Constructor of class MyEmployee
    public MyEmployee(){
        this.id = 5;
        this.name = "New Employee";
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

public class Constructors {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
