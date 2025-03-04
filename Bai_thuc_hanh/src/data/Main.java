
package data;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentList a = new StudentList();
        int choice = 0;
        String code;
        String name;
        int mark = 0;
        do {
            System.out.println("You want to choice number ?");
            System.out.println("1.Add new student");
            System.out.println("2.Search a student");
            System.out.println("3.Update name and mark");
            System.out.println("4.Remove a student");
            System.out.println("5.List all student");
            System.out.println("6.Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    a.addNewStudent();
                    System.out.println("Add successfull");
                    break;
                case 2:
                    System.out.println("Student code you want to find : ");
                    code = sc.nextLine();
                    if (a.studentSearch(code) == null) {
                        System.out.println("Not exist");
                    } else {
                        System.out.println(a.studentSearch(code));
                    }
                    break;
                case 3:
                    System.out.print("Enter code you update : ");
                    code = sc.nextLine();
                    System.out.print("Enter name : ");
                    name = sc.nextLine();
                    System.out.print("Enter mark : ");
                    mark = Integer.parseInt(sc.nextLine());
                    a.Update(code, name, mark);
                    System.out.println("Update successful");
                    break;
                case 4:
                    System.out.print("Enter code you want remove : ");
                    code = sc.nextLine();
                    a.Remove(code);
                    System.out.println("Remove successful");
                    break;
                case 5:
                    System.out.println("The list all student");
                    a.listAllStudent();
                    break;
                case 6:
                    System.out.println("Exit successful");
                    break;
                default:
                    System.out.println("Please input positive integer 1 to 6");
            }
        } while (choice != 7);
    }
}

    

