class Customer extends User{
    Cart cart;
    int telNo;
    Customer(String name,int telNo){
        super(name) ;
        this.cart=new Cart();
        this.telNo=telNo;
    }
}
