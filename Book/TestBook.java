public class TestBook
{
	public static void main (String args[])
	{
		Author author = new Author("Morgan","morgan@gmail.com",'M');
		Book myBook= new Book("Shown",author,200.00,72);
		
		System.out.println(myBook.getName());
		
		
		
	}
}
