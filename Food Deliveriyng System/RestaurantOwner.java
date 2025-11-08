class RestaurantOwner extends User{
    RestaurantOwner(String name){
        super(name) ;
    }
    @Override
    public String displayInfo(){
        return "Restaurant Owner Name : "+super.name;
    }
}
