import java.util.Scanner;

public void calculateSquareArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter side length: ");
    int side = scanner.nextInt();

    System.out.println("Area of square: " + side * side);
    scanner.close();
}

public void calculateRectangleArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter width: ");
    int width = scanner.nextInt();

    System.out.print("Enter height: ");
    int height = scanner.nextInt();

    System.out.println("Area of rectangle: " + height * width);
    scanner.close();
}

public void calculateCircleArea() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter radius: ");
    double radius = (double) scanner.nextInt();

    System.out.println("Area of circle: " +  3.14 * radius * radius);
    scanner.close();
}

//

public void menu() {
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Menu\n========");
        System.out.println("1. Calculate Rectangle Area");
        System.out.println("2. Calculate Square Area");
        System.out.println("3. Calculate Circle Area");
        System.out.println("0. Exit");
        System.out.print("Input: ");

        int input = scanner.nextInt();
        if (input == 1) {
            calculateRectangleArea();
        } else if (input == 2) {
            calculateSquareArea();
        } else if (input == 3) {
            calculateCircleArea();
        }
    } while (input != 0);

    scanner.close();
}

class Main {
    public static void main(String[] args) {
        menu();
    }
}