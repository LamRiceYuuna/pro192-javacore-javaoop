
package DTO;

public class Colony extends Organization {
    private String place;

    public Colony() {
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound");
    }
    
    public void grow(){
        System.out.println("An annual cycle of growth that begins in spring");
    }
    
        public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
        
    @Override
    public String toString(){
        String x = super.toString();
        return x + "The colony's place is " + this.place;
    }
}
