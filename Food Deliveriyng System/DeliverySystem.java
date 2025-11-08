public class DeliverySystem {
    public static void main(String[] args) {
        // create a restaurent and menu
        Restaurant res=new Restaurant("Pizza Hut");

        res.menu.addItems(new FoodItem("Margherita",2,1400));
        res.menu.addItems(new FoodItem("Veggie Burger ",1,800));
        res.menu.addItems(new FoodItem("Pasta",1,1000));
        res.menu.showItems();
        System.out.println("");

        //create customer
	
		Customer cus = new Customer("Alice",007);
		cus.cart.addtoCart(new FoodItem("Veggie Burger",2,600));
		cus.cart.addtoCart(new FoodItem("Pasta",1,1050.00));
		
		//Place order

		System.out.println("Order Details:");
		Order order = new DeliveryOrder(cus,res,cus.cart);
		double total = order.calculateTotal();
		System.out.println("Order placed by "+ cus.name+ ": & Total = $"+ total+".");
		System.out.println("");

		//payment

		System.out.println("Payment Details:");
		Payable payment = new CardPayment();
		payment.paymentMethod(total);
		System.out.println("");
        
		//delivery

        System.out.println("Delivery Details:");
		DeliveryPerson dp = new DeliveryPerson("Bob");
		dp.delivery("123,MainStreet,Negombo.");
    }
}
