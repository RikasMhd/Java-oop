public class Book
{
	private String title;
    private Author author;
	private double price;
	private int pages;
	
	   public Book(String title,Author author,double price,int pages)
	   {
			this.title = title;
			this.author = author;
			this.price = price;
			this.pages = pages;
	   }
	   
	  public String getTitle()
		{
			return this.title;
		}
	  
	   public double getPrice()
		{
			return this.price;
		}
		public int getPages()
		{
			return this.pages;
		}
	   public void setTitle(String title)
		{
		   this.title = title;
		}
		public void setAuthor(Author author)
		{
		   this.author = author;
		}
		public void setPrice(double price)
		{
		   this.price = price;
		}
		public void setPages(int pages)
		{
		   this.pages = pages;
		}
		public String toString()
		{
			return "This Title is "+this.getTitle()+"."+author.toString()+".Price is "+this.getPrice()+".Pages are "+this.getPages();
		}
}