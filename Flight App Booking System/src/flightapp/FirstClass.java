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
public class FirstClass extends Flight {
    //variables
    private int fPrice;
    private String mealPlan;
    
    //default constructor
    public FirstClass(){
        fPrice = 20;
        mealPlan = " ";
    }
    
    //overloaded constructor
    public FirstClass(int fPrice, String mealPlan, String refNum, String dest, int total, double vat, double incVat, int noTicket, int flightNum, int destPrice, String flightTime, String flightMonth, String flightDay, String terminal, String flightLength, int codeOption, String codeAnswer, String code) {
        super(refNum, dest, total, vat, incVat, noTicket, flightNum, destPrice, flightTime, flightMonth, flightDay, terminal, flightLength, codeOption, codeAnswer, code);
        this.fPrice = fPrice;
        this.mealPlan = mealPlan;
    }
    
    //setters
    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    //getters
    public int getfPrice() {
        return fPrice;
    }
    
    public String getMealPlan() {
        return mealPlan;
    }
    
}
