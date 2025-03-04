
package data;


//CLB của những gã thích đua đến chết
//Gom những object mà có chung hành động đua, ko care việc j khác
//CLB là nơi tập hợp những người chung tiếng ns, hành động ,giao tiếp/interface
//Cũng là hình thức gom khuôn, gom object phân loại về cái gì đó, nhóm gì đó
//lỏng lẻo hơn kế thừa, ko care đặc điểm, đi truyền dd, chung hành động vào
//chơi chung
//Motor, dog,... is a member of, is a deadracer
//AE là student, sinh ra là sv
//AE mình là cần thủ, cờ thủ, sát thủ, ..., game thủ, đua thủ
//ae mình nhìn theo dòng họ: cháu ở nhà ngoan lắm
//1 object, khuôn hội nhập theo 2 cách: dòng họ bà con, hội nhóm xã hội
//Hội bà con: di truyền và kế thừa
//hội xã hội: cùng nhau làm j đi!!

//CLB chỉ quan tâm hành động, trong đây chỉ chứa hành động
//CLB để ar tự hành động theo cách của mình
//vào CLB tiếng anh mình speakEnglish theo giọng mình!!
//đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên yên xe
//cà chân choosg tóe lửa,...
//Interface CLB sẽ để mọi người tự chơi theo cách của mình - chơi - hành động là abstract
//CHỈ NÓI NỘI QUY CLB THOY HENG, MỌI NGƯỜI THEO ĐÓ MÀ LÀM , TỰ MỖI NGƯỜI
//CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT
//ko cần ghi ra từ khóa abstract ở cả tên của clb và tên tên hàm
//VÌ CLB HÀM Ý / NGẦM HIỂU CHỈ CÓ NỘI QUY ĐỂ MỌI NGƯỜI THEO,
//ĐỂ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU INTERFACE LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG
//

//JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG ....!!!

public interface DeathRacer  {
    
    //phàm ai chọn nghề tham gia đua thủ , thì phải đua!!!
    //public abstract double runToDeath();
    public double runToDead();
    
    public void showHowToDead(); //gáy bằng tổ quốc ghi công
    
}
