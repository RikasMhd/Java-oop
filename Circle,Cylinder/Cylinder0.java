public class Cylinder0 extends Circle0{
	private double height;
	
	public Cylinder0(){
		super();
		this.height=10;
	}
	public Cylinder0(double height,String colour){
		super(colour);
		this.height=height;
	}
	public Cylinder0(double height,double radius,String colour){
		super(radius,colour);
		this.height=height;
	}
	public double getHeight(){
		return this.height;
	}
	public void setHeight(){
		this.height=height;
	}
	public double getVolume(){
		return Math.PI*this.getHeight()*this.getRadius()*this.getRadius();
	}
	public String toString(){
		return "The Height is "+this.getHeight()+"\nRadius is "+this.getRadius()+"\nColour is "+this.getColour();
	}
}