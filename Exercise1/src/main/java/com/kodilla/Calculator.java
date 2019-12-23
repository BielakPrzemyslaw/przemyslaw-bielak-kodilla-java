package com.kodilla;
class SimpleSubstract
{
    public double substractBFromA(double a, double b) {

        return b - a;
    }

    public double summBtoA(double a, double b) {

        return b + a;
    }
}

class Aplication
{
    public static void main (String[] args) {

        SimpleSubstract calculator = new SimpleSubstract();

        double resultSubstract = calculator.substractBFromA(16, 2);
        double resultSumm = calculator.summBtoA(15,5);

        System.out.println("Subtraction result B to A = " + resultSubstract);
        System.out.println("Result of adding B to A = " + resultSumm);
    }
}
