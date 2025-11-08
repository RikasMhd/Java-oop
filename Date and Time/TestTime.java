public class TestTime{
	public static void main(String []args){
		Time t1=new Time();
		Time currTime=new Time(23,59,60);
		System.out.print(currTime.newTime());
	}
}

