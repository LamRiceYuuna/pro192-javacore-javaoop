
package dogmanagement;

import data.Dog;



public class DogManagement {


    public static void main(String[] args) {
    int age = 20;    
    
        
    Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
    
    chiHu.bark();
    
    Dog ngaoDa = new Dog("NGÁO Đá",2020, 50.0);
    
    ngaoDa.bark();
    
    // tôi  muốn show toàn bộ info của tui , theo cách toString() 
    //object có nhiều hành động
    System.out.println("Show all info by using toString() a new behavior");
    
    String chDetails = chiHu.toString();
    System.out.println("CH details: " + chDetails);
    System.out.println("NĐ details: " + ngaoDa.toString());
    
    //hàm toString() rất đặc biệt ,@Override
    //Mục tiêu là show ra all of info đã đổ vào , hoặc chỉnh sửa
    //y chang như mở mục Setting trong phone xem phần info đt
    System.out.println("Play with toString() - Gọi thầm tên em");
    System.out.println(chiHu);  // chiHu là biến obj, lưu tọa độ vùng new
                                // về lí in ra địa chỉ, thực tế trong Java nó gọi toString()
    System.out.println(ngaoDa); // gọi thầm tên em toString()
    
    //Nếu khuôn không có hàm toString()thì mặc nhiên khi được triệu gọi(gọi thầm hay
    //hay gọi trực tiếp)JVm ,sẽ tự động băm cái vùng ram của object thành con số hexa
    //đại diện cho value vùng ram đó
    //Hash number , nén toàn bộ data thành 1 con số, MD5,SHA-256...
    
    
    //xem tuối của 1 object, tương tác , hỏi đáp, giao tiếp với obejct qua dấu (.)
    System.out.println("Get age");
    System.out.println("NĐ age :"+ ngaoDa.getAge());
    
    
    //int a = 100;
    //printf("a: %d\n, a"); --> 100 vùng ram có primitive , value mấy
    //printf("a address: %u\n, &a");//vùng ram mày ở đâu vậy, tọa độ , địa chỉ của mày
    //int* p = &a; //p lưu tọa độ a, gọi là con trỏ , vì nhắm tọa độ nhà mày
    //printf("p has value of %u\n, p"); -> địa chỉ a, 6M
    //printf("a has value of %d\n, *p"); ->100
    }

}
