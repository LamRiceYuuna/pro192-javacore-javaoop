
package Main;

public class Main extends Shape{
 
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.a);
    }
}
class Shape {
    protected int a;
    
    protected Shape() {
        a = 10;
    }
}

