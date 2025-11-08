public class Time1{
	private int hour;
	private int minute;
	private int second;
	
	public Time1(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour(){
		return this.hour;
	}
	public int getMinute(){
		return this.minute;
	}
	public int getSecond(){
		return this.second;
	}
	public String nowTime(){
		return "Now Time is "+getHour()+":"+getMinute()+":"+getSecond();
	}
	
	public void setHour(int hour){
		if(hour==24){
			this.hour=0;
		}
		else{
			this.hour+=hour;
		}
	}
	public void setMinute(int minute){
		if(minute==60){
			this.minute=0;
			this.hour+=hour;
		}
		else{
			this.minute+=minute;
		}
	}
	public void setSecond(int second){
		if(second==60){
			this.second=0;
			this.minute+=minute;
		}
		else{
			this.second+=second;
		}
	}
	public String newTime(){
		return "New Time is "+getHour()+":"+getMinute()+":"+getSecond();
	}
		
}