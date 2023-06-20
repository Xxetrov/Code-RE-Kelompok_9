package unnecessaryAbstraction.after;

public class Testing {
    void test(){
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);

        Square square = new Square(4.0);
        double squareArea = square.calculateArea();
        System.out.println("Square Area: " + squareArea);
    }
}
