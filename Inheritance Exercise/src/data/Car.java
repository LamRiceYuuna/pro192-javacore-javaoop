
package data;


public class Car {
    private String maker;
    private int price;
    
    public Car() {
        
    }
    
    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
           
    }

   

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        
        return String.format("|%-6s|%4d|",
                              maker,price);
                              
    }
    
    

     
}
