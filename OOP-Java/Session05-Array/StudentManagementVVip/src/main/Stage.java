package main;

import data.Student;
import java.util.Scanner;
import data.Shelf;

public class Stage {

    public static void main(String[] args) {
        //rap menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");

        do {
            printMenu();
            System.out.println("Input your choice: (1..6) "); //MyToys
            choice = Integer.parseInt(sc.nextLine());
            //if các choice thì làm gì
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchStudent();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time");
                    break;
                default:
                    System.out.println("Please choose 1..6 options");
            }
        } while (choice != 6); // còn đúng còn lặp
        //chưa chọn 6 chưa muốn kết thúc , lặp lại cuộc chơi
    
    
    }

    public static void printMenu(){
        System.out.println("Welcome to FAP  - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }

    public static void testShelf() {
        //ngon menu vòng lặp, chọn 1 thêm hồ sơ,, 2 xem danh sách
        //OOP
        Shelf tuSE = new Shelf("Pink", "SE");
        tuSE.addAStudent();
        tuSE.addAStudent();
        
        Shelf tuGD = new Shelf("RAINBOW", "GD");
        tuGD.addAStudent();
        
        System.out.println("The student list for all");
        tuSE.printStudentList();
        tuGD.printStudentList();
        
        
        //inputStudentList();

    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;
        System.out.println("How many student do you want to input?");
        count = Integer.parseInt(sc.nextLine()); //MyToys.getAnInteger()

        //for để nhập 5 hồ sơ
        Student[] arr = new Student[count];//count = 5
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");//todo: tên rỗng//check trùng id
                                                      //còn trùng còn nhập lại,y chăng đk member
            id = sc.nextLine();
            
            System.out.print("Input name: ");
            name = sc.nextLine();
            
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
                    
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
            
        }
        //sort dăm ba cái đồ iu, éo thèm làm , vì đã làm
    }

}
