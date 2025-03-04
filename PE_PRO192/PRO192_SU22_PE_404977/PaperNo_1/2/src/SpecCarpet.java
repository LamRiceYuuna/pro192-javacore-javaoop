
public class SpecCarpet extends Carpet{
    private int color;

    public SpecCarpet() {
    }

    public SpecCarpet(String maker, int size, int color) {
        super(maker, size);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.color;
    }
    
    public void setData() {
        String maker = super.getMaker();
        super.setMaker(maker.substring(0, 3) + "HOA" + maker.substring(5));
    }
    
    
    
    
    
}
