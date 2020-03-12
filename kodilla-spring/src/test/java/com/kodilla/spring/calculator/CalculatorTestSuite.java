package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(3, 6);
        double subResult = calculator.sub(20, 5);
        double mulResult = calculator.mul(6, 6);
        double divResult = calculator.div(20, 5);

        //Then
        Assert.assertEquals(9, addResult,0.01);
        Assert.assertEquals(15, subResult,0.01);
        Assert.assertEquals(36, mulResult,0.01);
        Assert.assertEquals(4, divResult,0.01) ;
        }
}
