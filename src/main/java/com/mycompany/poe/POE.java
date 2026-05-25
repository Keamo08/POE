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
        
        if (loginMessage.equals("Login successfully")) {
            runQuickChat(input); 
        }
        }
       }

    public static void runQuickChat(Scanner input) {
        java.util.ArrayList<Message> sentMessages = new java.util.ArrayList<>();
        java.util.ArrayList<Message> storedMessages = new java.util.ArrayList<>();
        int messagesSent = 0;
        
        System.out.println("\nWelcome to QuickChat.");
        System.out.println("How many messages do you want to enter?");
        int numMessages = Integer.parseInt(input.nextLine());
        
        while (true) {
             System.out.println("\n1. Send Messages");
             System.out.println("2. Show recently sent messages");
             System.out.println("3. Quit");
             System.out.println("Choose an option:");
             int choice = Integer.parseInt(input.nextLine());
             
             switch (choice) {
                 case 1:
                    if (messagesSent < numMessages) {
                        System.out.print("Enter recipient cell number");
                        String recipient = input.nextLine();
                        
                        System.out.print("Enter your message");
                        String msgContent = input.nextLine();
                        
                        Message msg = new Message(messagesSent, recipient, msgContent);
                        
                        System.out.println(msg.getMessageIDString());
                        System.out.println(msg.checkRecipientCell());
                        
                        String lengthCheck = msg.checkMessageLength();
                        System.out.println(lengthCheck);
                        
                        if (lengthCheck.equals("Message ready to send")) {
                            System.out.println("\n1. Send Message");
                            System.out.println("2. Disregard Message");
                            System.out.println("3. Store Message to send later");
                            System.out.print("Choose an option");
                            int subChoice = Integer.parseInt(input.nextLine());
                            
                            String action = subChoice ==1? "send" : subChoice ==
                                    
        2? "disregard" : "store";
                            System.out.println(msg.SentMessage(action));
                            
                            if(subChoice == 1) {
                                System.out.println(msg);
                                sentMessages.add(msg);
                                messagesSent++;
                            }else if (subChoice == 3) {
                                storedMessages.add(msg);
                            }
                            
                            }
                    }else{
                        System.out.println("You have reached the max number of messages");
                    }
                    break;
                    
                case 2:
                    System.out.println("Coming Soon.");
                    org.json.JSONArray jsonArray = new org.json.JSONArray();
                    for (Message m : sentMessages) {
                        jsonArray.put(m.toJSON());
                    }
                    try (java.io.FileWriter file = new java.io.FileWriter("messages.json")) {
                        file.write(jsonArray.toString(4));
                        System.out.println("Messages saved to messages.json");
                    }catch (java.io.IOException e) {
                         e.printStackTrace();
                    }
                    System.out.println("Total messages sent" + sentMessages.size());
                    break;

                case 3:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option , Try again");
                
             }
                        }
                        
                    } 
    //Helper method to prevent crashes on invalid input
            public static int readInt(Scanner input) {
                while (true) {
                    try {
                        return Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.print("Invalid input. Enter a number");
                    }
                }
            }
             }
        
        
  



    
    
            
            
            
            
            
            
        
    

