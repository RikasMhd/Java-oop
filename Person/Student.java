public class Student extends Person{
	private int numCourses=0;
	private String courses[];
	private int grades[];
	
	public Student(String name,String address){
		super(name,address);
		courses=new String[30];
		grades=new int[30];
	}
	@Override
	public String toString(){
		return super.toString();
	}
	public void addCourseGrades(String course,int grade){
		courses[numCourses]=course;
		grades[numCourses]=grade;
		numCourses++;
	}
	public void printGrades(){
		for(int i=0;i<numCourses;i++){
			System.out.println("");
			System.out.println("Course :"+courses[i]+" , "+"Grade :"+grades[i]);
		}
	}
	
	public double getAverageGrades(){
		int sum=0;
		double avg;
		for(int i=0;i<numCourses;i++){
			sum+=grades[i];
		}
		avg=(double)sum/numCourses;
		return avg;
	}
	
	
	public static void main(String [] args){
		Student s1=new Student("Rikas","y.ahamed School Road,Valaichenai-05");
		System.out.println(s1);
		s1.addCourseGrades("Maths",80);
		s1.addCourseGrades("Biology",56);
		s1.addCourseGrades("Chemistry",70);
		s1.addCourseGrades("Physics",67);
		s1.addCourseGrades("Gk",87);

		System.out.println("Print  Courses and Grades ");
		s1.printGrades();
		
		System.out.println("Average  is "+s1.getAverageGrades());
	}
}