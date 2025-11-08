public class Account1{
	private String id;
	private String name;
	private double balance;
	
	public Account1(String id,String name,double balance){
		this.id=id;
		this.name=name;
		this.balance=balance;	
	} 
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public double credit(double amount){
		balance+=amount;
		return balance;
	}
	public double debit(double amount){
		if(balance>=amount){
			balance-=amount;
		}
		else{
			System.out.print("Balance Exceeded");
		}
		return balance;
	}
	public double toTransfer(Account1 another,double amount){
		if(balance>=amount){
			this.balance-=amount;
			another.balance+=amount;
		}
		else{
			System.out.print("Balance Exceeded");
		}
		return balance;
	}
	public String toString(){
		return "ID is "+getId()+"."+"Name is "+getName()+"."+"Balance is "+getBalance()+".";
	}
}