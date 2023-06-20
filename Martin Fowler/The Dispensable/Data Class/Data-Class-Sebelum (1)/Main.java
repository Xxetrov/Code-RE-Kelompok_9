import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Coordinates> coordinates = new ArrayList<Coordinates>();

    coordinates.add(new Coordinates(5, 3));
    coordinates.add(new Coordinates(16, 10));

    int delta_X = Math.abs(coordinates.get(1).getX() - coordinates.get(0).getX());
    int delta_Y = Math.abs(coordinates.get(1).getY() - coordinates.get(0).getY());
    double distance = Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));
    System.out.print(distance);
  }
}