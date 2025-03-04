
package data;

/**
 *
 * @author admin
 */
public class Rectangle {
    protected String owner;  //______
    protected String color;//_______
    protected double width; //______
    private double length; //______
    //private double area; //_____ đặc điểm/đặc tính đc tính từ các đặc tính
                         // khác , từ w*l -> đặc tính dẫn xuất  = derived field
                         // tt = sl * đg
    //dẫn xuất tức là đc tính từ kẻ khác , tính tức là xử lí, hàm xuất hiện
    //hàm thuộc về kẻ có nhiều info
    //ví dụ khác : lưu tuổi, lưu cả năm sinh --> mỗi năm tuổi lên 1 nhát....

    public Rectangle() {
    }

    
    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    //ai có nhiều info gã đó sẽ xử lí thông tin, hàm thuộc về
    public double getArea() {
        return width * length;
    }//re-use ở các chỗ khác
    
    public void paint() {
        System.out.printf("|RENTANGLE|%-12s|%-8s|%4.1f|%4.1f|%7.2f|\n",
                                   owner, color, width, length, getArea());
    }
    
    
}
