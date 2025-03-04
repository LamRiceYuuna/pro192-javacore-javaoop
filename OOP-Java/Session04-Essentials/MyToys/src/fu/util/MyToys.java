package fu.util;

import java.util.Scanner;

//đây là Class , Khuôn chứa, có đặc điểm hành động/ chứa các món đồ chơi dành chung 
//cho mọi nơi - vì nó không nhớ cái j cho riêng tư của nó
//LIBRARY/FRAMEWORK - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau
public class MyToys {

    //đặc điểm/hành vi là static, cho người ta sờ thì thêm public
    //ko nhớ cái j của riêng mình
    //một class bt thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    //Math: hầu hết là static
    //String: vừa non-static, vừa có static
    //System: hầu hết là static
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final double MAX_ELEMENTS = 500;

    //final ~ const bên C, biến không cho thay đổi value, trừ lần đầu tiên khai báo
    //HẰNG SỐ
    //DI: Dependency Injection
    //Đẩy scanner ra ngoài xài chung cho các hàm của chúng ta, tại sao không??
    private static Scanner sc = new Scanner(System.in);
    //Private cho nhu cầu dùng cho nội bộ bên trong
    //FAP, LMS

    //Double.parseDouble
    //                          tb nhập, errorMsg,lower,upper
    public static int getAChoice(String inputMsg) {
        int n; //hứng từ bàn phím gõ gì

        do {
            try {
                System.out.print(inputMsg);
                //n = sc.nextInt(); để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên 1..6
                return n;

            } catch (Exception e) {
                System.out.println("Do u know how to input an integer(1..7)");
            }

        } while (true);

    }

    //trong quá trình làm app, việc nhập số gặp lại rất nhiều lần
    //nhập 2 cạnh của 1hcn, 3 cạnh 1TG,nhập sự lựa chọn menu1...5,điểm tb, điểm thi các môn
    //mỗi cú nhập ,biến nhập , kèm theo; trôi lệnh, cà chớn - try-catch - do-while
    //tách việc nhâp số nguyên thành 1 hàm, gói chửi bới, trôi lệnh, nhập lệnh vào một chỗ
    //ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqrt(4) --> mình dùng, Math ko cần nhớ, không cần non-static
    //new mà trả kq cho ng ta dùng , hok cần nhớ, dùng nhiều ram làm gì, STATIC là thượng sách
    public static int getAnInteger() {
        int n; //hứng từ bàn phím gõ gì

        do {
            try {
                System.out.print("Input an integer: ");
                //n = sc.nextInt(); để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên 1..6
                return n;

            } catch (Exception e) {
                System.out.println("Do u know how to input an integer?");
            }

        } while (true);

    }

}
