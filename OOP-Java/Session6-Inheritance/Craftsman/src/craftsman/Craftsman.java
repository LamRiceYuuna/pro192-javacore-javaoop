package craftsman;

import data.Disk;
import data.Rectangle;
import data.Square;

public class Craftsman {

    public static void main(String[] args) {
        //cutShapes();
        sortShapes();
    }

    //cô giáo: yêu cầu sắp xếp các hình tăng dần theo diện tích
    //dễ vì đã học
    //khó vì éo làm đc: vì không học bài kk hiểu, vì ...
    //muốn sắp xếp thì phải vào mảng thì ta ms chơi tự động đc , vì kích thước hình 
    //S hình chưa biết trước nếu nhập từ bàn phím
    //vì em mới for đc
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 20.0);
        Rectangle rectArr[] = new Rectangle[9];
        //lớp có 9 biến Rectangle, chưa có hình cụ thể nào
        //lớp có 30 chỗ ngồi , chưa có bạn nào đến
        //reactArr[i] = new React(...); // [i] cần trỏ vùng Rectangle()
        //                                   new cũ , mới , éo quan tâm
        //                                  chỉ quan tâm vùng clone new React
        rectArr[0] = r1; // 2 chàng 1 nàng clone TÍA
        rectArr[0].paint();
        rectArr[0].setOwner("YÊU TÍA");
        r1.paint(); //YÊU TÍA
        rectArr[1] = new Rectangle("MÁ", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("A.HAI", "BLUE", 3.0, 3.0);

        //hình vuông vào mảng sắp xếp luôn, vào chung mảng luôn!!!
        rectArr[3] = new Square( "Ge.aHai", "BULE", 5.0);
        
        // ko cùng kiểu , ko cùng hệ , k cùng data type , éo chung mảng , o sort đc
        // lí thuyết: mún làm đc sort cho v, cn , 2 thằng cùng mảng của 1 thứ
        //nào đó , phải là 1 mảng gì đó~~
        //sort trên cái j đó
        //nay: 2 khuôn độc lập, 2 mảng độc lập
        System.out.println("The list of rectangles ");
//        for (Rectangle x : rectArr) {
//            x.paint(); // x = arr[i]
//            
//        }//coi chừng toang vì NULL POINTER EXCEPTION
        //chỉ for đến chỗ đã trỏ / gán của mảng. count trong bài của cái tủ
        System.out.println("Before sorting ");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        //sort tăng dần theo diện tích, y chang sort tăng dần theo gpa
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }

            }
        }
        //POLYMORPHISM /OVERRIDE
        System.out.println("After sorting ascending by area ");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();

        }
    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();
        Square s1 = new Square("MÁ", "PINK", 3.0);
        s1.paint();
        s1.
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "<3", 2.0);
        d1.paint();
    }
}
