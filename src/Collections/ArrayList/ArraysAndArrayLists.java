package Collections.ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysAndArrayLists {
    public static void main(String[] args) {
        String[] array = new String[]{"First", "Second", "Third"};
        var list = Arrays.asList(array);

        list.set(0, "one");
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("list: "+list);

        list.sort(Comparator.naturalOrder());
        System.out.println("After sorting...");
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("list: "+list);

        //list.remove(0);
        //list.add("Forth");

        //cannot add or remove elements from dressed up array Arrays.asList() (a array wrapper class)
    }
}
