/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import data.Student;// mượn đồ để dùng , tìm đến nơi cất
import java.util.Scanner;
//!include<stdio.h>

/**
 *
 * @author admin
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //saveAStudent();
        //inputAStudent();
        saveStudents();
    }
    //nhập từ bàn phím
    //cần Scanner object bàn phím. OOP cái j cx obj, class
    //Máy cam, Scanner tiệm photo, WC, Bàn Phím Cơ, Touchpad --> nhóm quét
    //vào máy tính , class Scanner xuất hiện. Xài new để cho nó hành xử
    //từ bàn phím đi vào ram, do đó phải có biến để hứng value
    
    
    
    public static void inputAStudent  () {
       String id;
       String name = null;
       int yob;
       double gpa;
       Scanner sc = new Scanner(System.in);

       
       System.out.print("Input id: ");    
       id = sc.nextLine();
     
       System.out.print("Input name: ");  //chuỗi trước số không bị lạc trôi lệnh   
       id = sc.nextLine();       
       
       
       System.out.print("Input yob: ");    
       yob = sc.nextInt();

       System.out.print("Input gpa: ");    
       gpa = sc.nextDouble();
       
       Student x = new Student(id, name, yob, gpa);
       x.showProfile();
       //x.setId(id); //nguy hiểm
      
       
    }
    
    
    
    
    
    //hard-code
    public static void saveStudents() {
        Student cuong = new Student ("HE166666", "CUONG VO", 1996, 6.6);
        Student binh = new Student ("HE163792", "BINH NGUYỄN", 2002, 7.9);

        Student lam = new Student("HE163792", "LAM NGUYỄN", 1999, 8.9);
        lam.showProfile();
        binh.showProfile();
        
        
        //chấm xổ gì, Access Modifier/Access Specifier
        //System.out.println("Lam name (directly): " + lam.name);// y chang cầu thủ dán tên sau lưng
        System.out.println("Lam name (directly): " + lam.getName());
        
        
        //vì sờ được trực tiếp cái name/biến/instance variable, t có thể get() và set()
        //lam.name = "KHÔNG HỌC BÀI";
        //Student.name = "CÀY RANK HƠN CÀY CODE";
        
        //System.out.println("Binh name (directly): " + binh.name);
        //System.out.println("Binh name agian (directly): " + lam.name);        
        
        //System.out.println("Student name (directly): " + Student.name);        

        lam.showProfile();
        
        
        //sayHi() mà sayHi đang là static 
        System.out.println("Using static");
        //lam.sayHi();  //đồ static không tư hữu nữa theo kiểu của riêng mình cho static
        //binh.sayHi();
        Student.sayHi();//Tên class chấm static vì là đồ chung Multiple objects
        
    
        
        //2 loại dấu chấm
        //chấm trực tiếp qua tên class tức chạm sờ STATIC
        //chấm qua con đường new tức là bạn đang hàm ý chơi với non-static
        //                                         đồ riêng của từng object

        
}
}
//STATIC ăn theo thằng cuối cùng 
