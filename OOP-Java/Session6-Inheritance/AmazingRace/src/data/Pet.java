
package data;


public abstract class Pet {
    //Cha chứa nhân tử chung của đám Con 
    protected String name;
    protected int yob;
    protected double weight;
    //...

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //hành động của  mỗi con thú cụ thể 
    //hành động chạy của mỗi con: Hoàn toàn khác nhau, khác nhau về tốc độ
    //dáng chạy --> ngầm hiểu là xử lí khác nhau!!
    //vậy chạy() là 1 ý tưởng chung chung mà loài pet cần có
    //chạy() là 1 thứ đi kèm Pet, cụ thể thế nào thì tùy từng đứa
    //ABSTRAC METHOD. CÁI GÌ MÀ ÉO CỤ THỂ KHI ĐỀ CẬP VỀ NÓ -> SURE CHUNG CHUNG
    //      ABSTRACT
    public abstract double run();
    
    //mỗi đứa gáy, sủa thành tích theo kiểu khác nhau
    public abstract void showRecord(); // ~~~ paint()  showProfile()
    
}
