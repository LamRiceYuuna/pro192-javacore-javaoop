package data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class Student {
    private static String id; //____ // nằm ở 1 vùng nhớ riêng, mà object nào cũng xài ké , chung
                              //vùng nhớ xài chung cho các object cùng Clas
                              //dữ liệu vào hay chỉnh sửa ăn theo thằng cuối cùng
    //CHỐT HẠ: KHÔNG DÙNG STATIC CHO NHỮNG THỨ/ĐĐ CỦA RIÊNG TỪNG OBJ
    // tui có mã số, bạn có ms, bạn kia có ms, nhưng đều là riêng của mỗi đứa
    //chung đặc điểm, khác value, vậy phải có biến riêng clone riêng - NON-STATIC
    private String name;
    
     
    public int yob;
    private double gpa;//grade point average

    public Student(String id, String iName, int yob, double gpa) {   
        this.id = id;//instance variable
        name = iName;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    } //hiếm khi đổi mã số giống môn DBI primary key

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|",
                            id, name, yob, gpa);
    }
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n",
                            id, name, yob, gpa);
        
    } //NON-STATIC CHƠI VS NON - DĨ NHIÊN CŨNG OBJ, VÀ RIÊNG THÀNH CHUNG 
    
    public int getAge() {
        return 2022 - yob;
    }
    
//    public static void sayHi() {
//        System.out.println("Hi everyone, my name is " + name);
//       
        //System.out.println("By the way , my yob is " + yob);
        //STATIC chỉ chơi với static vì cùng khu vực
        //có quá chời yob đc clone biết biết lấy ai bỏ ai
        
        
        
    }
        
        
        
    
    
    


