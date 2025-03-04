
package data;


public class Dog {
   
    public String name;//_____
    private int yob;   //______
    private double weight;//_____

    public Dog(String name, int yob, double weight) {
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
    //ta chủ động đưa nhiều info của ta ra
    public void bark() {
        //System.out.println("Gogogogogo..... my name is" + name);
        //System.out.println("Gogogogogo..... my yob is " + yob);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                     name, yob, weight);
        
        
        
        
    }

    @Override //khác Overload đó nhen, dính đến kế thừa
    //cả 2 đều có liên quan đến 1 khái niệm POLYMORPHISM - 50 sắc thái,đa nhân cách
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại đc quyền, vì chỉ cần trả về chuỗi info của mình
        //y chang mình làm card visit
        //String tmpMsg = String.format("|%-10s|%4d|%4.1f|",
        //                             name, yob, weight);// trả về chuỗi thô, không xuống hàng
        //return tmpMsg;
        return String.format("|%-10s|%4d|%4.1f|",
                                     name, yob, weight);
    }
    
    // hàm gắn với việc xử lí thông tin của chính object.Ai giàu info, gã đó nên xử lí
    public  int getAge() {
        return 2021 - yob;
    }
    // viết code kiểu này gọi là hard-code, fixed-value , năm sau phải sửa code thì tuổi
    // mới đúng .
    //chuẩn : lấy giờ hệ thống Window - yob;
    
    
    
    
        
    }
   
    //một object bất kì có nhiều info mô tả , vd: xem ddtddd trên tgdđ, đập hộp có sách
    //ghi thông số.Nhìn 1 cuốn sách trên mạng: tác giả, ngày xb, mã số,..
    //gặp chú CSGT ,show ra các info mình có : CCCD,diver lic, Cà- vẹt
    //Việc show info của một object là tự nhiên ,PB profile
    // đó là 1 hành động nên có của mỗi object, mô tả, đặc tả về object
    // hành động này có thể do ta chủ động tự đưa ra , hoặc tự generate theo template có sẵn
    // template có sẵn Java giúp mình , mình không cần code
