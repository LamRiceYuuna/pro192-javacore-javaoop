
package amazingracev2;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;


public class AmazingRaceV2 {

    public static void main(String[] args) {
        // TODO code application logic here
        runToDead();
    }
    public static void runToDead() {
        
        //CÓ QUYỀN CÓ ĐUA THỦ CHẠY NGANG NHẢY ZO LUÔN
        //MỸ NHÂN NGƯ CỦA CTC
        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50.0);
        //chấm full hàm của Con, đủ code hàm Cha, CLB
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        //Chấm full hàm Cha, khai Cha , chạy ko sợ vì đa hình con qua mặt
        //tổ lái con trỏ đc , new Dog mà sợ gì
        //tao là "danh nghĩa Cha" thì chỉ xổ Cha hoy, hk rồi
        //m biết Bố t là ai không
        
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        //ngộ nhỡ chấm thì sao
        //chấm chỉ xổ full CLB, 2 hàm runToDead(), showHowToDead()
        //tao là đua thủ chỉ quan tâm đua hoy
        //chạy éo sợ vì Con qua mặt , có đủ hàm Override đã làm rồi, đa hình tiếp
        //ép con trỏ được luôn
        
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");
        
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2};
        //racer[0] = new Dog(...);
        //racer[1] = new Motor(...)
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowTo()
        //Con tự lo, Con Motor chạy theo Motor, con Dog chạy theo Dog
        System.out.println("The racing records:");
        for (DeathRacer x : racer) {
            x.showHowToDead();
            
        }
    }
}
