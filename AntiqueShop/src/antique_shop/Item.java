package antique_shop;

import java.util.Scanner;

public class Item {

    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {

        return "Item{"  + "creator=" + creator + ",  value= " + value +   '}' ;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        // int value;
        //String creator;

        System.out.println("Input a creator's item: ");
        creator = sc.nextLine();
        while (true) {
            try {

                System.out.print("Input value of item: ");
                value = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Do u know to input a positive number?");
            }

        }
    }

}
