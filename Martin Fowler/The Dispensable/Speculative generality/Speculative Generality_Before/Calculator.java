public class Calculator {
    public static void calculate(double num1, double num2, String operator) {
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else if (operator.equals("%")) {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid operator!");
        }
    }

    public static void main(String[] args) {
        Calculator.calculate(10, 5, "+"); // output: 15.0
        Calculator.calculate(10, 5, "-"); // output: 5.0
        Calculator.calculate(10, 5, "*"); // output: 50.0
        Calculator.calculate(10, 5, "/"); // output: 2.0
        Calculator.calculate(10, 5, "%"); // output: 0.0
        Calculator.calculate(10, 5, "$"); // output: Invalid operator!
    }
}
