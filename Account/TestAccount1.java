public class TestAccount1{
	public static void main (String [] args){
		Account1 acc1=new Account1("R12","Rikas",1200);
		Account1 acc2=new Account1("R42","Shaaa",500);
		
		System.out.println(acc1);
		System.out.println("Rikas tranfer Shaa 1200");
		acc1.toTransfer(acc2,1200);
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println("Shaa tranfer Rikas 200");
		acc2.toTransfer(acc1,200);
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println("Rikas tranfer Shaa 0");
		acc1.toTransfer(acc2,0);
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println(" Credit Amount 200 for acc1");
		acc1.credit(200);
		System.out.println(acc1);
		System.out.println(" Credit Amount 200 for acc2");
		acc2.credit(200);
		System.out.println(acc2);
		
		
	}
}