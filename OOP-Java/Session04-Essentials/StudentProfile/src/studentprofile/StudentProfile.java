/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprofile;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputProfile();
    }
    //nhập thông tin cơ bản của sv và in ra
    public static void inputProfile() {
        //Ko OOP,chỉ cần hiểu về việc nhập thông tin, k chơi class student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("Input name: " );
        
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
        
//        yob = sc.nextInt(); //convert data từ bàn phím - là chuỗi thành số
//        // để lại rác trong buffer, tệ nhất là enter, rác dấu cách + enter
//        //xóa bộ đệm trước nhập chuỗi
//        //ADP
//        sc.nextLine();  //sqrt(4)
       //QT
        String tmpNum = sc.nextLine();
        yob = Integer.parseInt(tmpNum);
        //nextLine() hốt sách buffer, loại bỏ enter , còn chuỗi số --> số
       

        
        
        System.out.print("Input address: ");
        
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);


    }
        
        
    
}
