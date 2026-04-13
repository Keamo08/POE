/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class POETest {
    
    public POETest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class POE.
     */
    @Test
    public void testCheckUsername_CorrectlyFormatted() {
        String username = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testCheckUsername_IncorrectlyFormatted() {
        String username = "kyle!!!!!!";
        Login instance = new Login ();
        boolean expResult = false;
        boolean result = instance.checkUsername(username);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPasswordComplexity method, of class POE.
     */
    @Test
    public void testCheckPasswordComplexity_MeetsRequirements() {
        String password = "Ch%%sec@ke99!";
        Login instance = new Login ();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
           }
     @Test
    public void testCheckPasswordComplexity_DoesNotMeetRequirements() {
        String password = "password";
        Login instance = new Login ();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkCellPhoneNumber method, of class POE.
     */
    @Test
    public void testCheckCellPhoneNumber_CorrectlyFormatted() {
        String cellNumber = "+27838968976";
        Login instance = new Login ();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(cellNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
@Test
    public void testCheckCellPhoneNumberIncorrectlyFormatted() {
        String cellNumber = "08366553";
        Login instance = new Login ();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(cellNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testRegisterUser_PasswordIncorrectlyFormatted() {
        Login instance = new Login();
        String result = instance.registerUser("Test", "User", "kyl_1", "password", "+27838968976");
        assertEquals("Password is not correctly formatted,please ensure that the password contains at least eight characters,a capital letter, a number and a special character", result);
    }
    
    /**
     * Test of registerUser method, of class POE.
     */
    @Test
    public void testRegisterUser_UsernameIncorrectlyFormatted() {
        String firstName = "Test";
        String lastName = "User";
        String username = "kyle!!!!!!!";
        String password = "Ch&&sec@ke99!";
        String cellNumber = "+27838968976";
        Login instance = new Login ();
        String expResult = "Username is not correctly formatted,please ensure that your username contains an underscore and is no more than five characters in length";
        String result = instance.registerUser(firstName, lastName, username, password, cellNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of main method, of class POE.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        POE.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

   
