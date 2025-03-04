
package data;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        
        return String.format("| %-10s | %2d |",
                name, salary);
    }
    
   
}
