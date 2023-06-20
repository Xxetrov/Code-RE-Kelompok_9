
public class Class {

public void calc(String shapeType, int side, int width) {
    
    double area = 0;
    

    
    if (shapeType == "Square") {
        
        area = side * side;
        
    } else if (shapeType == "Rectangle") {
        
        area = side * width;
        
    } else if (shapeType == "Circle") {
        
        area = 3.14 * side *side;
        
    }

    
    System.out.println("Area of " + shapeType + " : " + area);
}

class Main {
    public  void main(String[] args) {
        // initializing variables
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        // getting areas
        calc("Square", squareSide, 0);
        calc("Rectangle", rectangleWidth, rectangleHeight);
        calc("Circle", circleRadius, 0);
    }
}

}
