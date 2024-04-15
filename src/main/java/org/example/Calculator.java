package org.example;

public class Calculator {
    public Calculator(){}
    protected float value;
    public Calculator(float value){
        this.value=value;
    }
    public void add(float other){
        this.value += other;
    }
    public void multiply(float other){
        this.value *= other;
    }
    public void divide(float other){
        this.value /= other;
    }
    public float getResult(){
        return this.value;
    }

}
