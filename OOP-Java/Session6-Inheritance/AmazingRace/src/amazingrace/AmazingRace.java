/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author admin
 */
public class AmazingRace {

    public static void main(String[] args) {
        // TODO code application logic here
        //register();
        showRecordsWithTakeAway();
    }
    public static void showRecordsWithTakeAway() {
        
        //đường đua  đông vui, có nhiều racer và có 1 con j đó nó bay theo
        //bay theo ,vật gì đó bay theo , tức là có tốc độ
        //mình ko biết , ko xác định đc nhóm của nó là gì, chưa biết class gì
        //vì mày muốn nhập hội, okie, chạy theo đi, chơi trò take-away
        //mượn gió bẻ măng, mượn Pet để new object
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4s|%4.1f|\n",
                        "XXX", name, yob, weight, " ", run());
            }
        };
                
        
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 10.0),
            new Cat("TOM", 1960, 15.0, "<>"),
            new Cat("Kittty", 1990, 5.0, "??"),
            new Hamster("JERRY", 1960, 0.5),
            xx, ufo // anonymous vẫn là object là Pet, vẫn vào mảng
        };
    
        System.out.println("The records table: ");
        for (Pet x : racer) {
            x.showRecord();

        }
    }


    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2021, 50.0);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        beTo.showRecord();
        //run() đa hình rồi các Con ơi
        //if ([i].run() > [j].run()
        //vì móa mỗi lần gọi run() của i, j khác nhau
        //bài kia là S, gpa là cố định lúc sort, 2 for k đổi S, gpa
        // bài này cứ gọi tom.run() tên cố định , năm sinh cố định
        //run() éo cố định
    }
    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2021, 0.3);
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 10.0),
            new Cat("TOM", 1960, 15.0, "<>"),
            new Cat("Kittty", 1990, 5.0, "??"),
            new Hamster("JERRY", 1960, 0.5),
            xx
        };
        //racer[0] = new Dog("", 0, 0);
        //phần tử mảng Pet thì phải gán 1 con Pet nào đó, Cat, Dog, HT
        //gán = new Dog(...); [i]  =  cần tọa độ vùng new Con nào đó()
        //new Dog(): ... bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc
        //tọa độ vùng new đưa cho ai đó
        //đa hình quay trở lại
        //vì mảng Pet , mọi việc chấm là của Cha, của Pet, Cha toàn là Abstract
        //hoàn toàn ko đáng lo ,  vì con đã implement
        //Cha quất roi chạy đi chúng mày, thế là 3 đứa chạy theo
        //Tốc độ của riêng chúng, đa hình xuất hiện, override qua mặt Cha xh
        //bài này bắt tụi nhỏ chạy 1 lượt rồi ghi hết lại thành tích
        //ta so sánh thành tích chạy này
        System.out.println("The records table: ");
        for (Pet x : racer) {
            x.showRecord();

        }
    }

}

