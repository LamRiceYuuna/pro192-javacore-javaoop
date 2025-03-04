package basicarray;

/**
 *
 * @author admin
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithPrimitiveArrayV2();
        //playWithPrimitiveArrayV3();
        //playWithStudentObject();
        //playWithStudentArray();
        //playWithObjectArray();
        sortObjectArrayV2();
        //sortPrimitiveArrray();
    }

    public static void sortObjectArrayV2() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123456", "BÌNH LÊ", 200, 5.0);

        System.out.println("Before sorting b gpa, ");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        //Sắp xếp mảng object- mảng của các biến object mà trỏ vào object
        //chẳng qua đổi vị trí trỏ, thay đổi value, tọa độ vùng object
        //mà đang được lưu trong các biến con trỏ
        //đổi cách trỏ của từng biến mảng. chơi biến trung gian
        //khi nào thì đổi , nhắm mắt đổi là sai
        //giả bộ sắp xếp điểm trung bình
        //nếu thứ tự trỏ vùng new đã đúng thứ tự điểm, để im
        //nếu điểm của arr[0] đang trỏ > điểm arr[1] đang trỏ
        
        //nếu [con trỏ đứng trc ] > [con trỏ đưg sau]
        //nếu    [0]              >    [1]   
        
        //tuyệt đối không dùng toán tử ><= cho các biến object, vì đi so sánh
        //tọa độ, địa chỉ là vô nghĩa
        //chấm bên trong đia chỉ, chấm bên trong tọa độ, vào bên trong object
        //vào trong value phức tạp, lấy value khác ra mà xem, mà so sánh
        //sv1 so sánh vs sv2 vớ vẩn . lấy điểm so sánh với còn có lí
        //tao ngồi ghế 0 mà lại lớn hơn m ngồi ghế 1
        //swap thôi, swap đ ăn đòn, swap trỏ
        if (arr[0].getGpa() > arr[1].getGpa()) {

            Student t = arr[0];
            arr[0] = arr[1];
            arr[1] = t;

            System.out.println("After sorting by GPA,The student list");
            for (int i = 0; i < arr.length; i++) {
                arr[i].showProfile();

            }
            //phần tử đầu của mảng thay vì trỏ vùng new 9 , nayn trỏ vùng new 5
            //SẮP XẾP MẢNG object , vùng new giữ nguyên
            //đổi cách trỏ [i] trong mảng
            //[thằng đầu mảng] trỏ vùng new nhỏ
            //[thằng kế mảng] trỏ vùng new to

        }
    }

    public static void sortPrimitiveArrray() {
        int a = 9;
        int b = 5;
        //in a trước , in b sau, giảm dần value 
        //t mún tăng dần value       5  9
        System.out.println("a: " + a + " |b " + b);
        //backup a 9 trước khi a chơi vs nhỏ 5

        // chỉ đổi , sắp xếp khi lộn xộn thứ tự, a> b lộn xộn tăng dần
        //nếu đứng trước mà lớn hơn về value , rõ ràng đổi value
        //if(a > b ) thì ms swap
        if (a > b) {
            int tmp = a;//tớ temporary, temp, tmp, t 9 heng
            a = b;// t cần value nhỏ vì tao ngồi đầu, vì t ngồi đầu tiên, nên mang nhỏ
            //cho tao đi
            b = tmp;//vẫn còn 9 heng        
            System.out.println("a: " + a + " |b " + b);

        }

    }

    public static void sortObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123456", "BÌNH LÊ", 200, 5.0);
        //[0] đừng trỏ điểm to nữa, sẽ bị in trước, in trước sẽ ko giảm dần
        //[0] m lên trỏ điểm nhỏ thì hay hơn
        Student t = arr[0];//cho tớ tmp trỏ điểm 9 vs 
        arr[0] = arr[1]; // int a = 5 , b = a//cho tao b xin value của m
        arr[1] = t;//chỗ kế đầu barg xin trỏ lại 9 ngày xưa của anh [0]
        //new BINH đang được 2 con trỏ

        System.out.println("After sorting by GPA,The student list");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();

        }
        //phần tử đầu của mảng thay vì trỏ vùng new 9 , nayn trỏ vùng new 5
        //SẮP XẾP MẢNG object , vùng new giữ nguyên
        //đổi cách trỏ [i] trong mảng
        //[thằng đầu mảng] trỏ vùng new nhỏ
        //[thằng kế mảng] trỏ vùng new to

    }

    public static void playWithObjectArray() {
        Student[] arr = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123456", "BÌNH LÊ", 200, 5.0);
        System.out.println("The student list");
        for (Student x : arr) {
            //x = arr[0]; x=  arr[1] 2 chàng x và arr[0] cùng trỏ new AN nguyễn
            x.showProfile();
        }
        //sắp mảng tăng dần theo điểm trung bình 
        //lí thuyết, bạn[0] sẽ có điểm 5
        //              [1]            9

    }

    public static void playWithStudentArray() {
        //lưu hồ sơ sinh viên 10 bạn
        //10 biến/tên tắt  + 10 value phức tạp ~ tương đương 10 nhát new () cái đã
        //lưu 10 số tự nhiên
        //10 biến /tên tắt + 10 value đơn
        //int a1, a2, a3, a4, ....
        int arr[] = new int[10]; //arr[0] ~ int x; arr[1] ~ int y
        // = value đơn từ từ
        Student s1, s2, s3, s4, s5, s6, s7; //lẻ
        //s1 = ngoặc tròn
        //     x[0] [1] [2]
        Student list[] = new Student[3];//dừng nhầm lẫn về khi new, 2 loại ngoặc
        //ngoặc () gọi phễu đúc 1 obj
        //ngoặc [] tao cần ? biến đối tượng
        // [] dánh cho nhiều biến , nhiều tên gọi tắt                               
        list[0] = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        list[1] = new Student("SE123456", "BÌNH LÊ", 200, 5.7);
        list[2] = new Student("SE123456", "CƯỜNG VÕ", 1999, 5.8);
        //mấy con trỏ còn lại mang giá trị gì???Biến Student chưa gán mang
        //giá trị gì
        //list[3]... list[9] ??? 0 là default
        //                      trỏ vào tọa độ 0 của ram
        //                      byte đầu tiên trong thanh ram toàn là số offoffoff
        //tức là byte đầu tiên (thứ 0) tọa độ thứ 0 của ram chứa toàn số 0
        //byte NULL Byte không chứa j cả
        //in mảng cái coi
        System.out.println("The list of students:");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
            //tao chỉ là một biến Student x thôi mà
        }

        s1 = null; //tao trỏ đáy ram heng, null heng, làm biếng new
        //có value rồi, số 0 , tọa độ 0 ở đấy ram, đi vào 0000

        s1.showProfile(); //có mẹ j mà show,NullPointerException 

        //Nguyên tắc khi chơi vs mảng phải là: một biến count để cho biết
        //mảng đã đã gán value đến đâu, for đến đó, ko for đến .length
        //bị default vs primitive , bị null vs mảng obj
    }

    public static void playWithStudentObject() {

        Student x; //tớ sẽ nói về 1 đứa heng
        x = new Student("SE123456", "AN NGUYEN", 2001, 5.6);
        x.showProfile();
    }

    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20};//new ngầm , ko nói rõ việc new, thực ra có 
        int arr3[] = new int[]{5, 10, 15, 20};
        int arr2[] = new int[5];
        int arr[];
        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu cầu
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        //arr là j, mày là 1 biến đb,m là biến object luôn, vì trỏ 1 vùng new bự
        //có quyền chấm, chấm cái j?? tệ nhất toString()
        //arr là nhiều biến phức tạp vì có nhiều info bên trong,info này là
        //phần tử của mảng
        //arr[0] ~~~ arr.get(0)---> được 5 / arr[0] đc 5
        //arr.lenght~ biến lưu dđ lưu của 1 mảng , có bao nhiêu phần tử
        //   ->static hay non?non, vì nếu static mọi mảng cùng kích thước 
        //arr.length; //hằng số đb, ăn theo từng mảng, mỗi mảng khác size
        System.out.println("Array has: " + arr);
        //gọi thầm tên em, convert data của
        //các biến thành mã hexa
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        //arr. xổ ra j ? public của vùng new
        //arr[0]. k xổ đc vì là biến primitive, tên biến phức tạp 
        //nhưng tao vẫn đơn giá trị(tên tao có ngoặc vuông do trùng tên n
        //                           nhưng tao là value đơn giản)
        System.out.println("");
        for (int x : arr) {
            System.out.print(x + " ");

        }

        //get(),set() không có mà thay = chơi trực tiếp vs []
        //thay đổi bên trong biến/phần tử
    }

    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //bien ct    new Object()
        //     ref   new Object()
        double arr[] = new double[10];//default  gán hết bằng 0
        //new() là phễu để đúc object!!
        //em mú có 365 biến double , nó là biến lẻ nè nè
        //     arr[0], arr[1], arr[i]...

        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        System.out.println("The array has values of (for i) ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            //arr[0]. éo xổ ra j vì nó là biến primitive
            //arr.length
            //Dù là mảng primitive hay mảng mẹ j chưa biết
            //tên mảng là biến má mì, tú ông tú bà, biến object, biến con trỏ, reference
            //tao sẻ trỏ vùng ram chà bá lửa new đó, không đúc truyền thống
            //                                      mà đúc nhiều biến
            //MÁ MÌ SẼ QUẢN LÍ BN CHÁU DƯỚI QUYỀN,ĐQ CỦA MÁ MÌ
        }
        System.out.println("The array has values of (for each) ");
        for (double x : arr) {
            System.out.print(x + " ");

        }

    }

    public static void playWithPrimitiveArray() {
        //double vol[365];  //Java cấm khai báo kích thước mảng, số phần tử trong mảng[]
        //float v[365] = {0, 0, 5, 10, 15, 20, 25};
        float v[] = {0, 0, 5, 10, 15, 20, 25};//mảng có 7 phần tử , có sẵn lun value
        //7 biến float v[0] = 0; v[1] = 0; v[2] = 5,...
        //7 biến float nằm trong HEAP đấy, có new ngầm đấy, có malloc() đấy
        System.out.println("The array has values of (printed by individual) ");
        v[0] = 6868;

        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        // ta có thể xem mảng  như 1 tập hợp các value trong dấu {} giống Toán
        //ta có thể xài khái niệm với mọi , với mỗi để duyệt qua toàn bộ mảng
        System.out.println("\nThe array v has values of (using for each)");
        for (float x : v) {
            //x = v[0], x = v[1], x = v[2], x = v[3]
            //với mỗi x là 1 biến lẻ,=từng thg lẻ trong mảng sỉ
            //sout(v[i])~~~~ sout(x)
            System.out.print(x + " ");

        }

    }
    //N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ...};    
    //V x e N,x là mấy , x là bất kì trong N
    //x = 0, x = 1,x = 2, x = 3
    //với mọi là kĩ thuật quét qua mảng 
    //dùng đèn pin quét từ đầu đến cuối
    //kĩ thuật dùng 1 con số tự nhiên 
    //duyệt qua tất cả phần tử của tập hợp
    //V int x e N, x = N[0], x = N[1],x = N[2]      

}
