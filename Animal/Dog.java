public class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	@Override
	public void greets(){}
	public void greets(Dog another){
		System.out.println("Wooof");
	}
}