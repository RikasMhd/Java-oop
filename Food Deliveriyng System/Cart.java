import java.util.*;
public class Cart {
    List<FoodItem>items=new ArrayList<>();

    void addtoCart(FoodItem item){
        items.add(item);
    }
    double getTotal(){
        double total=0;
        for(FoodItem itm:items){
            total+=itm.getPrice()*itm.getQty();
        }
        return total;
    }
    public List<FoodItem> getItems() {
        return items;
    }
}
