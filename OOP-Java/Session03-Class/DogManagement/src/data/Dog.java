/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//khuôn dùng để đúc ra các object , đối tượng cần lưu trữ info 
//thứ làm ra để bán
//Khuôn phải kín , phải có phễu để chế , rót, hứng ,đổ cái data , nguyên liệu

public class Dog {
    //chứa đặc điểm chi tiết mà cái khuôn , Object tương lai sẽ có
    //Khuôn design ra sao , object mai mốt có thế  
    public String name;//_____
    private int yob;   //______
    private double weight;//_____
    //...
    //~~Thẻ cd,cmnd,khác value đổ vào,Template
    
    //Có khuôn phải có phễu  để hứng vật liệu đi vào
    //Phễu nhận vật liệu để đúc ,tạo ra ,construct cái object
    public Dog(String iName, int iYob,double iWeight) {
        name = iName ;
        yob = iYob;
        weight = iWeight ;
        
    }
    //phễu còn gọi là contructor,hàm đúc, hàm khởi tạo ,hàm
    //tạo dựng ra object /bức tượng , cmnd của ai , hồ sơ đc tạo ra
    //CONTRUCTOR, phễu là hàm cực kì đặc biệt, vì nó dùng để tạo ra object
    //Cứ một lần xài nó, tức là phải đưa VL vào, tức là có 1 object mới  
    //object là hàm đặc biệt ko có giá trị trả về, ko void luôn, tao ói về nguyên 
    //bức tượng đang đúc
    //tên 100% giống  tên class
    
    //viết các hàm sử lý data, ví dụ như giao tiếp hỏi năm sinh
    //mày hỏi tao trả lời, vì ba má đã fill yob = 2002
    //biến đc đổ value từ lúc đúc ra
    
    //hàm gọi n lần tương đương các hành động mà obj nào đó lặp đi lặp lại
    //hđ của obj gọi n lần trên obj đó
    public void bark() {
        //System.out.println("Gogogogogo..... my name is" + name);
        //System.out.println("Gogogogogo..... my yob is " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                     name, yob, weight);
        
        
        
        
    }
    //mình đi xăm mình, nhuộm tóc
    //thay đổi info ba má đã từng cho lúc ba má cho mình
    public void setNewWeight(double newWeight) {
        weight = newWeight;
        
    }       
    
    //vì mặc định info sẽ là giấu , khi mình giao tiếp nó mới bật ra
    //chia sẻ info khi đc hỏi, đó chính là method hàm hành động get()
    public int getYob() {
        return yob;
         
     
    }
}

//code bên ngoài giống cái khuôn bị lủng
//ngoài đời: bạn (yob:2002), tui(yob:2002)
//ENCAPSULATION: tính đóng gói của thông tin và hành động
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN,MÔ TẢ CHO MỘT OBJECT, THỰC THỂ (SỐNG)
