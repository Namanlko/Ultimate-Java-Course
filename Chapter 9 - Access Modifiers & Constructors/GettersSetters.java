// Getters and Setters in Java Class.

class School{
    int rno;
    String name;

    // Getters

    // 1) For Getting Roll No.
    public int getRno(){
        return rno;
    }
    
    // 2) For Getting Name.
    public String getName(){
        return name;
    }

    // Setters

    // 1) For Setting Roll No.
    public void setRno(int rno){
        this.rno =  rno;
    }
    
    // 2) For Setting Name.
    public void setName(String name){
        this.name = name;
    }

}

public class GettersSetters {
    public static void main(String[] args) {
        
        School sc = new School();

        sc.setRno(10);
        sc.setName("Angela Yu");

        sc.getName();
        sc.getRno();

    }
}
