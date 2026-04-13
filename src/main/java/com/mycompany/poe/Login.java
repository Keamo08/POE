/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
public class Login {
    private String storedFirstName;
    private String storedLastName;
    private String storedUsername;
    private String storedPassword;
    private String storedCellNumber;    
    
     public boolean checkUsername(String username){
            return username.contains("_") && username.length() > 5;
        }
        public boolean checkPasswordComplexity(String password) {
            boolean  hasLength = password.length() < 8;
            boolean hasCapital = false;
            boolean hasNumber = false;
            boolean hasSpecial = false;
            
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    hasCapital = true;
                } else if (Character.isDigit(c)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecial = true;
                }
            }
            
            
            return hasLength && hasCapital && hasNumber && hasSpecial;
            
        }
         public boolean checkCellPhoneNumber(String cellNumber) {
                return cellNumber.matches("^\\+27\\d{9}$");
            }
        
        public String registerUser(String firstName, String lastName, String username, String password, String cellNumber){
        if (!checkUsername(username)){
            return "Username is not correctly formatted,please ensure that your username contains an _ and is no more than 5 characters in length";
        }
            
        if (!checkPasswordComplexity(password)){
            return "Password is not correctly formatted,please ensure that the password contains at least eight characters,a capital letter, a number and a special character";
        }
        
        if (!checkCellPhoneNumber(cellNumber)){
            return "Cell phone number incorrectly formatted or does not contain +27";
            
        }
        this.storedFirstName = firstName;
        this.storedLastName = lastName;
        this.storedUsername = username;
        this.storedPassword = password;
        this.storedCellNumber = cellNumber;
    
        return "User successfully registered ";
        }
        
        public boolean loginUser(String username,String password) {
           if (storedUsername == null || storedPassword == null){
                return false;
        }
           return username.equals(storedUsername) && password.equals(storedPassword);
        }
        
        public String returnLoginStatus(String username, String password) {
            if (loginUser(username, password)) {
               return "Welcome" + storedFirstName + "," + storedLastName + " it is great to see you again";
            } else {
               return "Username or password incorrect, please try again";
            }
        }
    
}
