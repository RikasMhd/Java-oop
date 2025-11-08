class DeliveryOrder extends Order {
    double deliveryFee=200;
    DeliveryOrder(Customer customer,Restaurant restaurant,Cart cart){
       super(customer,restaurant,cart);
    }
    double calculateTotal(){
       return cart.getTotal()+deliveryFee;
    }
}