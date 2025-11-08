public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius){
		super(radius);
	}
	@Override
	public String toString(){
		return "Circle Radius is "+super.radius;
	}
	@Override
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	@Override
	public void resize(int percent){
		super.radius*=(double)percent/100;
	}
	
}