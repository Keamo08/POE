/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class MessageTest {
    
    public MessageTest() {
    }

    @Test
    public void testRecipientSuccess() {
        Message msg = new Message(0, "+27718693002", "Hi Mike, can you join us for dinner tonight?");
        assertEquals("Cell phone number successfully captured", msg.checkRecipientCell());
 
    }

    @Test
    public void testMessageLengthSuccess() {
        Message msg = new Message(0, "+27718693002", "Hi Mike, can you join us for dinner tonight?");
        assertEquals("Message ready to send" ,msg.checkMessageLength());
    }

    @Test
    public void testMessageLengthFailure() {
        String longMsg = "a".repeat(260);
        Message msg = new Message(0, "27718693002", longMsg);
        assertEquals("Message exceeds 250 characters by 10, please reduce the size", msg.checkMessageLength());
    }

    @Test
    public void testMessageSentSend() {
        Message msg = new Message(0, "+27718693002", "Hi Mike");
        assertEquals("Message successfully sent", msg.SentMessage("send"));
    }

    @Test
    public void testMessageSentDisregard() {
        Message msg = new Message(0, "+27718693002", "Hi Mike");
        assertEquals("Press 0 to delete the message", msg.SentMessage("disregard"));
        
    }

    @Test
    public void testMessageSentStore() {
        Message msg = new Message(0, "+27718693002", "Hi Mike");
        assertEquals("Message successfully stored", msg.SentMessage("store"));
    }
    
    
    
    
    }

    

