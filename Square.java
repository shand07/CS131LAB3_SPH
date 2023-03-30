
public class Square 
{

	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + area + "]";
	}

	private double side;
	
	private double area = (side*side);
	
	public Square()
	{
		
	}
	
	public Square(double s)
	{
		side = s;
	}
	
	public double getArea()
	{
		return area;
	}
	
}
