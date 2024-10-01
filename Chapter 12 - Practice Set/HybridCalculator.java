package Calculators;

public class HybridCalculator{
    
    public static double sin(double angle) {
        return Math.sin(angle);
    }

    public static double cos(double angle) {
        return Math.cos(angle);
    }

    public static double tan(double angle) {
        return Math.tan(angle);
    }

    int Add(int a, int b){
        return a+b;
    }

    int Substract(int a, int b){
        return a-b;
    }

    int Multiply(int a, int b){
        return a*b;
    }

    int Divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("This is Hybrid Calculator!");
    }

}
