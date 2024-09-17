// Methods using Object Creation of Class

public class MethodsUsingObject {

    // Method Declaration without using static keyword.
    public void Hello(){
        System.out.println("Hello Methods!!");
    }

    public static void main(String[] args) {
        MethodsUsingObject obj = new MethodsUsingObject(); // Object Creation.
        obj.Hello(); // Here we are calling method with the help of object of class.
    }
}
