
package dogmanagement;

import data.Dog;



public class DogManagement {


    public static void main(String[] args) {
        //lấy khuôn dog ra để bắt đầu đổ info
        //y chang làm thẻ cc : lấy thông tin, in lên thẻ, đổ mực 
        //sau khi chờ khô, ta đc object thuộc Nhóm vừa đúc
        //đặt tên gọi tắt cho object để dễ dàng sử , tham chiếu đến
    Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
    
    //CaSi chiPu {name:NTC; yob 1993; hits: Anh ơi anh ở lại} 
                 //JSON JavaScript
//biến/tên tắt       object
    // có object thì obj sẽ biết làm gì đó, chó biết sủa
    chiHu.bark();
    Dog ngaoDa = new Dog("NGÁO Đá",2020, 50.0);
    ngaoDa.bark();
    int yob = 2001;
    System.out.println("yob : " + yob ); //2001
    yob = 2002;
    System.out.println("yob again : " + yob ); //2002
    
    //chiHu sủa trở lại
    System.out.println("Chi Hu Hu barks again");
    chiHu.bark();
     
    //bark(); //?? đứa nào sủa vậy ??, không biết
    //hành động phải gắn với object, thông qua CHẤM
    System.out.println("After over weight");
    chiHu.setNewWeight(5);
    chiHu.bark();
    
    int chYob = chiHu.getYob(); 
        System.out.println("CH YOB: " + chYob);
    
        System.out.println("NĐ YOB: " + ngaoDa.getYob());

    }
//new xin vùng ram mới đủ chứa info của 1 bạn Dog sẽ được đúc, được đổ vào     
//có 2 vùng name dành cho object    
//NĐ ko đè lên name của ChiHU
    
}
