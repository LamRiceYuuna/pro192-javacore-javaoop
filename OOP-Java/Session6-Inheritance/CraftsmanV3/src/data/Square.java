/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
//HV là phiên bản đặc biệt của hình chữ nhật, độ lại tí, độ lại 2 cạnh kề = nhau
//k mất đi bản sắc 4 góc vuông của hcn
//HV là sự mở rộng, nâng cấp , đặc biệt hóa, phiên bản mới ,sự điều chỉnh
//thay đổi nhỏ từ HCN
//Cách chế tạo khuôn mới từ Khuôn cũ, kế thừa , dùng lại, đứng trên vai
// KO PHẢI LÀ COPPY AND PASTE
//Phiên bản cũ  là mình làm các Khuôn từ đầu, ko kế thừa , sp chỏi nhau
//không cùng 1 nhà đc

//1.  mới A extends cũ B
//                    HCN Khuôn gốc để độ: class Cha, parent, super, base
//         HV              kế thừa từ HCN: class con ,child, sub, derived 
//                                                           //biến hình, chế ra từ
//                                                           // xuất phát từ


//2. đặc điểm của con là gì ?
//            Vì HV là (phiên bản) của HCN, nên nó sẽ có tất cả mọi thứ từ HCN
//                                   tao là HCN , tao phải có những HCN đang có
// Không cần làm lại các field, instance variable

//3. cần phễu , để đúc phiên bản mới, cần vật liệu đưa vào, gửi Cha giữ , đổ lên
//cha, vì có mọi thứ từ Cha, phiên bản gốc
// tôn trọng bản sắc Con, Con HV, o, c, edge, only

//                   con đồng thời là 1 pb HCN, o, c, w ,l
//code tự sinh ra nó sẽ căn theo phễu của Cha, 4 tham số , để đổ đc 4 tham số
//                               phễu Con phải 4, MẤT BẢN SẮC
//                                                            EDGE

public class Square  extends Rectangle {

    public Square() {
    }
                                              //trade - off
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge); // HV có cạnh edge là HCN có cạnh edge edge
    }//~~~new Rectangle(o, c, w, l);
    //new hình vuông chính là new HCN
    //new HV chính là new HCN
    //cắt 1HV bản chất chính là cắt 1 HCN
    //         có color, own , cạnh -> HCN dưới dạng hình vuông
//    private String owner;
//    private String color;
//    private double edge;
    //về lí xong khuôn vuông, vì đổ data như truyền thống, dùng lại hết của CN
    //KO CẦN VIẾT LẠI CODE, KO COPPY&PASTE
    //KO CHỈNH SỬA DÂY CHUYỀN SẢN XUẤT QUÁ NHIỀU, TẤT NHIÊN ĐANG CÙNG DÒNG SẢN PHẨM,SERIES
    @Override //Dính đến 1 k/n đa hình, đạ xạ, đa kế thừa 
    //đa nhân cách, đa sắc thái, 50 sắc thái , biến hình, transformer
    //POLYMORPHISM
    //Con qua mặt cha, thể hiện bản sắc của con, cha ngồi im để con lên tiếng
    //Cha để đó
    public void paint() {
        System.out.printf("|SQUARE    |%-12s|%-8s|%4.1f|  - |%7.2f|\n",
                                   owner, color, width, getArea());
    }
    
}
