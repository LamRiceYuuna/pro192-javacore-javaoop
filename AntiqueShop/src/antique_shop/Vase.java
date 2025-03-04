package antique_shop;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        super();
    }

    public Vase(int height, String material,int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return x + "Vase{" + "height=" + height + ", material=" + material + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Vase: ");
        super.input();
        System.out.println("Input material of vase: ");
        material = sc.nextLine();
        while (true) {
            try {

                System.out.print("Input height of vase: ");
                height = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Do u know to input a positive number?");
            }

        }
    }

}
