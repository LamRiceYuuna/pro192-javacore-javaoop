/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        String title;
        int price;
        Book b1 = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title:");
        title = sc.nextLine();
        System.out.print("Enter price:");
        price = sc.nextInt();
        sc.nextLine();
        int choice = 0;
        
            System.out.println("1. Test getTitle()");
            System.out.println("2. Test setPrice()");
            System.out.println("Enter TC(1 or 2):");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("OUTPUT:");
                    
                    System.out.println(b1.getTitle());
                    break;
                case 2:
                    System.out.println("OUTPUT:");
                    System.out.println("Enter new price:");
                    int newprice;
                    newprice = sc.nextInt();
                    b1.setPrice(newprice);
                    System.out.println(b1.getPrice());
                    break;

            }

        }

    
    }


