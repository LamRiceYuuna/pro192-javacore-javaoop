
package antique_shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ItemList obj = new ItemList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1.Add a new vase");
            System.out.println("2.Add a new statue");
            System.out.println("3.Add a new painting");
            System.out.println("4.Display all items");
            System.out.println("5.Find the item by the creator");
            System.out.println("6.Find index of item by the creator");
            System.out.println("7.Update the item by its index");
            System.out.println("8.Remove the item by its index");
            System.out.println("9.Display the list vase items");
            System.out.println("10.Sort items in ascending order based value");
            System.out.println("11.Exit");
            System.out.println("Input your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Item v1 = new Vase();
                    v1.input();
                    if (obj.addItem(v1)) {
                        System.out.println("Added");
                    }
                    break;
                case 2:
                    Item s1 = new Statue();
                    s1.input();
                    if (obj.addItem(s1)) {
                        System.out.println("Added");
                    }
                    break;
                case 3:
                    Item p1 = new Painting();
                    p1.input();
                    if (obj.addItem(p1)) {
                        System.out.println("Added");
                    }
                    break;
                case 4:
                    System.out.println("Info of all items: ");
                    obj.displayAll();
                    break;
                case 5:
                    System.out.println("Input creator, you wanna find:");
                    String tmp;
                    tmp = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Info item by" + tmp + obj.findItem(tmp));
                    break;
                case 6:
                    System.out.println("Input creator , you wanna find:");
                    String tmp1;
                    tmp1 = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Index of item by" + tmp1 + obj.findItemIndex(tmp1));
                    break;
                case 7:
                    System.out.println("Input index of item, you wanna update info:");
                    int idx;
                    idx = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Update new info of index" + "[" + idx + "]" );
                    obj.updateItem(idx);
                    System.out.println("Successfully updated");
                    break;
                case 8:
                    System.out.println("Input index of item, you wanna remove:");
                    int idx1;
                    idx1 = sc.nextInt();
                    sc.nextLine();
                    obj.updateItem(idx1);
                    System.out.println("Deleted");
                    break;
                case 9:
                    System.out.println("Input type , you wanna display");
                    String type;
                    sc.nextLine();
                    type = sc.nextLine();
                    
                    obj.displayItemByType(type);
                    break;
                case 10:
                    obj.sortItem();
                    System.out.println("Done ,sort items in ascending order based value");
                    break;
                case 11:
                    System.out.println("Bye bye, see you next time!");
                    break;
                default:
                    System.out.println("Please, choose (1...11)options: ");
            }
        } while (choice != 11);
    
    
    
    }
}


//        Scanner sc = new Scanner(System.in);
//        ItemList obj = new ItemList();
//        Item s1 = new Statue();
//        Item v1 = new Vase(20, "Cotton", 15, "Starta");
//        s1.input();
//        obj.addItem(s1);
//       
//        
//
//        obj.displayAll();
//        String a1;
//        System.out.println("Input creator: ");
//        a1 = sc.nextLine();
//        obj.findItem(a1);
//        
//        System.out.println(obj.findItem(a1));
//
//        System.out.println(obj.findItemIndex(a1));
//        System.out.println("Input index of item, you wanna find :");
//        int idx;
//        idx = sc.nextInt();
//        obj.updateItem(idx);
//        
//        obj.displayAll();
//        
//        Item s3 = new Painting();
//
//        s3.input();
//
//        ItemList obj = new ItemList();
//
//        obj.addItem(s3);
//
//        obj.displayAll();
//    }
//        Item it1 = new Item();
//        it1.input();
//        Painting p1 = new Painting();
//        p1.input();
//        System.out.println("P1 paiting info:" +p1.toString());
//        Scanner sc = new Scanner(System.in);
//        int choice = 0;
//        do {
//            System.out.println("1.Add a new vase");
//            System.out.println("2.Add a new statue");
//            System.out.println("3.Add a new painting");
//            System.out.println("4.Display all items");
//            System.out.println("5.Find the item by the creator");
//            System.out.println("6.Update the item by its index");
//            System.out.println("7.Remove the item by its index");
//            System.out.println("8.Display the list vase items");
//            System.out.println("9.Sort items in ascending order based");
//            System.out.println("10.Exit");
//            System.out.println("Input your choice: ");
//            choice = sc.nextInt();
//            switch(choice) {
//                case 1:
//                    Item tmp = new Vase();
//                    tmp.input();
//                  
//    }
