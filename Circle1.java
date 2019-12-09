
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{
   if(Math.sqrt(((this.center.x - other.center.x)*(this.center.x - other.center.x))  + 
				((this.center.y - other.center.y)*(this.center.y - other.center.y))) <=
				 (this.radius + other.radius))
      return true;
   return false;
}

}

