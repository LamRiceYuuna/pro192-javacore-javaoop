/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.*;

public class Main {
    public static void main(String [] args){
        System.out.println("File Projects!");
        // Student x =  new Student("Nam", 19);
        // x.write_file_info();
        
        String line;
        Student [] my_student_list = new Student[100];

        try {
            BufferedReader bufferreader = new BufferedReader(new FileReader("danhsachsv.txt"));
            int idx = 0;
            while ((line = bufferreader.readLine()) != null) {     
            System.out.println(idx + ": " + line);
            // ====
             if (0 < idx){
                 String [] all_info = line.split(", ");
                 for (String xx0: all_info){
                     System.out.println("My INFO is: " + xx0);
                 }
                 String name = all_info[0];
                 int age = Integer.parseInt(all_info[1].substring(5, 7));
                 String mssv_code = all_info[2].substring(14, 22);
                 Student current_student = new Student(name, age, name, age, age);
                 my_student_list[idx - 1] = current_student;
             }
            // =====
            idx++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         for (Student x00 : my_student_list){
             if (x00 != null)
             System.out.println(x00);
         }

         my_student_list[1].WriteToFile();
         my_student_list[3].WriteToFile();

    }
}