public class Teacher extends Person{
	private int numCourses=0;
	private String courses[];
	
	public Teacher(String name,String address){
		super(name,address);
		courses=new String[5];
	}
	@Override
	public String toString(){
		return super.toString();
	}
	public boolean addCourse(String course){
		for(int i=0;i<numCourses;i++){
			if(courses[i]==course){
				return false;
			}
		}
		courses[numCourses]=course;
		return true;	
	}
	public boolean removeCourses(String courses){
		for(int i=0;i<numCourses;i++){
			if(courses[i].equals(removeToCourse)){
				for(int j=i;j<numcourses-1;j++){
					courses[j]=courses[j+1];
				}
				numCourses--;
				return true;
				
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		Teacher t1=new Teacher("Rikas","y.ahamed School Road,Valaichenai-05");
		t1.addCourse("Maths");
		t1.addCourse("Biology");
		System.out.println(t1);
		
		
	}
	
}