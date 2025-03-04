
package data;


//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại heng, ko có tự làm
//2.Khai báo các đặc điểm . Lưu ý: 
//    2.1.Nếu con trùng hết vs Cha , Cha sẽ làm lại, Cha sẽ làm cho
//       Giả sử Con cũng chỉ có 2 tài sản (di truyền), không cần khai báo j cả
//    2.2 Con có đồ riêng , làm riêng , giấu ba, liệu rằng Ba có biết ko?
//      Biến dị

//3.Làm phễu, giữ bản sắc cho Con, thỏa hiệp / đàm phán / deal nếu cần


public class Child extends Parent {


    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }


    
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + "; asset2: " + assetTwo);
        
    }
    
    //hàm mới , hành động ms của con , khác cha , cha không có
    //ngoài đời có ,con vào SG làm thêm, đi đánh game, đá banh, ...
    //tập môn thể thao mạo hiểm
    
    public void sayHi() { // gáy vs mọi người
        System.out.println("Hey, i am a rich kid");
        
    }
}
