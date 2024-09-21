// Access Modifiers in Java.

// Access Modifiers specifies where a property or method is accessible. There are four types of access modifiers in Java.

// 1) Private
// 2) Default
// 3) Protected
// 4) Public

class Employee{
    
    private int id;
    private String name;

    // Getter - For Getting Id
    public String getName(){
        return name;
    }

    // Getter - For Getting Id
    public int getId(){
        return id;
    }

    // Setter - For Setting Value of name variable
    public void setName(String name){
        this.name = name;
    }

    // Setter - For Setting Value of id variable
    public void setId(int id){
        this.id = id;
    }

}

public class AccessModifiers{
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(508);
        emp.setName("Angela Yu");

        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}