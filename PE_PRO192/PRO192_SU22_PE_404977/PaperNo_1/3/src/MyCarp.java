
import java.util.List;


public class MyCarp implements ICarp{

    @Override
    public int f1(List<Carp> t) {
        int count = 0;
        for (Carp x : t) {
            if("13579".contains("" + x.getPond().charAt(1))){
                count++;
            }
               
        }
        return count;
    }

    @Override
    public void f2(List<Carp> t) {
        int pos = -1;
        for (int i = 0; i < t.size(); i++) {
            if(check(t.get(i).getPond())) {
                pos = i;
                break;
            }
        }
        t.get(pos).setState(88);
    }

    @Override
    public void f3(List<Carp> t) {
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1 ; j < 6; j++) {
                if(t.get(i).getState() > t.get(j).getState()){
                    Carp tmp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, tmp);
                
                }
                if(t.get(i).getState() == t.get(j).getState()) {
                    if(t.get(i).getPond().charAt(1)> t.get(j).getPond().charAt(1)){
                    Carp temp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, temp);
                
                }
            }
        }
    }
    }

    public boolean check(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        if (stringBuffer.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }
    
}
