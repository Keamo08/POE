/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Student
 */
import org.json.JSONObject;

public class Message {
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String messageContent;
    private String messageHash;
    
    //Main constructor
    public Message(int messageNumber, String recipient, String messageContent) {
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.messageContent = messageContent;
     
    }
    
    //Test constructor - used for JUnit
    public Message(String testID, int messageNumber, String recipient, String messageContent) {
        this.messageID = testID; 
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.messageContent = messageContent;
        
    }
    public boolean checkMessageID() {
        return messageID.length() ==10;
    }
    
    public String checkRecipientCell() {
       boolean valid = recipient.matches("^\\+||d{1,3}\\d{1,10}$") &&
    recipient.length() <= 13;
       if (valid) {
                 return "Cell phone number successfully captured.";
             } else {
                 return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
     
    }
    }
       
    public String checkMessageLength() {
        int length = messageContent.length();
        if (length <= 250) {
            return "Message ready to send.";
        } else {
            int overBy = length - 250;
            return "Message exceeds 250 characters by " + overBy + ", please reduce the size.";
        }
     }

    
    public String SentMessage(String action) {
        switch (action.toLowerCase()) {
            case "send":
                return "Message successfully sent.";
            case "store":
                return "Message successfully stored";
            case "disregard":
                return "Press 0 to delete the message";
            default:
                return "Invalid action";
            
        }
      }
    public JSONObject toJSON() {
       JSONObject obj = new JSONObject();
       obj.put("messageID", messageID);
       obj.put("messageIDString", messageHash);
       obj.put("recipient", recipient);
       obj.put("messageContent", messageContent);
       return obj;
    }
    @Override 
    public String toString() {
        return "MessageID:" + messageID +
                "\nRecipient:" + recipient +
                "\nMessage:" + messageContent;
    }
    public String getMessageIDString() {
        return "Message ID generated"  + messageID;
    }
}

  

       
    
    
    