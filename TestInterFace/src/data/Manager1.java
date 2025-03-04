
package data;

import java.util.List;

public class Manager1 implements CarManager{
    @Override
    public int getAverage(List<Car>car_list) {
        int numberOfCars = car_list.size();
        if ( numberOfCars == 0)
            return 0;
        int sum = 0;
        for (Car x: car_list) {
            sum += x.getRate();
            
        }
            return sum / numberOfCars;
        }


    }
    @Override
    public int getMaxPrice(List<Car>car_list) {
    int maxPrice = 0;
    for ( Car)
    
     return 0;
    }
    
}
