package data;

//Chơi thêm kế thừa , Motor is kind of Vehicle (abstract class)

import java.util.Random;

//Motor mua về chạy đi học, chuyện bình thường, hàm run()
//nhưng trên đường có thằng vớ vẩn nào đó nẹt-pô, mình kéo tay ga mạnh hơn
//bốc đầu , vọt xe, tốc độ phải dữ hơn bình thường, lúc này ngoài việc motor
//thông thường, ta còn là đua-thủ, phải là đua-thủ
//GIA NHẬP HỘI ĐUA THOY
//TỜ CÒN LÀ 1 ĐUA THỦ , KO DÙNG TỪ KHÓA EXTENDS, XÀI TỪ 1 MEMBER CỦA
//                                                     IMPLEMENTS
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐÔNG CỦA CLB ĐÓ
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KO CHỊU ĐUA SAO ĐƯỢC
//@OVERRIDE
//Class chính của chúng ta cứ có đặc điểm hành vi như bình thường
//Chúng ta tham gia câu lạc bộ nào thì có thêm hđ của clb đó, @Override HĐ đó
//trong ta có nhiều hành động ứng với từng CLB ta tham gia , hợp lí ngoài đời
//đi với bụt mặc áo cà sa, đi với ma mặc áo giấy
//VỀ MẶT LOGIC , TA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ MỘT DÒNG HỌ
//TRONG JAVA, 1 CON TỐI ĐA 1 CHA, ĐƠN KẾ THỪA
//            1 CON THAM GIA N CLB, SẼ CÓ HĐ của n CLB

//C++, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA!!!
public class Motor implements DeathRacer{

    public static final double MAX_SPEED = 180;
    private String model; //Exciter 2021, Winner 202
    private String volume; //số phân khối 125.0 cm3
    private String vin;   // biển số , số khung, Vehicle Identifiler Number 

    public Motor() {
    }

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }

    //hành vi của xe máy là chạy, có tốc độ đc ghi nhận
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
        //chạy ngẫu nhiên không quá 180 km
    }
   
    //quay video và gáy tốc độ    
    public void showRecord() {       
        System.out.printf("|%-10s|%-15s|%-8s|%-11s|%5.1f|\n",
                              "MOTOR", model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        //chạy tốc độ cao thôi,đôn nòng, xoáy nòng, ép dên , dôn dên
        return run() * 3;//run() giả sử đc 150 x 3 đua đến chết còn j
    }

    @Override
    public void showHowToDead() {
          System.out.printf("|%-20s|%-15s|%-8s|%-11s|%5.1f|\n",
                              "MOTOR-RACER", model, volume, vin, runToDead());
        
    }

}
