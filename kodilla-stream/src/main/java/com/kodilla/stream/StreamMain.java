package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        //System.out.println("Welcome to module 7 - Stream");
       // Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("This is an example text.");
       // processor.execute(() -> System.out.println("This is an example Text."));
       // ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
       // processor.execute(executeSaySomething);

       // SaySomething saySomething = new SaySomething();
       // saySomething.say();
        /*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplayAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */

        //Beautifer
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifulText = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
        System.out.println(beautifulText);

        String beutifulText1 = poemBeautifier.beautify("Text to beautify", (text -> "ABC " + text + " ABC"));
        System.out.println(beutifulText1);

        String beautifulText2 = poemBeautifier.beautify("Text to beautify", (text -> text.replace("e", "E")));
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Text to beautify", (text -> text.length() + " letters :-) lenght " + text));
        System.out.println(beautifulText3);

    }
}
