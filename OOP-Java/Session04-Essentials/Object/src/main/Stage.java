/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Student;

/**
 *
 * @author admin
 */
public class Stage {

    public static void main(String[] args) {
        //checkObjectV2();
        //checkObjectV6();
        Student ahihi = checkObjectV8();//ahihi lưu tọa độ của AN trong hàm ra ngoài
        ahihi.showProfile();

    }
       //hàm trả về 1 object hả thầy
       //đọc chuẩn : hàm trả về 1 tọa độ của object nào đó, vì trả được tọa độ  nghĩa là
       //sờ được object, có tọa độ chấm là tới object
    
    
       //             Student x;
        public static Student checkObjectV8() {//~~Student x = sẽ là 1 vùng new
        Student x;  
        

       x = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
       return x; //việt sub: x lưu tọa độ vùng clone AN,hướng 6m
                 //thảy tọa độ đó cho tên hàm, tên hàm là 6M, hướng 6M
                 
       

    }

    public static void checkObjectV7() {
        Student x;  // khai báo con trỏ nhưng chưa trỏ ai
        //tao vs mày ns về thằng x kia đi , ai dzợ , từ từ sẽ nói
        int a;
        a = 10;
        

       x = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
       // à nó đây nè
       //x = new ()
       

    }

    public static void checkObjectV6() {
        //câu chuyên của sinh ra rồi chết non
        //câu chuyện vô danh tên gọi 
        //object k thèm, k tên gọi , vẫn hành xử

        Student s1 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
        // đã tương đương tọa độ r, thảy tạo độ đó đi dâu thui
        //thảy cho biến object nào đó giữ giùm tọa độ
        // biến đó mà chấm nghĩa là tọa độ chấm, NGHĨA LÀ NEW CHẤM LUÔN
        // vì biến có tọa độ từ new. CHỐT HẠ : NEW NẮM TỌA ĐỘ
        //chấm là vào trong tọa độ xem có cái j, trong object có j

        //mày là biến luwuu tọa độ vùng new, cho tao tọa độ đi
        new Student("HE163792", "AN NGUYỄN", 1999, 8.9).showProfile();
        //ko thèm đặt tên cho object để giao tiếp ,để object tự giao tiếp
        //object vô danh, anonymous object, object was created without a name, a referance
        //Xuất hiện xong , gáy xong , khóc xong, garbage collector phát hiện không con trỏ
        //giết , clear 

        //muốn re-use lại vùng new, tối thiểu ít nhất 1 tên gọi , 1 biến object
        //để còn chấm tiếp
    }

    public static void checkObjectV5() {
        //câu chuyên của 2 chàng và 1 nàng
        Student s1 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);

        Student x = s1;//mày là biến luwuu tọa độ vùng new, cho tao tọa độ đi
        s1.showProfile();
        x.showProfile();//backup tọa độ new An ở trên , thêm 1 con trỏ cùng, trùng
        //chứng mình 2 chàng trỏ đúng 1 nàng
        //chàng 1 tát , chàng 2 thấy
        s1.setName("MÌNH CHƠI Ú TÌM HEN");
        //trong vùng clone new AN đã bị thay đổi name thành MÌNH CHƠI..
        System.out.println("After that: ");
        //hok them hỏi s1, hỏi luôn x
        x.showProfile();

