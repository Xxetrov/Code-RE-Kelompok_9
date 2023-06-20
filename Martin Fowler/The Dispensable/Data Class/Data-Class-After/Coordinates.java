class Coordinates{
  
  private int x, y;

  public Coordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  
  public String getAllCoordinates(){
    return x + " " + y ;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }
  public static double getDistance(Coordinates a, Coordinates b){
    int delta_X = Math.abs(b.getX() - a.getX());
    int delta_Y = Math.abs(b.getY() - a.getY());
    return Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));
  }
}