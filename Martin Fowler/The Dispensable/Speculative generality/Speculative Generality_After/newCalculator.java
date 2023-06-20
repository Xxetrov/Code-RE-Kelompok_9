public class newCalculator {
    public static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    public static void substract(double num1, double num2){
        System.out.println(num1 - num2);
    }
    public static void multiply(double num1, double num2){
        System.out.println(num1 * num2);
    }
    public static void divide(double num1, double num2){
        System.out.println(num1 / num2);
    }
    public static void modulo (double num1, double num2){
        System.out.println(num1 % num2);
    }   
   
    
    public static void main(String[] args) {
        newCalculator.add(10, 5); // output: 15.0
        newCalculator.substract(10, 5); // output: 5.0
        newCalculator.multiply(10, 5); // output: 50.0
        newCalculator.divide(10, 5); // output: 2.0
        newCalculator.modulo(10, 5); // output: 0.0
    }
}