        //nhiều tên cùng tham chiếu 1 object
        // tí , tèo ->Mình..
        //hoàng, giáo làng, đa cấp,cp --> Tui
        //cùng 1 tên ám chỉ nhiều object khác 
        //sếp  = ST
        //sếp  = gã trả lương
        //THAY ĐỔI VALUE CỦA BIẾN
        //MỘT OBJECT CÓ NHIỀU NGƯỜI NGƯỚC NHÌN, THAM CHIẾU
    }

    public static void checkObjectV4() {

        Student s1 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
        //trước khi s1 trỏ tọa đọ ms, backup tọa đọ cũ là xong
        //giữ lại đc AN 
        Student x = s1;//mày là biến luwuu tọa độ vùng new, cho tao tọa độ đi
        //nếu tao tự new như mày, k lẽ,sai, ra vùng clone mới

        //int a = 10;
        //int b = a;//cho t value của mày , tao muốn lấy value của mày
        s1 = new Student("HE163999", "LỘC PHÁT", 1998, 8.8);
        s1.showProfile(); //LP
        x.showProfile(); //AN đã trở lại  backup tọa độ new vào 1 biến khác cùng kiểu

    }

    public static void checkObjectV3() {
        Student s1 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
        s1 = new Student("HE163999", "LỘC PHÁT", 1998, 8.8);
        //con diều AN đứt dây
        //vì sợi dây đã nối vs diều ms LP

        //s1 li dị vùng clone AN NGUYỄN , chuyển sang kết nối vs LP
        //ống nhòm dòm chỗ ms, con trỏ lưu tọa độ ms , biến thay đổi value, lưu value gần nhất
        //int a = 10; a = 100;
        //s1 là biến object
        //tui cần lắm luôn 1 tọa độ vùng new, vùng clone Student
        s1.showProfile();  //LP

        //mất tọa độ vùng clone AN
        //vùng ram không có ai trỏ tới, thì định kì khi chạy app,JVM (phần hạy //Window
        //sẽ kiểm soát app của bạn) giết/ clear vùng clone k có trỏ
        //Cờ hó chạy ngoài đường k chủ ,Exciter hốt
        //City MTĐT, JVM có đoạn code , module giám sát HEAP , xem có đứa lào mồ côi
        //giết ngay và luôn (độ trễ if any)~ free (con trỏ bên C chơi malloc())
        //anh giám sát này gọi tên là Garbage Collector, người gom rác, CTMTĐT
        System.gc();//gom rác trong HEAP
        //ngoài đời có gắn lại biến con trỏ, tên tắt cho thứ phức tạp
        //sếp = CS ST (...)
        //chết cha sếp kia , sếp  =( ông,gã chấm lương cho mình, qđ mình tăng lương)
        //tí = Ngô Thanh Vân & và câu chuyện trạng tí  

    }

    public static void checkObjectV2() {
        Student s1 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
        Student s2 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
        s1.setName("AI RỒI CŨNG KHÁC");

        s1.showProfile();
        s2.showProfile();
        //một new 1 clone,2 sv khác nhau vì 2 vùng ram khác nhau

    }

    public static void checkObjectV1() {
        Student st1 = new Student("HE163792", "AN NGUYỄN", 1999, 8.9);
        //reference var        object, vùng ram bự trong HEAP
        //object    var        instance, thể hiện, hiện thân, bức tượng
        //"pointer" var

        st1.showProfile();
        //  s1 đang nắm/lưu tọa độ vùng ram object trong HEAP
        //     new làm cực kì nhiều việc 
        //           1.Clone khuôn (object và static)
        //           2.Gọi phễu đổ data vào vùng clone
        //           3.Chốt lại tọa độ vùng new vừa rồi, đem tọa độ đó gán cho 1 biến con trỏ

        //s1 là biến, vậy nó có thể thay đổi value !!!!!
        //sếp đang trỏ đến Sơn Tùng
        //sếp vs người đi làm , trỏ đến ông/bà quyết định lương cho mk
        //sếp tham chiếu người này người kia
        Student x = st1;
        //Hai con trỏ trỏ cùng 1 vùng new
        //, 2 chàng trỏ 1 nàng
        int a = 10;
        int b = a; // 
        st1 = new Student("HE163788", "BINH NGUYỄN", 1999, 8.8);
        //LI DỊ AN
        st1.showProfile();
        System.out.println("s1 now is Bình");

        System.out.println("An after s1 từ chối chơi");
        x.showProfile();

        //AN NGUYỄN KO CÒN AI TRỎ, KO CÒN CÁCH LẤY LẠI ĐC VÙNG RAM NÀY
        //Tọa độ new cũ ta k giữ lại
        //biến object là tay cầm con diều, new chính là con diều
        //khi tay cầm nối dây con diều mới, con diều cũ ko còn chơi nữa, đứt sợi dây bay mất
        //1 vùng ram new Object mà k còn ai trỏ tới, JVM có chương trình ngầm gọi là
        // CT MTĐT, Garbage collector, đi gom những vùng new mồ côi k con trỏ,dọn free heap ram
        //trả lại ram ko xài nữa cho new sau này
        // 1 biến có quyền trỏ vùng new, giữ lại AN đc k, mà vẫn có Bình
        //lưa tọa độ thôi mà
        //VI DIỆU, VỀ SUY NGHĨ ĐIỀU J DIỄN RA HẮC NÃO 1 TÍ
        new Student("SE666666", "ĐẠI GIA", 2002, 9.9).showProfile();
    }

}
