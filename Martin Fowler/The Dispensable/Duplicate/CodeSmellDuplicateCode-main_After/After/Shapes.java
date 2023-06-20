import java.util.Scanner;

public class Shapes{

    public int calculateSquareArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side length: ");
        int side = scanner.nextInt();

        scanner.close();
        return side * side;
    }

    public int calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        System.out.print("Enter height: ");
        int height = scanner.nextInt();

        scanner.close();
        return height * width;
    }

    public double calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = (double) scanner.nextInt();
        scanner.close();
        return 3.14 * radius * radius;
        
    }

//

    public void menu() {
        System.out.println("Menu\n========");
        System.out.println("1. Calculate Rectangle Area");
        System.out.println("2. Calculate Square Area");
        System.out.println("3. Calculate Circle Area");
        System.out.println("0. Exit");
        System.out.print("Input: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        do {
            if (input == 1) {
                System.out.println("The area of rectangle is "+calculateRectangleArea());
            } else if (input == 2) {
                System.out.println("The area of square is "+calculateSquareArea());
            } else if (input == 3) {
                System.out.println("The area of circle is "+calculateRectangleArea());
            }
            System.out.println("Menu\n========");
            System.out.println("1. Calculate Rectangle Area");
            System.out.println("2. Calculate Square Area");
            System.out.println("3. Calculate Circle Area");
            System.out.println("0. Exit");
            System.out.print("Input: ");

        } while (input != 0);

        scanner.close();
    }
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.menu();
    }
    
    
}

