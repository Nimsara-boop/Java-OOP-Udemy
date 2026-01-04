package Collections.ArrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void menu() {

        int choice = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("******Welcome to The Grocery******");
        System.out.println("Press 0 to shut down");
        System.out.println("Press 1 to remove items");
        System.out.println("Press 2 to add items");
        try {
            choice = input.nextInt();
            if (choice < 0 || choice > 2) {
                throw new MainException("Please enter a value in a menu");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Please enter an INTEGER");
            menu();
        }
        catch (MainException e){
            System.out.println("Number needs to be between 0 and 2.");
            menu();
        }

        switch(choice){
            case 0 -> System.out.println("Thank you for shoppping with us");
            case 1 ->  removeItems();
            case 2 -> addItems();
        }
    }

    public void removeItems(){
        System.out.println("What are the item/items you want to remove? ");
        Scanner input = new Scanner(System.in);
        String itemsList = input.nextLine();

        for (String item : groceryList){
            if 
        }

    }

    public void addItems(){

    }
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
