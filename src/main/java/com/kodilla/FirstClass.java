package com.kodilla;
class SimpleSubstract
{
    public double substractBFromA(double a, double b) {

        return a - b;
    }
}

class Aplication
{
    public static void main (String[] args) {

        SimpleSubstract calculator = new SimpleSubstract();

        double result = calculator.substractBFromA(16, 2);

        System.out.println(result);
    }
}

