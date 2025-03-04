
package data;

public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c; //tách dòng okie

    
    //nếu em đổ a,b,c ko thỏa 1 tam giác, tổng 2 cạnh bất kì > cạnh còn lại
    //thì phải làm sao??
    //có 2 cách phổ biến
    // cà chớn tao đưa default 3 4 9 -> default 3 4 5
    // ném ra ngoại lệ, chủ động giết áp, vì tam giác cà chớn k xử lí
    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner=" + owner + ", color=" + color + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    //có 1 bộ thư viên , đồ chơi, class khác đưa vào dùng kèm, giống xài Scanner...
    //giúp ko cần làm các thao tác ở trên, tự nó làm giùm , mình chỉ viết mấy câu code
    //ngắn ngắn mà có hết đám trên này, thư viên mang tên LOMBOK
    
    public double getPerimeter() {
        return a + b + c;
    }
    
    public double getArea() {
        //công thức Heron, sqrt(p * ...), p = 1/2 chu vi
        double p = getPerimeter() / 2;
               
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public void paint() {
        System.out.printf("|TRIANGLE  |%-12s|%-8s|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                                   owner, color, a, b, c, getArea());
    }
    
}
