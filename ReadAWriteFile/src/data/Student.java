package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
    private String name;
    private int age;
    private String code;
    private double pro192_mark;
    private double calculus_mark;

    public Student() {
    }

    public Student(String name, int age, String code, double pro192_mark, double calculus_mark) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.pro192_mark = pro192_mark;
        this.calculus_mark = calculus_mark;
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

    public double getPro192_mark() {
        return pro192_mark;
    }

    public void setPro192_mark(double pro192_mark) {
        this.pro192_mark = pro192_mark;
    }

    public double getCalculus_mark() {
        return calculus_mark;
    }

    public void setCalculus_mark(double calculus_mark) {
        this.calculus_mark = calculus_mark;
    }
                
    public double getAverageMark() {
        return (pro192_mark + calculus_mark) / 2;
    }
    
    public String rankOfStudent() {
        String rank = "";
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

    @Override
    public String toString() {
        return name + ", Age: " + age + ", Student Code: " + code
                + ", Pro192 Mark: " + pro192_mark + ", Calculus Mark: "
                + calculus_mark + ", Average Mark: " + getAverageMark()
                + ", Rank: " + rankOfStudent();
    }   
    
    public void writeToFile(String fileName) throws IOException {
        File f = new File(fileName);
        if (!f.exists())
            f.createNewFile();
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(toString());
        
        bw.close();
        fw.close();
    }
    
}


               