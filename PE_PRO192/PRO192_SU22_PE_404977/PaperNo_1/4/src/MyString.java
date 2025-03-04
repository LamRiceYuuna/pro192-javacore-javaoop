
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            if(Character.isDigit(digit)){
                int number = Integer.parseInt(digit + "");
                if( number == 3 || number == 2 || number == 5 || number == 7 ){                
                    count++;               
            }
        }
        
            
        
    }
        return count;
    }

    @Override
    public String f2(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
        
    
}
