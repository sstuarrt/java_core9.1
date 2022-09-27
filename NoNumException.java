package com.company.java_core.homework8.task1;

public class NoNumException extends Exception{
    private int numOfDays;
    public NoNumException(int numOfDays){
        super(String.valueOf(numOfDays));
        this.numOfDays=numOfDays;
    }
    public int getNumOfDays(){
        return numOfDays;
    }
}
