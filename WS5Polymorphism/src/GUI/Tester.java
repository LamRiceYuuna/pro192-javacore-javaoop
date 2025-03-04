import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

public class Tester {
        public static void main(String [] args){
        Colony obj1 = new BeeColony(2500 ,"honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        
        University obj2 = new FPTUniversity(80000 ,"FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df = new BeeColony(4000 ,"wasp","land");
        System.out.println(df);
        df.createWorker();

        df = new FPTUniversity(90000 ,"FPT", "Hanoi");
        System.out.println(df);
        df.createWorker();
    }  
}

