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
public class Flight {
    //variables 
    protected String refNum;
    protected String dest;
    protected int total;
    protected double vat;
    protected double incVat;
    protected int noTicket;
    protected int flightNum;
    protected int destPrice;
    protected String flightTime;
    protected String flightMonth;
    protected String flightDay;
    protected String terminal;
    protected String flightLength;
    protected int codeOption;
    protected String codeAnswer;
    protected String code;
    protected int passNum;
    protected String passName;
    protected String luggage;
    protected int seatNum;
    
    //default constructor 
    public Flight(){
        refNum = " ";
        dest = " ";
        total = 0;
        vat = 0;
        incVat = 0;
        noTicket = 0;
        flightNum = 0;
        destPrice = 0;
        flightTime = " ";
        flightMonth = " ";
        flightDay = " ";
        terminal = " ";
        flightLength = " ";
        codeOption = 0;
        codeAnswer = " ";
        code = "FLY15";
        passNum = 0;
        passName = " ";
        luggage = " ";
        seatNum = 0;
    }

    //overloaded constructor
    public Flight(String refNum, String dest, int total, double vat, double incVat, int noTicket, int flightNum, int destPrice, String flightTime, String flightMonth, String flightDay, String terminal, String flightLength, int codeOption, String codeAnswer, String code) {
        this.refNum = refNum;
        this.dest = dest;
        this.total = total;
        this.vat = vat;
        this.incVat = incVat;
        this.noTicket = noTicket;
        this.flightNum = flightNum;
        this.destPrice = destPrice;
        this.flightTime = flightTime;
        this.flightMonth = flightMonth;
        this.flightDay = flightDay;
        this.terminal = terminal;
        this.flightLength = flightLength;
        this.codeOption = codeOption;
        this.codeAnswer = codeAnswer;
        this.code = code;
        this.passNum = passNum;
        this.passName = passName;
        this.luggage = luggage;
        this.seatNum = seatNum;
    }
    
    //setters 
    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public void setIncVat(double incVat) {
        this.incVat = incVat;
    }

    public void setNoTicket(int noTicket) {
        this.noTicket = noTicket;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public void setDestPrice(int destPrice) {
        this.destPrice = destPrice;
    }
    
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public void setFlightMonth(String flightMonth) {
        this.flightMonth = flightMonth;
    }

    public void setFlightDay(String flightDay) {
        this.flightDay = flightDay;
    }
    
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public void setFlightLength(String flightLength) {
        this.flightLength = flightLength;
    }

    public void setCodeOption(int codeOption) {
        this.codeOption = codeOption;
    }

    public void setCodeAnswer(String codeAnswer) {
        this.codeAnswer = codeAnswer;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getLuggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
    
    //compute
    public void calculateTotal(){
        total = noTicket * destPrice;
        vat = total * 0.23;
        incVat = total + vat;
    }

    //getters
    public String getRefNum() {
        return refNum;
    }

    public String getDest() {
        return dest;
    }

    public int getTotal() {
        return total;
    }

    public double getVat() {
        return vat;
    }

    public double getIncVat() {
        return incVat;
    }

    public int getNoTicket() {
        return noTicket;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public int getDestPrice() {
        return destPrice;
    }
    
    public String getFlightTime() {
        return flightTime;
    }

    public String getFlightMonth() {
        return flightMonth;
    }

    public String getFlightDay() {
        return flightDay;
    }

    public String getTerminal() {
        return terminal;
    }

    public String getFlightLength() {
        return flightLength;
    }

    public int getCodeOption() {
        return codeOption;
    }

    public String getCodeAnswer() {
        return codeAnswer;
    }

    public String getCode() {
        return code;
    }
    
   

}
