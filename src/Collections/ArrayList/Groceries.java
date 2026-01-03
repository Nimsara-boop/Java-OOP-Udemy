package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Groceries {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>(List.of("Pickles","yogurt", "Zebras", "Biscuits", "Oats", "Beans", "Custard", "Ice cream"));

        System.out.println("Third item is "+groceries.get(3));
        if (groceries.contains("Biscuits")){
            System.out.println("Contains biscuits");
        }

        groceries.add("yogurt");
        System.out.println("First = "+groceries.indexOf("yogurt"));
        System.out.println("Last = "+groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("Beans");
        System.out.println(groceries);

        groceries.removeAll(List.of("Biscuits", "Zebras"));
        System.out.println(groceries);
        groceries.retainAll(List.of("Custard", "Ice cream"));
        System.out.println(groceries);

        System.out.println("");

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = "+groceries.isEmpty());

        System.out.println("");

        groceries.addAll(List.of("Toothbrush", "Medicine", "Soy", "Vanilla"));
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("Eggs", "Flour", "Sugar", "Baking Powder", "Butter"));
        System.out.println(groceries);

        System.out.println("Before sorting: "+groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println("After sorting: "+groceries);
        groceries.sort(Comparator.reverseOrder());

        //this is a bit confusing
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }


}
