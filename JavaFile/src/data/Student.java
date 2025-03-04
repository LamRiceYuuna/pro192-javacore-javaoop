
package data;

public class Student {
    private String name;
    private int age;
    private int pro192_mark;
    private int calculus_mark;

    public Student(String name, int age, int pro192_mark, int calculus_mark) {
        this.name = name;
        this.age = age;
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

    public int getPro192_mark() {
        return pro192_mark;
    }

    public void setPro192_mark(int pro192_mark) {
        this.pro192_mark = pro192_mark;
    }

    public int getCalculus_mark() {
        return calculus_mark;
    }

    public void setCalculus_mark(int calculus_mark) {
        this.calculus_mark = calculus_mark;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", pro192_mark=" + pro192_mark + ", calculus_mark=" + calculus_mark + '}';
    }
    public void showProfile() {
        System.out.printf("|%-25s|%2d|%4d|%4d|\n",
                             name, age, pro192_mark, calculus_mark);
    }
    
    
    
    
}
