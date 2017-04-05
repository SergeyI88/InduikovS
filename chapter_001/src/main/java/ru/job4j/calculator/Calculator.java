package ru.job4j.calculator;

public class Calculator {
    private double result;
    
    public void add(double first, double second) {
        this.result = first + second;
    }
    
    public double getResult() {
        return this.result;
    }
	 public void substruct(double first, double second) {
        this.result = first - second;
    }
    
    public double getResult() {
        return this.result;
    }
	 public void div(double first, double second) {
        this.result = first / second;
    }
    
    public double getResult() {
        return this.result;
    }
	 public void multiple(double first, double second) {
        this.result = first * second;
    }
    
    public double getResult() {
        return this.result;
    }

}