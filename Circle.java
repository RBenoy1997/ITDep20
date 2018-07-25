import java.util.*;
class circ
{
  double radius;
  void area()
  {
    double Area;
    Area=3.14*radius*radius;
    System.out.println("Area is:" + Area);
  }
  void circumference()
  {
    double Circumference;
    Circumference=2*3.14*radius;
    System.out.println("Circumference is:" + Circumference);
  } 
}
class Circle
{
  public static void main(String args[])
  {
    circ Circ1=new circ();
    Scanner c=new Scanner(System.in);
    System.out.println("Enter Radius:");
    Circ1.radius=c.nextInt();
    Circ1.area();
    Circ1.circumference();
  }
}
    
    