public class Account{
	private String id;
	private String name;
	private double balance=0;
	public Account(String id,double balance,String name){
		this.id=id;
		this.balance=balance;
		this.name=name;
	}
	public String getId(){
		return this.id;
	}
	public double getBalance(){
		return this.balance;
	}
	public Account credit(double amount){
		this.balance+=amount;
		return this;
	}
	public Account debit(double amount){
		if(balance>0){
			this.balance-=amount;
		}
		else{
			System.out.print("Balance exceeded");
		}
		return this;
	}
	public Account toTransfer(double amount){
		if(balance>=amount){
			this.balance-=amount;
		}
		else{
			System.out.print("Balance exceeded");
		}
		return this;
	}
	public String toString(){
		return "Name is "+this.name+"\nId is "+this.id+"\nBalance is "+this.balance;
	}
	public static void main(String [] args){
		Account a=new Account("Rks",1500,"Rikas");
		System.out.println(a.toString());
		System.out.println("");
		System.out.println("After Credit 500");
		a.credit(500);
		System.out.println(a.toString());
		System.out.println("");
		System.out.println("After debit 240");
		a.debit(240);
		System.out.println(a.toString());
		System.out.println("");
		System.out.println("After transfer 200");
		a.toTransfer(200);
		System.out.println(a.toString());
		
	}
}