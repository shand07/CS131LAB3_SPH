
public class ListApp 
{

	public static void main(String[] args) 
	{
		Square mySquare = new Square(2.0);
		
		PointThreeD myPoints = new PointThreeD(3.5, 4.5, 5.5);
		
		String myString = new String("Hello!");
		
		ArrayList<String> stringList = new ArrayList<String>(1);
		
		ArrayList<Square> squareList = new ArrayList<Square>(1);
		
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(1);
		
		System.out.println("Does my square array have a square? " +squareList.addItem(mySquare));
		
		System.out.println("Does my point array have points? " +pointList.addItem(myPoints));
		
		System.out.println("Does my string array have a string? " +stringList.addItem(myString));
		
		stringList.toString();
		
		squareList.toString();
		
		pointList.toString();
		
		
	}

}
