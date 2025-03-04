
package antique_shop;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFrammed;

    public Painting() {
        super();
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFrammed,int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFrammed = isFrammed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFrammed() {
        return isFrammed;
    }

    public void setIsFrammed(boolean isFrammed) {
        this.isFrammed = isFrammed;
    }

    @Override
    public String toString() {
        String x = super.toString();
        return x + "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFrammed=" + isFrammed + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Painting: ");
        super.input();
        while (true) {
            try {

                System.out.print("Input height of Paiting: ");
                height = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Do u know to input a positive number?");
            }

        }
        while (true) {
            try {

                System.out.print("Input width of Paiting: ");
                width = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Do u know to input a positive number?");
            }

        }
        System.out.println("Input isWatercolour (True/False): ");
        isWatercolour = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Input isFrammed (True/False): ");
        isFrammed = Boolean.parseBoolean(sc.nextLine());
    }
}
