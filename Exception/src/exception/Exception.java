
package exception;

import java.util.Scanner;


public class Exception {


    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int inputInteger() {
        Scanner in = new Scanner(System.in);
   boolean cont = true;
   int n;
   do {
   try {
       System.out.print(“Enter a whole number: ");
       a = Integer.parseInt(in.nextLine());
       cont = false;
     } catch (Exception e) {
       System.out.println("Required integer!");
     }
    } while (cont == true|| n<10 || n>50);
   return n;
}
