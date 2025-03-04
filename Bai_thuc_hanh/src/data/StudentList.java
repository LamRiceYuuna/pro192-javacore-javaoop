package data;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList extends ArrayList<Student> {

    public StudentList() {
    }

    Scanner sc = new Scanner(System.in);

    public void addNewStudent() {
        Student s1 = new Student();
        s1.input();
        super.add(s1);
        
    }

    public Student studentSearch(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (code.equals(this.get(i).getCode())) {
                return this.get(i);
            }
        }
        return null;
    }

    public void Update(String code, String name, int mark) {
        for (int i = 0; i < this.size(); i++) {
            if (code.equals(this.get(i).getCode())) {
                this.get(i).setCode(code);
                this.get(i).setName(name);
                this.get(i).setMark(mark);
            }
        }
    }

    public void Remove(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (code.equals(this.get(i).getCode())) {
                this.remove(i);
            }
        }
    }

    public void listAllStudent() {
        if (this.isEmpty()) {
            System.out.println("There are no student in list");
            return;
        }
        System.out.println("The list student :");
        for (Student x : this) {
            System.out.println(x);
        }
    }

}
