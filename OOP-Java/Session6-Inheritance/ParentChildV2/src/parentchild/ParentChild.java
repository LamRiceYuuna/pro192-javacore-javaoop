
package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithParentNChild();
    }
    public static void playWithParentNChild() {
        Parent p = new Parent("BIỆT THỰ", "100BTC");
        p.showProfile();
        //Khai cha new cha , zậy . xổ ra j?? xổ cái j của cha
        
        Child c1 = new Child("NHÀ PHỐ", "100ETH", "DU THUYỀN");
        c1.showProfile(); //nếu k làm riêng xài lại , theo quy tắc của Ba
        //muốn qua mặt, còi to cho vượt, hãy tự làm đi, @Override
        
        //Khai con = new con , . xổ ra j? xổ tất cả những j cha cho/thừa kế
        //                                xổ riêng con có j xổ đó (@ + biến dị) 
        
        //KHAI GÌ NEW LẤY THÌ XỔ CÁI NẤY, XỔ TẤT CẢ CỦA KHUÔN MÀ TA KHAI BÁO
        c1.sayHi();
        
        
        //Cú chot Khai cha = new Con ,đọc theo kiểu kế thừa , gáy ngoài đường 
        //mày biết t con của ai k?? ba t không vừa đâu, dùng danh nghĩa dòng họ
        //khẩu khí của dòng họ, cha, chứ không phải mình
        
        Parent c2 = new Child("CĂN HỘ CAO CẤP", "DOGECOIN", "MOTOR");
        c2.showProfile();
        
        //c2.sayHi();
        
        
        //chỉ xổ ra những gì của cha , không xổ của riêng con
        //riêng con có 2 thứ : @ và khác biết hoàn toàn 
        //nếu Con trùng vs Cha tên hàm , gọi Cha nhưng chạy Con
        
        //đang dùng danh nghĩa Cha , thì cư xử như Cha, Cha éo có sayHi() lấy j mả xổ
        //Trong RAM vẫn có sayHi đấy, vì new Child() có sayHi()
        //clone khuôn Child như nhau, quan trọng biến con trỏ
        
        //List<Student> list = new ArrayList();
        //  Cha                     con
        
        //kĩ thuật chạm vào thứ riêng của con 
        //ba k biết trong SG con đg làm j, zậy làm sao để biết
        //Dùng kĩ thuật drift con trỏ
        //kéo dẫn con trỏ Cha -> kéo xuống dưới đáy new Child()
        //cần con trỏ tạm để lấy đc đáy new Child()
        Child x = (Child)c2; // cần trỏ vùng new Child
        //c2 vẫn là parent, tương đương sợi dây thun
        //ép CHÓ THÀNH MÈO , kĩ thuật ép kiểu
        x.sayHi(); //HELLO MOTOR // 2 Chàng 1 nàng
        
        //cách lầy lội hơn, xuất phát từ cách một k thèm xài con trỏ tạm
        //(Child)c2.   //Do dấu chấm quá mạnh, chấm sát ai thì cư xử theo type đó
        //Ép xong rồi mới chấm, thay đổi độ ưu tiên
        ((Child)c2).sayHi(); //7 bài thí ng về con trỏ new Dog().bark()
    }
}
