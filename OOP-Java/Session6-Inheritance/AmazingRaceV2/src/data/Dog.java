
package data;

import java.util.Random;

//dog ngoan ngoãn ban ngày , tối chủ đi ngủ, nó trốn nhà đi hoang
//đi đua thì nó phải chạy vượt bình thường , runToDead() như bình thường
//Mình vẫn là Con Cháu dòng họ Lê, Pham, học hư bt SV
//nhưng còn tham gia CLB đua thủ, phượt, clb j đó, thì phải  có hđ clb đó
//IMPLEMENTS ALL ABSTRACT METHODS, NỘI DUNG CLB,@OVERRIDE  
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog() {
    }

    public Dog(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10S|%-10s|%4d|%4.1f|%4s|%4.1f|\n",
                                      "DOG", name, yob, weight, " ", run() );
    }
    //Phần hoang dã trong ta, bộc lộ khi đua
    //tụi m, sv, ngoan ngoãn ở nhà giãn cách
    //vào SG, chắc chắn thêm phần bộc lộ khác: nhậu nhẹt , game, cá độ đánh bài,..
    //                                         CLB TA, PHƯỢT, TỪ THIỆN,CẦU LÔNG
    
    @Override
    public double runToDead() {
        return run() * 5; //chạy hơn 5 lần 
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-10S|%-20s|%4d|%4.1f|%4s|%4.1f|\n",
                                      "DOG-RACER", name, yob, weight, " ", runToDead() );
    }

        
   
    
}
