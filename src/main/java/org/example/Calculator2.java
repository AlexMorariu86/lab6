package org.example;

public class Calculator2 extends Calculator {
    public Calculator2(float value){
        super (value);
    }
    public void sqrt(){
        this.value=(float)Math.sqrt(value);
    }
}

