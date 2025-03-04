package data;

import java.util.Scanner;

public class Student {

    private String name, code;
    private int mark;
    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String name, String code, int mark) {
        this.name = name;
        this.code = code;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %8s | %2d |",
                name, code, mark);
    }

    public void input() {
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input code: ");
        code = sc.nextLine();
        System.out.println("Input mark: ");
        mark = Integer.parseInt(sc.nextLine());

    }
}
