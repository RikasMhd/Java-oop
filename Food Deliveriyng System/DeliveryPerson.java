class DeliveryPerson extends User implements Deliverable{
    DeliveryPerson(String name){
        super(name) ;
    }
    @Override
    public void delivery(String address){
        System.out.println("Delivery Person Name : "+super.name+"\nDelivery to "+address);
    }
}
