
package data;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String code;
        String name;
        int mark = 0;
        do {
            System.out.println("Welcome to menu:             ");
            System.out.println("1.Add new student            ") ;
            System.out.println("2.Search a student           ");
            System.out.println("3.Update name and mark       ");
            System.out.println("4.Remove a student           ");
            System.out.println("5.List all student           ");
            System.out.println("6.Exit                       ");
            System.out.println("=>You want to choice number ? :  ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    AddStudent();
                    System.out.println("Add successfull");
                    break;
                case 2:
                    System.out.println("Student code you want to find : ");
                    code = sc.nextLine();
                    if (SearchStu(code) == null) {
                        System.out.println("Not exist");
                    } else {
                        System.out.println(SearchStu(code));
                    }
                    break;
                case 3:
                    System.out.print("Enter code you update : ");
                    code = sc.nextLine();
                    System.out.print("Enter name : ");
                    name = sc.nextLine();
                    System.out.print("Enter mark : ");
                    mark = Integer.parseInt(sc.nextLine());
                    UpdateStu(code, name, mark);
                    System.out.println("Update successful");
                    break;
                case 4:
                    System.out.print("Enter code you want remove : ");
                    code = sc.nextLine();
                    Remove(code);
                    System.out.println("Remove successful");
                    break;
                case 5:
                    System.out.println("The list all student");
                    listAllStudent();
                    break;
                case 6:
                    System.out.println("Exit successful");
                    return;
                    
                default:
                    System.out.println("Please choosen option from 1 to 6:");

            }
        } while (choice != 7);
    }

    
    
    
    static ArrayList<Student> StuList = new ArrayList<>();
    public static void AddStudent() {
        Student st1 = new Student();
        st1.inputInfo();
        StuList.add(st1);        
    }
    public static Student SearchStu(String code) {
        for (int i = 0; i < StuList.size(); i++) {
            if (code.equals(StuList.get(i).getCode())) {
                return StuList.get(i);
            }
        }
        return null;
    }
    public static void UpdateStu(String code, String name, int mark) {
        for (int i = 0; i < StuList.size(); i++) {
            if (code.equals(StuList.get(i).getCode())) {
                StuList.get(i).setCode(code);
                StuList.get(i).setName(name);
                StuList.get(i).setMark(mark);
            }
        }
    }
    public static void Remove(String code) {
        for (int i = 0; i < StuList.size(); i++) {
            if (code.equals(StuList.get(i).getCode())) {
                StuList.remove(i);
            }
        }
    }
    public static void listAllStudent() {
        if (StuList.isEmpty()) {
            System.out.println("There are no student in list");
            return;
        }
        System.out.println("The list student :");
        for (Student x : StuList) {
            System.out.println(x);
        }
    }
        
    }


