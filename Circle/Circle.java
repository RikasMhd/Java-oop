public class Circle implements GeomaticObject{
	protected double radius;
	
	public Circle(double radius){
		this.radius=radius;
	}
	@Override
	public String toString(){
		return "Circle Radius is "+this.radius;
	}
	@Override
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	@Override
	public double getPerimeter(){
		return 2*Math.PI*this.radius;
	}
}