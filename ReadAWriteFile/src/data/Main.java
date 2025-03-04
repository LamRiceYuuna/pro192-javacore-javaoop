package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    
    static int readFromFile(Student[] studentList) throws FileNotFoundException, IOException {
        File f = new File("danhsachsv.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int i = 0;
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            if (line.startsWith("Danh Sach Sinh Vien")) continue;
            String[] data = line.split("[,]");

            String name = data[0].trim();
            int age = Integer.parseInt(data[1].split("[:]")[1].trim());
            String code = data[2].split("[:]")[1].trim();
            double pro192 = Double.parseDouble(data[3].split("[:]")[1].trim());
            double calculus = Double.parseDouble(data[4].split("[:]")[1].trim());
            
            Student s = new Student(name, age, code, pro192, calculus);
            studentList[i++] = s;
        }
        
        br.close();
        fr.close();
        return i;
    }
    
    public static void main(String [] args) throws IOException{
        System.out.println("File Projects!");
        Student[] temp = new Student[200];
        int size = readFromFile(temp);
        Student[] studentList = new Student[size];
        for (int i = 0; i < size; i++)
            studentList[i] = temp[i];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon xem thong tin cua sinh vien nao, hay dien ma so sinh vien: ");
        String code = sc.nextLine();
        boolean found = false;
        
        for (Student s : studentList) {
            if (s.getCode().equalsIgnoreCase(code)) {
                System.out.println(s);
                found = true;
                
                System.out.println("Ban co muon lay file tong ket cua sinh vien khong ? (Yes / No)");
                String choice = sc.nextLine();
                if (choice.equals("Yes")) {
                    String fileName = "";
                    
                    for (int i = 0; i < s.getName().length(); i++)
                        if (s.getName().charAt(i) == ' ') fileName += '_';
                        else fileName += s.getName().charAt(i);
                    fileName += '_' + s.getCode() + ".txt";
                    
                    s.writeToFile(fileName);
                }
            }
        }
        if (!found) 
            System.out.println("KHONG TIM THAY!!!");
    }
}