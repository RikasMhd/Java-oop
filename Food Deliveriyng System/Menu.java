import java.util.*;
public class Menu {
    List<FoodItem>items=new ArrayList<>();
     
    void addItems(FoodItem item){
        items.add(item);
    }
    void showItems(){
        System.out.println("Menu");
        int i=1;
        for(FoodItem item:items){
            System.out.println(i+".Food Name : "+item.name+" , Price - "+item.price);
            i++;
        }
    }
}
