/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

public class Square {
    private String owner;
    private String color;
    private double edge; // 1 cạnh thôi heng

    public Square() {
    }

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" + "owner=" + owner + ", color=" + color + ", edge=" + edge + '}';
    }
    
    //ai có nhiều info gã đó sẽ xử lí thông tin, hàm thuộc về
    public double getArea() {
        //return edge * edge;
        return Math.pow(edge, 2); //edge^2
    }//re-use ở các chỗ khác
    
    public void paint() {
        System.out.printf("|SQUARE   |%-12s|%-8s|%4.1f|----|%7.2f|\n",
                                   owner, color, edge, getArea());
    } 
}
