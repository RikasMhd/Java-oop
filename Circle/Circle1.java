public class  Circle1 extends Circle0{
	private int radius1;
	
	public Circle1(int radius1,double radius,String colour){
		super(radius,colour);
		this.radius1=radius1;
		
	}
	public int getRadius1(){
		return this.radius1;
	}
	
	public double distance(){
		double dis=getRadius()+(double)getRadius1();
		return dis;
	}
	@Override
	public String toString(){
		return super.toString()+"\nRadius1 is "+getRadius1()+"\nDistance is "+distance();
	}
	public static void main(String [] args){
		Circle1 c2=new Circle1(21,7,"blue");
		System.out.println(c2);
	}
}