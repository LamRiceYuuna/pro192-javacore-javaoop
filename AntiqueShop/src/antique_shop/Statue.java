
package antique_shop;

import java.util.Scanner;

public class Statue extends Item {
    

    private int weight;
    private String color;

    public Statue() {
        super();
    }

    public Statue(int weight, String color,int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return x + "Statue{" + "weight=" + weight + ", color=" + color + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Statue: ");
        super.input();
        System.out.println("Input color of Statue: ");
        color = sc.nextLine();
        while (true) {
            try {

                System.out.print("Input weight of Statue: ");
                weight = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Do u know to input a positive number?");
            }

        }
    }

}
