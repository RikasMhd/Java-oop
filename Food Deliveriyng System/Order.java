abstract class Order {
    Customer customer;
    Restaurant restaurant;
    Cart cart;
    Order(Customer customer,Restaurant restaurant,Cart cart){
        this.restaurant=restaurant;
        this.customer=customer;
        this.cart=cart;
    }
    abstract double calculateTotal();
}
