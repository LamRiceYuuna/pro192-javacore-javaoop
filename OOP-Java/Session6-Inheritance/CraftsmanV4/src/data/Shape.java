/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author admin
 */
//Khuôn tổ để sinh ra n khuôn khác cho nhanh
//giúp V,TR,CN,HV,TG,OVAL,... ở chung mảng, mới sort được
//cùng phiên bản xếp gần nhau
public abstract class Shape {

    protected String owner;
    protected String color;
    protected String borderColor;
    //các cạnh thì sao??
    //protected  double a, b, c, radious; //... còn nữa thì sao , có nên ko??
    //không được đưa các cạnh vào đây vì:
    //chúng sẽ kế thừa hết, do đó HV sẽ có cạnh , nhiều nữa là khác, bk
    //tròn , ngoài bk , kế thừa luôn cả cạnh
    //bk, cạnh là của riêng từng đứa con, dị biệt thì phải ở từng đứa con

    //Cha sẽ là nhân tử chung cho các con, ngoài đời y chang
    //đám con có di truyền từ ba má : owner, color. đường bo
    //Nhưng giữ lại phần khác biệt: TR : bk, V : cạnh, TG : chiều cao/đáy
    //a e trong nhà thừa kế từ ba má nhiều thứ , tài sản riêng mỗi con tự tạo dựng
    //người đó giữ
    //diện tích/chu vi là derived field đc tính từ thằng khác, ko nên xem là dđ
    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }

    //Khuôn vẫn chế tạo theo nguyên tắc chung đã học
//    public void paint() {
//
//    }
    //XÓA KO CHOH ,VÌ CẦN KHÁI NIỆM NÀY ĐỂ DIỄN TẢ RÕ Ý NGHĨA HH
    //ĐỂ KO ĐC VIẾT CODE, VÌ KO CÓ CỤ THỂ KÍCH THƯỚC
    //VẪN TỒN TẠI NHƯNG KHÔNG NẮM CHẠM ĐƯỢC, VẪN TỒN TẠI VỚI Ý NGHĨA TINH THẦN, MÔ TẢ HOY
    //VỀ NÓ HOI , NHƯNG CHƯA CỤ THỂ
    //HÀM TRỪU TƯỢNG, THỨ VÔ HÌNH MÀ VẪN HỮU HÌNH
    //ĐỂ VÀO CHO ĐỦ BỘ HOÀN HIỆN 1 THỨ GÌ ĐÓ, LÃNH ĐẠO TINH THẦN, K QUYỀN LỰC
    //CỤ THỂ
    //MA, QUỶ: VÔ HÌNH MÀ MK VẪN SỢ, KHÁI NIỆM MÀ HOY, ABSTRACT
    public abstract double getArea(); //CHỈ ns mà k có code
    
    public abstract double getPerimeter();
    
    //việc vẽ và in ra thông tin cũng là chung chung vì mỗi hình mỗi khác
    
    public abstract void paint();// thiếu S,P để in ấn
    //tao chỉ ns rằng hình học có những thứ này còn mỗi đứa V,TR,CN,..tự lo đi
    
    //Cha là nhân tử chung của các con
    //ABSTRACT : KHÁI NIỆM , NS HOY, CHƯA CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TRONG CUỘC SỐNG, TRONG TỰ NHIÊN
    //                  ĐỂ DỄ DÀNG NS VỀ CÁC OBJECT. XẢY RA CỰC NHIỀU TRONG CUỘC SỐNG
    
//    public double getArea() {
//        //return 50; // không chơi default, vì vô nghĩa khi new
//        //tính thế nào???, éo có kích thước, vì dị biệt ở từng Con
//        //ko có kích thước sao mà tính được
//        //ko xóa hàm này được , vì hình học thì phải có S,P
//    }
//      //HH cần có S như khái niệm , nói rằng thứ nào chiếm bề mặt, có số đo S
//      //đại diện cho 1 nhóm /series các đồ vật khác đều có S,P
//     // để đây như ý nghĩa tinh thần, đảm bảo đủ để mô tả 1 thứ nào đó
//      //hình học có S,P
//    public double getPerimeter() {
//        
//    }
             //diện tích , chu vi ko được xem là đặc tính, mà phải xem là chu vi
            //2 hàm tính S vs P để ở đâu ??Con hay Cha, hay cả hai??
            //Cả 2: vừa là di truyền vừa là di biệt (@OVERRIDE)
            //Đã ns về hình học , là phải ns về S,P
            //Hình cụ thể V,TR,TG,HBH chắc chắn tính đc, cũng là đặc điểm từng hình
            // mỗi đứa con thì sẽ dị biệt trong tính toán, nhưng ns chung là có S,P kế thừa
            //em đã hiểu
}

//ABSTRACT LÀ MỘT KHÁI NIỆM, Ý TƯỞNG VỀ 1 ĐIỂU GÌ ĐÓ
//VỚI HÌNH HỌC THÌ getS() , getP() là 2 khái niệm luôn phải có
//cần có khi mô tả về hình học( hàm thuộc về object phù hợp)

//Tivi cần phải ns về dò kênh, kết nối

//Đthoại: phải ns về bắt sóng , nhận cuộc gọi , gửi sms..

//Những mô tả này có thể là cụ thể, nhưng cũng có thể chỉ là ý tưởng , ns thoy
//chung chung thôi
//chung chung gọi là ABSTRACT
//cụ thể gọi là CONCRETE