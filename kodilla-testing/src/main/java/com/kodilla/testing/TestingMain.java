package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Testing calculator
        Calculator calculator = new Calculator();
        int addResult = calculator.add(6,8);
        int subResult = calculator.subtract(40,10);

                if((addResult == 14)&&(subResult == 30)) {
                    System.out.println("Calculator works !!!");
                }else{
                    System.out.println("Error !!!");
            }

        }
    }
