/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws1;

/**
 *
 * @author admin
 */
public class WS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean result = isPrime(0);
        System.out.println("0: " + result);
        System.out.println("101: " + isPrime(101));
        System.out.println("117: " + isPrime(117));

    printPrimeList();
    }
    //in các số nguyên tố từ 1...100
    public static void printPrimeList() {
        System.out.println("The list of prime from 1...1000");
        for (int i = 1; i <= 100; i++) 
            if(isPrime(i) == true)
                System.out.print(i + " ");
        }
    
    
    
    
    
    
    
    
    
    
    
    public static boolean isPrime (int n) {
        if(n < 2)
            return false;
        //else rồi đấy nếu CPU đến đây
        //kiểm tra xem trong khoảng từ 2 đến căn (n)
        //lỡ tay chia hết đứa lào k, có kl ngay k ntố
        if(n == 2)
            return true;
        //for 2 ... căn n , n ơi , máy có chia hết đứa nào từ căn ?
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0)
                return false;//m lỡ tay chia hết trong đoạn từ [2..căn]
        //hết for r mà k thoát sớm , đích thị k chia hết đứa nào 
        // sure kèo là số nguyên tố
        return true;
            
        
 
    }
        
        
        
}
