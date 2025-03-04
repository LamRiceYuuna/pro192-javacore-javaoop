class hello {
public static void main(String[] args) {
System.out.println("Hello");

Student student_a = new Student();
Student student_c = new Student();
student_c.set_name("Nguyen Nam Anh");
Student student_b = new Student();
student_b.set_name("Nguyen Thi Anh");
student_a.set_name("Nguyen Hoai Nam");
System.out.println("Student " + student_a.get_name() + " will take olympic compitition");

// student_a.meet_students(student_b);
student_a.meet_students(student_b, student_c, student_b);
// student_a.show_info();
}
}

class Student {
private String name;
private int math_mark;
private int pro192_mark;

Student(){

}
Student(String name, int math_mark, int pro192_mark){

}
public String get_name(){
return this.name;
}
public void set_name(String name){
this.name = name;
}

// public void meet_students(Student other1){
// System.out.println(this.name + " MEET " + other1.get_name());
// }

public void meet_students(Student...others){
for (Student x : others){
System.out.println(this.name + " MEET " + x.get_name());
}
}

// public void meet_students(Student other1, Student other2){
// System.out.println(this.name + " MEET " + other1.get_name());
// System.out.println(this.name + " MEET " + other2.get_name());

// }

public void show_info(){
System.out.println("Name: " + this.name);
System.out.println("Math Mark: " + this.math_mark);
System.out.println("Pro192 Mark: " + this.pro192_mark);
}
}