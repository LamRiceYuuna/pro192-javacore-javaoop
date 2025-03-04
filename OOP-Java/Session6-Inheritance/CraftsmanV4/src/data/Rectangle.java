
package data;

//1. Thấy có cái IS-A, extends

//2. Đặc điểm của con, đồng nhất vs (Cha lo hết) hoặc dị biệt, Con có riêng

//3.Phễu , tôn trọng bản sắc

//4. Vì Cha là abstract  tức là chỉ ns hoy, ko chịu làm, chung chung hoy
// nên nếu con k chịu làm , tức là con cũng chứa hàm abstract, thi Con
// trong tình huống này phải là abstract luôn
// 1 Class chứa hàm abstract ko code , thì class đó phải là abstract 
// vì nó toàn nói điều chung chung , dù bên trong nó có vài hàm có code

//con kế thừa abstract class, mày có 2 lựa chọn , k hơn:
//  - hoặc mày abstract , nếu m k chịu viết code cho Cha, thừa kế abstract
//                       vậy m là khái niệm luôn còn j!!!
// - Hoặc là m phải viết code cho các hàm abstract của cha, vì m đủ info để làm
//  m cụ thể rồi, vì mọi thứ trong m là rõ ràng
//CON VIẾT CODE CHO HÀM CHA, CHA NS CON LÀM, IMPLEMENT ABSTRACT METHODS
//  implement the body of Parent 'abstract methods
//Cha  đã ns ý tưởng , con phải hiện thực thôi
//                     làm biếng m giống cha abstract, đời cháu tính...
// Nếu ko chịu làm tiếp ,mãi mãi là ns k làm...---> hệ quả gì DÒNG HỌ
// VÔ SINH, ko thể new được 1 object từ cha và con luôn, vì cả 2 không đủ code
// không sinh được object do khuôn ko hoàn hảo!!!!!

public class Rectangle extends Shape{
    protected double width, length; //kết hợp vs phần làm biếng/extends từ Cha
                         //sẽ tái hợp đầy đủ như chưa có kế thừa

    public Rectangle( String owner, String color, String borderColor, double width, double length) {
        super(owner, color, borderColor);//cha phải có trước , làm cánh chim
        this.width = width;                      //Con bay xa, extends, dễ bố trí RAM
        this.length = length;
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
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return ((width + length) * 2);
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                                  owner, color, borderColor, width, length, getArea());
    }

    
    
    
}
