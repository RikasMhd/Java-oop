public class Book2
{
	private String title;
	private double price;
	private int pages;
	private Author2 author;
	
	   public Book2(String title,double price,int pages,Author2 author)
	   {
			this.title = title;
			this.price = price;
			this.pages = pages;
			this.author=author;
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
		public Author2 getAuthor(){
			return this.author;
		}
		public void setTitle(String title)
		{
		   this.title=title;
		}
		public void setPrice(double price)
		{
		   this.price=price;
		}
		public void setPages(int pages)
		{
		   this.pages=pages;
		}
		public void setAuthor(Author2 author)
		{
		   this.author=author;
		}
		public String toString()
		{
			return "This Title is "+this.getTitle()+".\nPrice is "+this.getPrice()+".\nPages are "+this.getPages()+".\nAuthor is "+getAuthor().getName();
		}
}