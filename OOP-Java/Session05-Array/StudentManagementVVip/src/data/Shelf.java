/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Shelf {
    //đặc điểm của một cái tủ bất kì là gì: màu sơn:_; giá tiền:__;nhà sx:__;

    //số ngăn/không gian chứa đồ:___các món đồ nhét vào, món đò là object
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    //tủ chứa 1 list /mảng/danh sách các đối tượng
    //ứng dụng của mảng , góp phần tạo dựng các object khác
    //OOP: tìm các object, chúng phối hợp , trộn nhau
    private String color;
    private String label;//tủ chén , chứa hồ sơ SE,IA,GD
    private int count = 0;
    private Scanner sc = new Scanner(System.in);
    //chứa cái j
    //đặc điểm chính cần focus
    //dung lượng , không gian chứa của cái tủ là bao nhiêu??
    //nhiều cách khác nhau
    //1. đóng sẵn kích thước
    //2. theo yêu cầu ( đưa ra yêu cầu , đưa vào phễu)
    //
    private Student[] arr = new Student[500];//sẵn kích thước
    //logic mảng: cần có kích thước , chứa chỗ sẵn
    // value từng phần tử , từng món đồ từ từ tính
    //non-static cho các đặc tính ở trên
    //khi chơi vs mảng phải biết for đến đâu, coi chừng null
    //add vào từ từ trái sang phải
    // ta cần thêm biến count -sure non static

    //  constructor làm những việc gì : đổ info vào
    //bài này đổ màu sắc, tủ dùng việc j (label)
    //đặt hàng dung lượng, hoặc fix dung lượng
    // CÂU HỎI: sao em không đưa hồ sơ thật danh sách sinh viên vào?
    // mua tủ về phải trống , nhét hồ sơ thật vào từ từ hợp lí hơn
    // nhét ngay vào 1 lần hết hồ sơ vào là không thực tế..
    //bỏ hồ sơ vào tủ thực sự đc lặp đi lặp lại nhiều lần với cái tủ
    // hàm thêm hồ sơ nằm ở cái tủ là hợp lí: ai nhiều info người đó xử lí
    //addSV(),xoaSV()
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
        //this.count = 0;// có thể đưa qua phễu nhưng sẽ không hay, vì đây là thứ người dùng
        //khi mua tủ không cần biết, họ chỉ cần biết khả năng chứa tối đa
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // hành động add mới hồ sơ sv lặp lại cho mỗi cái tủ, 1 cái kệ, app đk member
    public void addAStudent() {
        //chơi for vỡ mặt , phải là từ từ, vì nó sẽ đc liên tục bổ sung theo
        //quy trình công ty, cách bạn làm với cái tủ
        String id, name;
        int yob;
        double gpa ;

        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        arr[count] = new Student(id, name, yob, gpa);
        count++;//VIP đã add xong 1 hồ sơ, thì phải sẵn sàng vị trí kế tiếp
        //bao nhiêu lần mở tủ add() hồ sơ, bấy nhiêu lần count tăng thêm

    }

    public void printStudentList() {
        System.out.println("There is/are " + count + "student(s) in the list");
//        for (Student x : arr) {
//            x.showProfile();
//        } // coi chừng null pointer
          for (int i = 0; i < count; i++) {
              arr[i].showProfile();
            
        }
    }
        public void searchStudent() {
        //đưa id vào từ bàn phím, tìm sv theo id
        //for từ đầu đến cuối của mảng, lôi từng sinh viên ra hỏi, mã số của ku là gì
        //so sánh vói id gõ vào, == nhau thì done , tìm ra sv ở vị trí i
        String id;
        System.out.println("Input student id that you want to search: ");
        id = sc.nextLine();
            for (int i = 0; i < count; i++) {
                if(arr[i].getId().equalsIgnoreCase(id) == true){
                    System.out.println("Student found!!! Here she/he is");
                    arr[i].showProfile();
                    return;//thoát hàm luôn , vì mã số sv là duy nhất , thấy rồi
                    //ko còn ai để for thêm làm gì
                }

            }
            System.out.println("Student not found!!!");
    }
}

//    private Scanner sc = new Scanner(System.in);
//    private int count = 0; //mới mua tủ về , số hồ sơ = 0
//                          //nhét thêm 1 hồ sơ vào thì count++
//                          //chơi mảng chỉ chơi đến count
//    public void inputAStudent() {
//
//        String id, name;
//        int yob;
//        double gpa;
//
//        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
//        System.out.print("Input id: ");
//        id = sc.nextLine();
//        System.out.print("Input name: ");
//        name = sc.nextLine();
//        System.out.print("Input yob: ");
//        yob = Integer.parseInt(sc.nextLine());
//
//        System.out.print("Input gpa: ");
//        gpa = Double.parseDouble(sc.nextLine());
//        ds[count] = new Student(id, name, yob, gpa);
//        count++; // siêu VIP 
//    }
//    public void printStudentList() {
//        System.out.println("The student list");
//        for (int i = 0; i < count; i++) {
//            ds[i].showProfile();
//        }
//        
//    }
//}

