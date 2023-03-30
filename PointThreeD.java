
public class PointThreeD 
{

	private double xPoint;
	
	private double yPoint;
	
	private double zPoint;
	
	public PointThreeD()
	{
		
	}
	
	public PointThreeD(double x, double y, double z)
	{
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
}
