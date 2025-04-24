public class APLine
{
  private int a; 
  private int b;
  private int c; 
  private double slope; 
  public APLine(int a1, int b1, int c1){
    a = a1; 
    b = b1; 
    c = c1; 
    slope = ((double)((-1)*a))/b;
  }
  public boolean isOnLine(int x, int y){
    if((a*x + b*y + c) == 0){
      return true; 
    }else{
      return false; 
    }
  }
  public double getSlope(){
    return slope; 
  }
}
