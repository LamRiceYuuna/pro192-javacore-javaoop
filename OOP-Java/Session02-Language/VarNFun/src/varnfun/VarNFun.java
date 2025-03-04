package varnfun;

import java.util.Scanner; //~ #iclude <stdio.h>

/**
 *
 * @author admin
 */
public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = getAPositiveInteger();
        System.out.println("Your number:" + n);
        
        printIntegerList(n); //truyền tham trị , pass by value
                             //value từ n của hàm main() sẽ được đưa qua ngõ/ngả 
                             //phễu máy xay,n main() đập ngang sang n của hàm
                             
                             //OOP - pass by reference - truyền thái y, truyền tham chiếu
                             //              con trỏ , địa chỉ
                             //
        //playWithVariable();
        //playWithBooleans();
        //printIntegerList(500); // hard-code đầu vào, code cứng , cố đinh value/literal
        //playWithCharacters();//k mềm mại, không linh hoạt
        //playWithIntegers();//bạn muốn in đến mấy???hỏi và nhập
        //playWithDoubles();
    }
    public static int getAPositiveInteger() {
        int n;
        //nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lụa, name,charAt()
        Scanner banPhimCuaTui = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
    
    
    
        return n; //getAPositiveInteger() = n
    }
    //muốn in n số tự nhiên tính từ 1
    //hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
    //đầu vào, mà phải khác trên data type chứ không phải khác trên tên biến
    //Được gọi là OVERLOAD/OVERLOADING. - Quá tải hàm
    //vs OVERRIDE
    //POLYMORPHISM -> ĐA HÌNH
    //giống như: quá tải5 anh em trên một chiếc xe Wave
    public static void printIntegerList(int n) {
        //Chỉ có thằng ngáo ms scanf(n) here !! n đã có value khi xài
        //body of function . nghiền, trộn , xử lí vs đầu vào giả định sẽ đưa qua tên gọi 
        //giải quyết trên công thức 
        System.out.println("The list of " + n + " first integers");
        
        for (int i = 1; i <= n; i++) 
            System.out.printf("%d ", i);
            System.out.println("\n");
            //System.out.print(i + " ");
            
        
        
    
    }
    
    
    //in ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            //System.out.println("%d", i);
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    public static void playWithBooleans() {
        //C: đúng 1, >0, sai:0, int
        //Java: đúng: true, sai:false, -> boolean
        boolean marriedStatus = true;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
      
        
    
    
    
    
    
    
    }
    public static void playWithCharacters() {
        //2 byte cho kiểu char , lưu bảng mã Unicode,
        char m = '$';
        System.out.println("unit: " + m);
        //tên em thì sao? C: mảng các kí tự, ko primitive nữa rồi, phức tạp rồi
        //           char name[] = "Ahihi";
        
        
        String name = "Nguyễn Bảo Lâm"; //Loại data type mới hoàn toàn 
                                        // phức tạp , do nó gom n thứ khác lại
                                        //object data type, học sau
        System.out.println("My name is: " + name);
        System.out.println("My 1st letter of my name: " + name.charAt(0));
        System.out.println("My name as in lowercase: " + name.toLowerCase());
        //C:string.h -> strlwr(),....

    
    
    
    
    
    
    }
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;//double chiếm 8 byte
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n ", pi);//cấm không dùng %lf 
        
        float vat = 0.1F;  //do quy ước//float chiếm 4 byte
        System.out.println("vat:" + vat);

        
        
    
    
    
    
    
    
    
    
    
    }
    public static void playWithIntegers() {
        int n = 39;  //mọi con số, kí tự  xuất hiện trong code được gọi là  
                     //literal value
                     //số nguyên xuất hiện trong code mặc định là int 
                     // int chiếm 4 byte
        System.out.println("n: " + n );
                     // long chiếm 8 byte
        long m = 3_000_000_000L; //_ phân cách literal trong code cho dễ đọc
        System.out.println("m: " + m );
        
        int status = 0xFA;//hệ 16
        System.out.println("status: " + status );
        
        int phone =  010; // 0 đứng trước hệ 8 octal
        System.out.println("phone: " + phone);
     
        
        
        
        
        
    
    
    
    
    
    }
    //static thì chỉ chơi vs static - OOP
    public static void playWithVariable() {
        //biến là một vùng ram được đặt tên , chiếm một số byte nhất định tùy loại
        //dữ liệu, thông tin mà nó sẽ chứa bên trong - data type - hình thức data 
        //số , chữ , ảnh , ...
        //biến là cách đặt tên cho một đại lượng giá trị, một giá trị  - đơn,phức
        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong RAM 
        System.out.println("Age: " + age); //printf("age: %d\n", age);
        
        int yob = 2002; //year of birth  
        age = 2022 - yob;
        
        System.out.println("Age again: " + age);
        
        System.out.println("Age by using transitive tech: " + (2022 - yob));
        
        System.out.printf("Age printed by using %% as in C : %d\n ", (2022 - yob));

        
        
    }
        
        
}
