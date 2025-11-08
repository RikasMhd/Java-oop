public class Point{
	private double x;
	private double y;
	int arr[]=new int[2];
	
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public Point(){}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public int [] getXY(){
		return arr;
	}
	public void setXY(int x,int y){
		arr[0]=x;
		arr[1]=y;
	}
	//Distance Between Given 2 Points
	public String getDistance(double x1,double y1){
		double dX=(this.x)-x1;
		double dY=(this.y)-y1;
		double dis=Math.sqrt((dX*dX)+(dY*dY));
		return "Distance between ("+this.getX()+","+this.getY()+") and ("+x1+","+y1+") is "+String.format("%.2f",dis);
		
	}
	//Distance From (0,0)
	public String getDistance(){
		double dX=(this.x);
		double dY=(this.y);
		double dis=Math.sqrt((dX*dX)+(dY*dY));
		return "Distance between ("+this.getX()+","+this.getY()+") and (0,0) is "+String.format("%.2f",dis);
	}
	
	public String getDistance(Point another){
		double dX=(this.x)-another.getX();
		double dY=(this.y)-another.getY();
		double dis=Math.sqrt((dX*dX)+(dY*dY));
		return "Distance between ("+this.getX()+","+this.getY()+") and ("+another.getX()+","+another.getY()+") is "+String.format("%.2f",dis);
	}
	
	
	
	
	
	
}