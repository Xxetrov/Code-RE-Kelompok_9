public void calc(int type, int side, int width) {
    // creates a new variable
    int area = 0;

    // check for shape types
    if (type == 1) {
        // square is side squared
        area = side * side;
    } else if (type == 2) {
        // rectangle is width times height
        area = side * width;
    } else if (type == 3) {
        // circle is pi times radius squared
        area = 3.14 * side * side;
    }

    // prints out the area for user
    System.out.println("Area of " + shapeType + " : " + area);
}

class Main {
    public static void main(String[] args) {
        // initializing variables
        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        // getting areas
        calc(1, squareSide, 0);
        calc(2, rectangleWidth, rectangleHeight);
        calc(3, circleRadius, 0);
    }
}
