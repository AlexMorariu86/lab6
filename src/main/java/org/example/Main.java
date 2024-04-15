package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator(5);
        c.add(3);
        c.multiply(2);
        c.divide(4);

        System.out.println(c.getResult());
        Calculator2 c2 = new Calculator2(4);
        c2.sqrt();
        System.out.println(c2.value);
    }
}

