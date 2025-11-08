public class FoodItem {
    String name;
    int qty;
    double price;

    FoodItem(String name,int size,double price){
        this.name=name;
        this.qty=qty;
        this.price=price;
    }
    String getName(){
        return this.name;
    }
    int getQty(){
        return this.qty;
    }
    double getPrice(){
        return this.price;
    }
}