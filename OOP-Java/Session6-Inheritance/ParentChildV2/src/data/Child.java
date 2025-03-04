
package data;


//1. IS A xuất hiện 1 chiều extends, chuẩn bị xài lại heng, ko có tự làm
//2.Khai báo các đặc điểm . Lưu ý: 
//    2.1.Nếu con trùng hết vs Cha , Cha sẽ làm lại, Cha sẽ làm cho
//       Giả sử Con cũng chỉ có 2 tài sản (di truyền), không cần khai báo j cả
//    2.2 Con có đồ riêng , làm riêng , giấu ba, liệu rằng Ba có biết ko?
//      Biến dị
//     Con làm thêm được 1 loại tài sản, thay vì  Ba chỉ có 2

//3.Làm phễu, giữ bản sắc cho Con, thỏa hiệp / đàm phán / deal nếu cần


public class Child extends Parent {
    private String assetThree; //Rectangle vs Square (o, c, e)
                               //                    (o, c, e, smile)
    
    
    //về lí thuyết, con có 3 thứ : a1, a2, a3, phễu phải đổ cả 3 , kế thừa Cha giữ 2
    //new con = new Cha



    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);//must be first statement
        this.assetThree = assetThree;
        //phải có Cha mới có không gian cho con mở rộng 
        //Bắt buộc phải new Cha trước, mới extends đc, mới thêm chỗ mở rộng để new thêm 
        // phần khác biệt
        //bố trí ram cho ba , mở rộng cho con sau
        
        
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + 
                                 "; asset2: " + assetTwo + 
                                 "; asset3: " + assetThree);
        
    }
    
    //hàm mới , hành động ms của con , khác cha , cha không có
    //ngoài đời có ,con vào SG làm thêm, đi đánh game, đá banh, ...
    //tập môn thể thao mạo hiểm
    
    public void sayHi() { // gáy vs mọi người
        System.out.println("Hey, i am a rich kid");
        System.out.println("By the way, my 3rd asset 3 is " + assetThree);
    }
    
    //Con có quyền khác trên đặc điểm và hành vi với Cha (ngoài vc kế thừa và @Override)
    //KHAI CON NEW CON XỔ TẤT , ĐÃ BIẾT
    //KHAI CHA NEW CON CHỈ XỔ CỦA CHA, KHÔNG CHỊU XỔ PHẦN KHÁC BIỆT, DÙNG DANH NGĨA
    //NGƯỜI LỚN, PHẢI HÀNH XỬ NHƯ NGƯỜI LỚN
    //Muốn xổ tất , kĩ thuật tổ lái con trỏ




    }

