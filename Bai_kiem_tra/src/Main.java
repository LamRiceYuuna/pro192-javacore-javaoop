import data.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng employee : ");
        int total = sc.nextInt();
        for(int i = 0; i < total; i++){
            System.out.print("Tên employee: " );
            String name = sc.next();
            System.out.print("Salary employee: "
                    + " " );
            int salary = sc.nextInt();
            Employee employee = new Employee(name, salary);
            employees.add(employee);
        }

        System.out.println("Name\tSalary");
        for(Employee employee : employees){
            System.out.println(employee.getName() + "\t" + employee.getSalary());
        }
    }
}
