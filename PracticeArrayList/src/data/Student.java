
package data;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String Code;
    private String name;
    private double mark;

    public Student() {
    }

    public Student(String Code, String name, double mark) {
        this.Code = Code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %8s | %4.1f |",
                name, Code, mark);
    }
    
    public void inputInfo() {
        System.out.println("Input code student: ");
        Code = sc.nextLine();
        System.out.println("Input name student: ");
        name = sc.nextLine();
        System.out.println("Input mark :");
        mark = Double.parseDouble(sc.nextLine());
    }
}
