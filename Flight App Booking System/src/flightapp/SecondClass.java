/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightapp;

/**
 *
 * @author x16410236
 */
public class SecondClass extends Flight{
    //variables
    private double discount;
    private double discountSum;
    private String code;
    private String codeOption;
    
    //default constructor
    public SecondClass(){
        discount = 0;
        discountSum = 0.15;
        //code = "FLY15";
        //codeOption = " ";
    }   
    
    //overloaded constructor
    public SecondClass(double discount, double discountSum, /*String code, String codeOption,*/ String refNum, String dest, int total, double vat, double incVat, int noTicket, int flightNum, int destPrice, String flightTime, String flightMonth, String flightDay, String terminal, String flightLength, int codeOption, String codeAnswer, String code) {
        super(refNum, dest, total, vat, incVat, noTicket, flightNum, destPrice, flightTime, flightMonth, flightDay, terminal, flightLength, codeOption, codeAnswer, code);
        this.discount = discount;
        this.discountSum = discountSum;
        //this.code = code;
        //this.codeOption = codeOption;
    }
    
    //setters
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setDiscountSum(double discountSum) {
        this.discountSum = discountSum;
    }

    /*public void setCode(String code) {
        this.code = code;
    }

    public void setCodeOption(String codeOption) {
        this.codeOption = codeOption;
    }*/
    
    //compute
    public void calculateDisc(){
        discount = discountSum * incVat;
    }
    
    //getters
    public double getDiscount() {
        return discount;
    }

    public double getDiscountSum() {
        return discountSum;
    }

    /*public String getCode() {
        return code;
    }

    public String getCodeOption() {
        return codeOption;
    }*/
    
}
