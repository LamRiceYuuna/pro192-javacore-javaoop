package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private String code;
    private double pro192Mark;
    private double calculusMark;

    public Student(String name, int age, String code, int pro192Mark, int calculusMark) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.pro192Mark = pro192Mark;
        this.calculusMark = calculusMark;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPro192Mark() {
        return pro192Mark;
    }

    public void setPro192Mark(int pro192Mark) {
        this.pro192Mark = pro192Mark;
    }

    public double getCalculusMark() {
        return calculusMark;
    }

    public void setCalculusMark(int calculusMark) {
        this.calculusMark = calculusMark;
    }

    @Override
    public String toString() {
        return String.format("|%-12s|%3d|%8s|%3.1f|%3.1f|",
                name, age, code, pro192Mark, calculusMark);
    }

    public double getAverageMark() {
        return (getPro192Mark() + getCalculusMark()) / 2;
    }

    public String sortStudentType() {
        if (getAverageMark() >= 9 && getAverageMark() <= 10) {
            return "Xuất Sắc";
        } else if (getAverageMark() >= 8 && getAverageMark() <= 9) {
            return "Giỏi";
        } else if (getAverageMark() >= 7 && getAverageMark() <= 8) {
            return "Khá";
        } else if (getAverageMark() >= 5 && getAverageMark() <= 7) {
            return "Trung Bình";
        } else if (getAverageMark() >= 4 && getAverageMark() <= 5) {
            return "Yếu";
        }
        return "Kém";

    }

    public  void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter("new.txt");
            myWriter.write("Information of student: " + toString());
            myWriter.write("\nAverage mark: " + getAverageMark());
            myWriter.write("\nStudent type: " + sortStudentType());
            myWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
//    public static void ReadFile() {
//        try {
//      File myFile = new File("danhsachsv.txt");
//      Scanner myReader = new Scanner(myFile);
//      while (myReader.hasNextLine()) {
//        String data = myReader.nextLine();
//        System.out.println(data);
//      }
//      myReader.close();
//    } catch (FileNotFoundException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//  }

               
    

    


