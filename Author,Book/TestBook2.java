public class TestBook2
{
	public static void main (String args[])
	{
		Author2 auth=new Author2("Rikas","rriksd456@gamil","Male");
		Author2 auth2=new Author2("MAhriz","dhfsdbhcygh56@gamil","Male");
		Book2 myBook= new Book2("Shown",200,72,auth);
		System.out.println(myBook);
		
		
		System.out.println(myBook.getAuthor().getEmail());
		
	}
}
