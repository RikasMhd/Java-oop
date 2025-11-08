public class Circle0{
	private double radius;
	private String colour;
	
	public Circle0(double radius,String colour)
	{
		this.radius=radius;
		this.colour=colour;
	}
	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public String getColour(){
		return this.colour;
	}
	public void setColour(String colour){
		this.colour=colour;
	}
	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}
	public String toString(){
		return "Radius is "+this.getRadius()+"\nColour is "+this.getColour();
	}
	
	
}
