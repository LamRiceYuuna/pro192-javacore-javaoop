package data;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
          Car car1 = new Car("FirstCar", 200);
          Car car2 = new Car("SecondCar", 150);
          int compareResult = car1.compareTo(car2);
          if (compareResult == 1) {
              System.out.println("Firs Car rate GRATER than Second Car");
              
          }
         
          car1.compareTo(car2);
        
        System.out.println("My Code Run Fine!!!");
    }
    
}
