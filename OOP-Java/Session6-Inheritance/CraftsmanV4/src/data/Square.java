
package data;
//Nên kế thừa ai??
//C1:Shape: khai báo cạnh edge , phễu (super, éo thỏa hiệp , đảo thứ tự biến nếu muốn

import sun.security.util.Length;

//         get/set()
// BẮT BUỘC PHẢI IMPLEMENTS

//C2:Kế thừa mẹ nó Rectangle
//                         ko cạnh , phễu thỏa hiệp tí, Xong éo làm j
//                         CÙNG LẮM LÀ SỬA PAINT()
//                         Shape là Ông nội, cây gia phả xuất hiện
public class Square extends Rectangle{

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|----|%7.2f|\n",
                                   owner, color, borderColor, width, getArea());    
    }
    
    public void sayHi() {
        System.out.println("Học đi ông cháu ơi k sắp cút cmnr");
    }
    //DONE ko làm gì nữa , HCN có đủ rồi, Owner, color kìa, 2 edge bên cha
    // M muốn in kiểu sqr thì m @Override ba gần m đi , HCN
    

//    public Square(String owner, String color, String borderColor, double edge) {
//        super(owner, color, borderColor);
//        this.edge = edge;
//    }

//    @Override
//    public double getArea() {
//        return Math.pow(edge, 2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * edge; 
//    }
//
//    @Override
//    public void paint() {
//        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|----|%7.2f|\n",
//                                   owner, color, borderColor, edge, getArea());    }
//    
    
}
