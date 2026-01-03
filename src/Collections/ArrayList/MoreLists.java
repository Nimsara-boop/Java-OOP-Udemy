package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"Apples", "Banannas", "Oranges"};
        System.out.println(items.getClass().getName());
        // items.add("Hyena");   this is an Arrya, not a list

        //still cannot add, remove or modify.
        List<String> list = List.of(items);
        System.out.println(list);
        //list.add("Hyena");    still cannot add, remove or modify.
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        //creating an arraylist inside the ArrayList constructor
        ArrayList<String> nextList = new ArrayList<>(List.of("Pickles", "Biscuits", "Oats"));
        System.out.println(nextList);
        nextList.add("Nail polish");
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
