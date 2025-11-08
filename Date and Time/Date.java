public class Date{
	private int year;
	private int month;
	private int day;
	
	public Date(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}
	
	public String currDate(){
		return "The current Date is "+(this.getYear()+"/"+this.getMonth()+"/"+this.getDay());
	}
	
	public void tmrwDate(){
		int tempYear=this.getYear();
		int tempMonth=this.getMonth();
		int tempDay=this.getDay();
		
		switch(tempMonth){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:{
				if(tempDay==31){
					tempDay=1;
					tempMonth=(tempMonth+1)%12;
					if(tempMonth==1){
						tempYear+=tempYear;
					}
				
				}
				else{
					tempDay=tempDay+1;
				}				
				
			}
			break;
			case 4:case 6 :case 9:case 11:{
				if(tempDay==30){
					tempDay=1;
					tempMonth=(tempMonth+1)%12;
					if(tempMonth==1){
						tempYear+=tempYear;
					}
				
				}
				else{
					tempDay=tempDay+1;
				}
			}
			break;
			case 2:
			if(tempYear%400==0 || tempYear%4==0 && tempYear%100!=0){
				if(tempDay==29){
					tempDay=1;
					tempMonth=(tempMonth+1)%12;
					if(tempMonth==1){
						tempYear+=tempYear;
					}
				}
				else{
					tempDay=tempDay+1;
				}
			}
			else{
				if(tempDay==28){
					tempDay=1;
					tempMonth=(tempMonth+1)%12;
					if(tempMonth==1){
						tempYear+=tempYear;
					}
				}
				else{
					tempDay=tempDay+1;
				}
			}
		}
		System.out.print("Tmrw Date is "+tempYear+"."+tempMonth+"."+tempDay);
	}
}