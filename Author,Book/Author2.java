public class Author2{
	private String name;
	private String email;
	private String gender;
	
	public Author2(String name,String email,String gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public String getGender(){
		return this.gender;
	}
	public String toString(){
		return "Author Name is "+getName()+".\nEmail is "+getEmail()+".\nGender is "+getGender();
	}
}