
package data;


public class  SpecCar extends Car {
    private int type;
    

    public SpecCar(){
    }
    
    
    public SpecCar(String maker, int price, int type){
        super(maker,price);
        this.type=type;
        
    }

    @Override
    public String toString() {
        return String.format("|%-6s|%4d|%4d|",
                                super.getMaker(),super.getPrice(),type);
                
    }

 
    

    
    public void setData(String maker, int price){
        setMaker(maker);
        setPrice(price);
    }
          
    public void setData () {
        super.setMaker("default marker");
        super.setPrice(100);
    }
            
    
    
    public int getValue(){
        int x = getPrice();
        
        return x + 20;
    }

    
}

