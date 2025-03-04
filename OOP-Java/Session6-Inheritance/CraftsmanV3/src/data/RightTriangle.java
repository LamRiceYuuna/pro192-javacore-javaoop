
package data;


// 1. Đọc đc câu IS-A 1 chiều , TGV là phiên bản đặc biệt của 1TG (2 cạnh vuông)
//  extends

//2. Đặc tính của class con. Nếu con trùng hết đặc tính với Cha, không cần làm gì cả

//3.Tạo phễu cho con , nhớ giữ bản sắc


//4.Thích thì độ Con
//a , b (góc vuông), o, c: Cha lo được hết , không cần Con làm


public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
        //new Con chính là new 1 phiên bản Cha
        //cắt TGV chính là cắt 1 TG
        //super() chính là new TG()
        //cứ new TGV thì chính là new 1 phiên bản TG, new này gọi new kia
        
        
        //in theo cách của mình thì phải làm lại thôi, nếu k phải theo quy tắc ba má
  
    }
    @Override//Còi to cho vượt , mún qua mặt cha, dành quyền ưu tiên
    public void paint() {
        System.out.printf("|R.TRIANGLE|%-12s|%-8s|%4.1f|%4.1f| -  |%7.2f|\n",
                                   owner, color, a, b, getArea());
    }
    
}

//Con xài tất cả những gì cha có, cha có thêm con có thêm, cha bớt con bi bớt
// Kế thừa/di truyền - Inherite


//Biến dị , con thêm mới mà cha không có , không phải override (xin phép cha con
//theo kiểu của cha, tên hàm giống, để con phát ngôn thay )
//con sáng tạo , lan đột biến