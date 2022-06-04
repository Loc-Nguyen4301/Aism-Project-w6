import java.util.*;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application");
        System.out.println("------------------------");
        System.out.println("1.Create new order");
        System.out.println("2.Add item to the order");
        System.out.println("3.Delete item by id");
        System.out.println("4.Display the items list of order");
        System.out.println("0.Exit");
        System.out.println("------------------------");
        System.out.println("Please choose a number 0-1-2-3-4");
    }

    public static void main(String args[]) {
        Order anOrder = new Order();
        int dem = 0;
        while (true) {
            System.out.println("\n\n");
            showMenu();
            Scanner myObj = new Scanner(System.in);
            Integer myChoose = myObj.nextInt();
            if (myChoose == 1) {
                System.out.println("An order is created");
            } else if (myChoose == 2) {
                System.out.println("DVD || BOOK ???");
                Scanner myObj1 = new Scanner(System.in);
                String myChoose1 = myObj1.nextLine();
                if (myChoose1.toUpperCase().equals("BOOK")) {
                    List<String> list = new ArrayList<String>();
                    list.add("Nguyen Gia Loc");
                    list.add("Ngo Thua An");
                    Book book1 = new Book(dem, "Tay du ki", "Tieu thuyet", 100.3f, list);
                    dem++;
                    anOrder.addMedia(book1);
                } else if (myChoose1.toUpperCase().equals("DVD")) {
                    DigitalVideoDisc disk1 = new DigitalVideoDisc(dem, "Vien Da Nho", "Music", 100.44f, "Hai Bang",
                            150);
                    dem++;
                    anOrder.addMedia(disk1);

                } else
                    System.out.println("Can't add this item in Order");
            } else if (myChoose == 3) {
                System.out.println("ID of item want to remove:");
                Scanner myObj2 = new Scanner(System.in);
                Integer ID = myObj2.nextInt();
                anOrder.removeMediaById(ID);
            } else if (myChoose == 4) {
                for (Media item : anOrder.itemsOrdered) {
                    System.out.println("ID:" + item.getId() + "\t" + "Title:" + item.getTitle() + "\t" + "Cost:"
                            + item.getCost() + "\t" + "Category:" + item.getCategory());
                }
            } else
                break;
        }
    }
}
