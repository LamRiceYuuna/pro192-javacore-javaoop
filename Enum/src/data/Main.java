package data;

//Nguyen Bao Lam - SE1711
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dates,choice;
        do {
            System.out.println("What day do you want to see the timetable? :");
            dates = sc.nextLine();
            WeekDay.doWorkInFreeTime(dates);
            System.out.println("Do you want to continue viewing the schedule for another day? (Yes/No) :");
            choice = sc.nextLine();
        } while (choice.equals("Yes"));
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        int choice;
//        do{
//           
//        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("|-----------------------------------------|");
//        System.out.println("|--------1.Bạn muốn xem thời khóa biểu----|");
//        System.out.println("|--------2.Thoát khỏi chương trình--------|");
//        System.out.println("|-----------------------------------------|");
//        System.out.println("|---------Lựa chọn của bạn (1/2)?---------|");
//        choice = sc.nextInt();
//        switch(choice) {
//            case 1:
//                System.out.println("Vui lòng nhập số nguyên với quy ước:");
//                System.out.println("Monday = 2, Tuesday = 3, Wednesday =4 ");
//                System.out.println("Thursday = 5, Friday = 6, Saturday = 7, Sunday = 8");
//                System.out.println("Thứ mà bạn muốn xem?: ");
//                        int dates = sc.nextInt();
//                        doWorkInFreeTime(dates);
//                        break;
//            case 2:
//                System.out.println("Bạn chọn thoát chương trình! Bye bye!");
//                System.exit(0);
//                break;
//        }
//        } while( choice >=1 && choice <=2);
//        }
        


                

    



