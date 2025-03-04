
package data;

import java.util.Random;

public class Hamster extends Pet{
 public static final double MAX_SPEED = 10;
    //private  String ribbon; //ruy-băng

    public Hamster(String name, int yob, double weight) {
        super(name, yob, weight); //Mèo chính là 1 Pet
        //this.ribbon = ribbon;    //Cha sẽ là cánh chim cho con bay thật xa
        
        
    }

    
    @Override
    public double run() {
        //Trong cuộc sống có những "thứ-object" sinh ra cho mình mấy trò ngẫu nhiên
        //Như vậy chúng thuộc Nhóm/Khuôn ngẫu nhiên, class ngẫu nhiên xuất hiện
        //JDK có sẵn cái Khuôn này rồi, tên là Random
        //                                            ~~ Scanner ~~~ Math
        Random mayNgauNhien = new Random();
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED; // trả cho mình con số
                                               // trong khoảng (0...1) * 50 =  gần 50
                                               
        return speed; // trả về tốc độ gần 50, hên xui random
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4s|%4.1f|\n",
                                      "HAMSTER",name, yob, weight, " ", run() );
    }
    
    
}

