package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
}
public class Start {
    public static void main(String[] args) {
        System.out.println("---ARRAY---");
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1]= new GroceryItem("apples", "PRODUCE", 3);
        groceryArray[2]= "4 roses";
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("---ARRAY LIST ---");
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 4));
        System.out.println("original list -> Size: "+groceryList.size()+" "+groceryList);
        groceryList.add(0,new GroceryItem("Cheese"));
        System.out.println("with 'add' -> Size: "+groceryList.size()+" "+groceryList);
        groceryList.set(0, new GroceryItem("Feta"));
        System.out.println("with 'set' -> Size: "+groceryList.size()+" "+groceryList);

    }
}
