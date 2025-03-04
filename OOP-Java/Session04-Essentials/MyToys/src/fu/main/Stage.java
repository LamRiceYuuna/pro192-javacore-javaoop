/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.main;

import fu.util.MyToys;

/**
 *
 * @author admin
 */
public class Stage {

    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0;
        System.out.println("PI Again : " + MyToys.PI);
        
//        int n = MyToys.getAnInteger();
//        System.out.println("n: " + n);
        int choice;
        choice = MyToys.getAChoice("Mời nhập lựa chọn của bạn (1..7): ");
        System.out.println("Lựa chọn của bạn là:(your choice) " + choice);

    }
}
