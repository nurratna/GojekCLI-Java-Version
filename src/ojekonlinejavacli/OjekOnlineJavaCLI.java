/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ojekonlinejavacli;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class OjekOnlineJavaCLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String[] user = null;
        
        String userFilename = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\OjekOnlineJavaCLI\\src\\data\\user.txt";
        File userFile = new File(userFilename);
        
        /**
         * pengecekan file user.txt ada atau tidak
         */
        if (userFile.exists()) {
            System.out.println("You have been registered. Please login!");
            login();
        } else {
            register();
        }
        
        if (user != null) {
            System.out.println("");
            System.out.println("Welcome to Ojek Online Apps");
            System.out.println("");
            
            System.out.println("1. View Profil");
            System.out.println("2. Order Ojek");
            System.out.println("3. Topup Saldo");
            System.out.println("4. View Order History");
            System.out.println("5. Exit");
            System.out.print("Input your option: ");
            int option = in.nextInt();
            
            switch (option) {
                case 1 :
                    viewProfile();
                    break;
                case 2 :
                    orderOjek();
                    break;
                case 3 :
                    topupSaldo();
                    break;
                case 4 :
                    viewOrderHistory();
                    break;
                case 5 :
                    System.out.println("Thank for use Ojek Online Apps");
                    System.exit(0);
                default :
                    System.out.println("Wrong option!");         
            }
        }
    }
    
}
