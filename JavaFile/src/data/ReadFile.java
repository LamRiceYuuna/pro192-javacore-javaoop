package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Part 1 Read file danhsachsinhvien

public class ReadFile {

    public static void main(String[] args) {
        try {
            File myFile = new File("danhsachsinhvien.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        
        saveFileStudent();
        
    }

    public static void saveFileStudent() {
        Student s1 = new Student("Tran Hai Binh", 20, 8, 7);
        Student s2 = new Student("Nguyen Xuan Nam", 21, 9, 6);
        Student s3 = new Student("Tran Thi Hoang", 20, 6, 6);
        Student s4 = new Student("Nguyen Hoang Minh", 19, 8, 7);
        Student s5 = new Student("Tran Xuan Binh", 20, 5, 7);
        Student s6 = new Student("Trinh Nam Anh", 20, 9, 9);
        s1.showProfile();
        s2.showProfile();

    }
}
