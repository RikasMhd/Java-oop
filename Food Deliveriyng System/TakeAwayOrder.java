class TakeAwayOrder extends Order{
   TakeAwayOrder(Customer customer,Restaurant restaurant,Cart cart){
      super(customer,restaurant,cart);
   }
   double calculateTotal(){
      return cart.getTotal();
   }
}
