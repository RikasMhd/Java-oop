public class TestPoint{
	public static void main(String [] args){
		Point p1=new Point(5,4);
		// Point p2=new Point(6,1);
		Point p3=new Point();
		p3.setX(9);
		p3.setY(4);
		System.out.println("From p1 to p2:");
		System.out.println(p1.getDistance(6,1));
		System.out.println("From p2 to (0,0):");
		System.out.println(p1.getDistance());
		// System.out.println("From p1 to (0,0):");
		// System.out.println(p2.getDistance());
		System.out.println("From p1 to Another Point:");
		System.out.println(p1.getDistance(p3));
		
		
		
	}
}