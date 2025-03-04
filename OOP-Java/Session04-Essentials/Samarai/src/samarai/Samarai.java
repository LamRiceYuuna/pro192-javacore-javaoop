package samarai;

import java.util.Scanner;

public class Samarai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inputProfile();
        inputProfileXinSo();
    }

    public static void inputProfileXinSo() {
        //Ko OOP,chỉ cần hiểu về việc nhập thông tin, k chơi class student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");

        name = sc.nextLine().toUpperCase();

        while (true) { //cuộc chiến vô cực 
            try {

                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;

            } catch (Exception e) {
                System.out.println("Do u know to input a positive number?");
            }

        }

        System.out.print("Input address: ");

        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

    //nhập thông tin cơ bản của sv và in ra
    public static void inputProfile() {
        //Ko OOP,chỉ cần hiểu về việc nhập thông tin, k chơi class student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");

        name = sc.nextLine().toUpperCase();

        //Mặc định JVM J sẽ diết app nếu có cờ chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho ta cơ chế tự xử khi có cà chớn xảy ra , chuyển quyền giết chóc cho mình
        // báo JVM biết đừng giết, tạo tự xử , nhốt các lệnh cà chớn lại,SANDBOX
        try {

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            //nextLine() hốt sách buffer, loại bỏ enter , còn chuỗi số --> số
            //alt - shift - f = căn code

            //lệnh cà chớn nằm here
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ này nếu có cờ chớn xảy ra
            //JVM k giết app như truyền thống nữa
            //chỗ này là chỗ xử lí hậu quả cà chớn
            //k có cà chớn k đi vào đây
            //e chính là lá thứ/msg màu đỏ JVM gửi cho mình báo rằng có lỗi cà chớn nè
            //làm j thì làm
            //Exception e = new Exception(nội dung lỗi màu đỏ đây nè.....);
            // về lý : e.xem lỗi , xử lú tự mình
            //về toán, hóa: mk tập trung phần xử lí lỗi , biết thừa éo gõ đúng số cần nhập

            //xử lí sao? nhiều cách: default value(k hay)
            //                         hay: bắt nhập lại , member: login/user name
            yob = 69;
        }

        System.out.print("Input address: ");

        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

}
