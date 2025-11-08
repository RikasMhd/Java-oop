public class TestAnimal{
	public static void main (String args[]){
		Animal C1=new Cat("Kitty");
		Dog A1=new Dog("Tiger");
		BigDog D1=new BigDog("Puppy");
		
		A1.greets((Dog)A1);
		
		C1.greets();
		
		D1.greets();
		
		D1.greets((Dog)A1);
		
		D1.greets((BigDog)D1);
		
	}
}

