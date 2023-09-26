import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Available Actions:\n" +
                           "0 - to shutdown\n" +
                           "1 - to add item(s) to list (comma delimited list)\n" +
                           "2 - to remove any items (comma delimited list)\n" +
                           "Enter a number for which action you want to do:\n");
        ArrayList<String> list = new ArrayList<>();

        loop : while(true){
            choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    break loop;
                case 1 :
                    String[] addItems = scanner.nextLine().split(",");
                    for (String addItem : addItems) {
                        addItem = addItem.trim();
                        if (list.contains(addItem)){
                            System.out.println("The element " + addItem + " is already present in it. You can't add the item");
                        } else {
                            list.add(addItem);
                        }
                    }
                    Collections.sort(list);
                    System.out.println("Sorted ArrayList in Ascending order : " + list);
                    break;
                case 2 :
                    if (list.size()==0){
                        System.out.println("The list are empty.");
                    }else{
                        System.out.println("Enter item to remove: ");
                        String[] removeItems = scanner.nextLine().split(",");

                        for (String removeItem : removeItems) {
                            removeItem = removeItem.trim();
                            list.remove(removeItem);
                        }
                        System.out.println("Updated ArrayList : " + list);
                    }
                    break;
            }
        }

    }
}