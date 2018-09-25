/*
 * Payment.java
 * 
 * Version Information Final
 *
 * Date 04/12/2017

 * @author Yuzhang Chen, x16336066
 *
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightapp;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Richard
 */
public class Payment extends Flight implements Serializable {
    int cardNo;
    int cvc;
    int expiry;
    String cHName;
    String email;
    String userRef;


public Payment(){
    cardNo=0;
    cvc=0;
    expiry=0;
    cHName="";
    email="";
    userRef="";
}

    public Payment(int cardNo, int cvc, int expiry, String cHName, String email, String userRef) {
        this.cardNo = cardNo;
        this.cvc = cvc;
        this.expiry = expiry;
        this.cHName = cHName;
        this.email = email;
        this.userRef = userRef;
    }

    public Payment(int cardNo, int cvc, int expiry, String cHName, String email, String refNum, String dest, int total, double vat, double incVat, int noTicket, int flightNum, int destPrice, String flightTime, String flightMonth, String flightDay, String terminal, String flightLength, int codeOption, String codeAnswer, String code) {
        super(refNum, dest, total, vat, incVat, noTicket, flightNum, destPrice, flightTime, flightMonth, flightDay, terminal, flightLength, codeOption, codeAnswer, code);
        this.cardNo = cardNo;
        this.cvc = cvc;
        this.expiry = expiry;
        this.cHName = cHName;
        this.email = email;
        this.userRef = userRef;
    }


    

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    public String getcHName() {
        return cHName;
    }

    public void setcHName(String cHName) {
        this.cHName = cHName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRef() {
        return userRef;
    }

    public void setUserRef(String userRef) {
        this.userRef = userRef;
    }


 
    
    
}
