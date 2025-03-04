
package DTO;

public class BeeColony extends Colony implements Role{
    private String type;

    public BeeColony() {
    }

    public BeeColony(int size ,String type, String place) {
        super(place, size);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "The colony type is " + this.type  + "\n" + super.toString() ;
    }
    
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
    
}
