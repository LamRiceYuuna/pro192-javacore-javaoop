
package data;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String [] args){
        Car car1 = new Car("FirstCar", 200);
        Car car2 = new Car("SecondCar", 150);
        Car car3 = new Car("Toyota", 190);
        // Tao moi 1 list, kieu du lieu la int
        List<Integer> my_ints = new ArrayList<Integer>();
        // Tao moi 1 list, kieu du lieu la Car
        List<Car> car_list = new ArrayList<Car>();
        // Bo xung cac phan tu vaof list
        car_list.add(car1);
        car_list.add(car2);
        car_list.add(car3);

        my_ints.add(2);
        // Lay so phan tu cuar list:
        System.out.println("So Phan Tu: " + car_list.size() + "\n");
        //Duyet qua cac phan tu cua List, cach 1
        System.out.println("CACH DUYET 1:"); 
        for (Car my_car: car_list){
            System.out.println("car Info: " + my_car);
        }
        System.out.println();
        // Duyet qua cac phan tu cua List, cach 2
        System.out.println("CACH DUYET 2:");
        for (int i0 = 0; i0 < car_list.size(); i0++){
            // de lay car o chi so i0, ta dung: car_list.get(i0)
            Car my_car = car_list.get(i0);
            System.out.println(i0 + ", car Info: " + my_car);
        }
        System.out.println("My Code Run Fine!!!");
    }
}
    

