package craftsmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class CraftsmanV4 {

    public static void main(String[] args) {
       
        playWithAnonymousClass();
        sortShapesWithAnonymous();
    }
    
        public static void sortShapesWithAnonymous() {
            
        //Anonymous here!!!
        
        Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
            @Override
            public double getArea() {
                //cắt ngẫu nhiên , ko gọi đc hình gì,S phải tự đo
                return 50;
            }
            
            @Override
            public double getPerimeter() {
               return 40;
               
            }
            
            @Override
            public void paint() {
                System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n",
                                    "TAKE-AWAY", owner, color, borderColor, " ", " ", getArea() );
            }
        };//VIP
            
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9);
        ((Square) s3).sayHi();

        //Hà kiều anh nhận là công chúa!!!
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":x", 6);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);
           
        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2, onTheGo};
        System.out.println("The list of shapes: ");
        for (Shape x : box) {
            x.paint();
        }

        for (int i = 0; i < box.length - 1; i++) {
            for (int j = i + 1; j < box.length; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape tmp = box[i]; 
                    box[i] = box[j]; 
                    box[j] = tmp;
                }
               
            }

        }
        System.out.println("The list of shapes after sorting ascending by area: ");
        for (Shape x : box) {
            x.paint();

        }
    }


    //kĩ thuật tạo object/vùng new ko cần Khuôn cụ thể
    //dành cho những object vô định hình, ko có công thức để tính toán và nhân bản
    //ko có khuôn cố định, cắt hình ngẫu nhiên, nhưng vẫn là hình, ÉO BIẾT NHÓM CON
    //NHƯNG VẪN CHẮC CHẮN LÀ HÌNH: CÓ NÉT, MÀU, CẠNH , BỀ MẶT
    //ÉO CÓ CÔNG THỨC CHUNG , NHÂN BẢN LẠI ĐC NHANH CHÓNG
    //HCN cắt nhanh chóng, hình elip nhanh, hbh nhanh
    //hình cắt gấp khúc, mỗi hình duy nhất, không nhanh được, k có khuôn
    //OBJECT VÃNG LAI , ko thường xuyên xuất hiện, quen làm, quen gặp
    //Dù là hình kiểu j: CTC: new cha/supper()cha + @ Override
    public static void playWithAnonymousClass() {
        //Shape x = new NoName(...) // phải full code cho cha
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            
            @Override
            public double getArea() {
                return 50; //vì hình cụ thể không theo hình dạng nào , ta tự đo
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n",
                        owner, color, borderColor, getArea());
            }
        };
        vangLai.paint();
          //mày là 1 hình , thoải mái mái vào mảng Shape sort nếu mún
          //mày vẫn là Shape, kiểu Shape , có đủ code cho hàm cho hàm Cha
          //kĩ thuật mượn gió bẻ măng, mượn Cha tạo Con , mượn Shape new Con
          //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH ĐỂ GÕ CODE OVERRIDE
          //THỎA CÔNG THỨC CON = NEW CHA + @Override
          //Chỉ xài cách này nếu chỉ cần làm 1 object on the go, mà làm biếng
          //làm khuôn con riêng lẻ , theo công thức nhân bản
          
              
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);
        //((Rectangle)r2). getLength();// dị biệt
        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", ":x", 6);
//        Square s1 = new Square("BÉ NA", "RED", "MAGENTA", 4);
//        Shape s2 = new Square("BÉ NA", "MAGENTA", "RED", 4);

        r1.paint(); // Con , RECTANGLE
        r2.paint(); //Cha , khi chạy qua mặt Cha, RECTANGLE
        d1.paint(); // Con , Disk
        d2.paint(); //Cha , qua mặt cha, ko care Cha nói chung, ưu tiên con
        // code cha không có k ảnh hưởng
        // new cha thì sao thầy ?? bàn vụ này sau, khó!!!
        //do code cha không hoàn hảo k đầy đủ
        //.PAINT() CHÍNH LÀ POLYMORPHISM, ĐA XẠ , ĐA HÌNH ĐÃ XUẤT HIỆN           
//        s1.paint();
//        s2.paint();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9);
        ((Square) s3).sayHi();

        //Hà kiều anh nhận là công chúa!!!
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":x", 6);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);

        //ta có thể khai báo 9 hình này đều là Shape , cực đẹp khi nhìn đội hình đồng nhất
        //in kết quả trước khi sort
        r1.paint(); //CON, chạy hàm con
        r2.paint(); //Cha, chạy hàm con
        s1.paint(); //CON , chạy con
        s2.paint(); //Cha, chạy con
        s3.paint(); //Ông nội, chạy cháu
        d1.paint(); //Con , chạy con
        d2.paint();//Cha , chạy con
        t1.paint();// Con , chạy con
        t2.paint(); // Cha , chạy con

        //Paint() ở đây cực hay:
        //chỉ có 1 hàm tên paint() nhưng có đa dạng cách viết code
        //lúc chạy đa dạng , lúc chạy tròn, cn, hv
        //cùng hàm cha, ông nội , nhưng đám con cháu biết override đúng lúc
        //từ 1 hàm paint() ánh xạ/ chiếu xạ ra N cách viết code/implement khác nhau
        //thực thi (chạy) theo N cách khác nhau
        //từ một biến hóa ra nhiều, từ 1 có đa dạng hình dạng ,đa ánh xạ cách làm cách chạy
        //từ 1 biến hình transformer, đa nhân cách 50 sắc thái, từ 1 ra nhiều
        //KĨ THUẬT VIẾT CODE TỪ 1 HÀM MÀ CÓ N CÁCH THỂ HIỆN CHẠY KHÁC NHAU
        //KĨ THUẬT LÀ TÍNH ĐA XẠ , ĐA HÌNH POLYMORPHISM
        //HAY HƠN NỮA NÈ , CHÚNG MÀY VÀO MẢNG GIÙM TAO ĐỂ TAO FOR, TAO SORT
        //MẢNG SHAPE AGAIN 
//        Shape [] box = new Shape[9]; // 9 biến Shape
//        //box[0]  box [1] ... là các biến Shape cần trỏ vùng new con mẹ gì đó
//       //                            //new Rectangle() new Disk()  new Triangle()....
//       //box[0] = new Rectangle(owner, color, borderColor, 0, 0); đúng
//       box[0] = r1;//hai chàng 1 nàng
//       box[1] = r2;
//       box[2] = d1;
        //Shape box [] = new Shape[] {new Disk(), new Rectangle(), new Triangle()};
        //                             box[0]        box[1]             box[2]
        Shape box[] = new Shape[]{r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shapes: ");
        for (Shape x : box) {
            x.paint();
        }
        //Đa hình siêu đẹp , 1 hàm paint() cha n cách chạy
        // 1 ra nhiều cách thực thi, đa hình đa xạ polymorphism
        //Cha ns paint() , ae nhào vô

        //sort đc ko??
        for (int i = 0; i < box.length - 1; i++) {
            for (int j = i + 1; j < box.length; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape tmp = box[i]; // đa hình tiếp nè, gọi hàm Cha , éo có code
                    box[i] = box[j]; // chạy hàm Con, qua mặt Cha tính S()
                    box[j] = tmp;
                }
                //có sợ k lấy đc S hay k?? Éo sợ
                //Đa hình ,gọi hàm cha, nhưng con chạy
                //móa, hàm S() ,P () , ĐA HÌNH, cha gọi con qua mặt

            }

        }
        System.out.println("The list of shapes after sorting ascending by area: ");
        for (Shape x : box) {
            x.paint();

        }
    }

}
