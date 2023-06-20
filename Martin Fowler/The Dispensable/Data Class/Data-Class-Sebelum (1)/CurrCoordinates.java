class Coordinates{
  
  private int x, y;

  Coordinates(int x, int y){
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
}