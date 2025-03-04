package data;

public class Car implements Comparable<Car> {

    private String maker;
    private int rate;

    public Car() {

    }

    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }
    
    
    

    @Override
    public int compareTo(Car ortherCar) {
        if (this.rate > ortherCar.getRate()) {
            return 1;
        }
        if (this.rate == ortherCar.getRate()) {
            return 0;
        }
            return -1;


        
    
        }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    @Override
    public String toString() {
        String ans = "";
        ans += "Car marker: " + this.getMaker() + ", rate: " + this.getRate();
        return ans;
    }
}


