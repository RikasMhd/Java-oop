public class TestAuthor2{
	public static void main(String [] args){
		Book2 myBook=new Book2("Kanavuhal",150,200);
		Author2 aut1=new Author2("Mayiz","Rrikas341@gmail.com","Male",myBook);
		
		System.out.println(aut1);
		System.out.println(" ");
		
		System.out.println("The Book Name is "+aut1.getBook().getTitle());
		System.out.println("");
		
		aut1.setBook("dfgrev");
		System.out.println(aut1);
		
		
		
		
		
	}
}