/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

import java.util.Scanner;

public class POE {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login login = new Login();
        
        System.out.println("--- Registration ---");
        System.out.println("Enter first name");
        String firstName = input.nextLine();
        
        System.out.println("Enter last name");
        String lastName = input.nextLine();
        
        System.out.println("Enter username");
        String username = input.nextLine();
        
        System.out.println("Enter password");
         String password = input.nextLine();
        
        System.out.println("Enter a South African cell phone number with +27");
        String cellNumber = input.nextLine();
        
       String registrationMessage = login.registerUser(firstName, lastName, username, password, cellNumber);
       System.out.println(registrationMessage);
       
       if (registrationMessage.equals("User registered successfully")) {
        System.out.println("\n--- Login ---");
        System.out.print("Enter username to login");
        String loginUsername = input.nextLine();
        
        System.out.println("Enter password to login");
        String loginPassword = input.nextLine();
                
        String loginMessage = login.returnLoginStatus(loginUsername,loginPassword);
        System.out.println(loginMessage);
       }

    input.close();
  }
}


    
    
            
            
            
            
            
            
        
    

