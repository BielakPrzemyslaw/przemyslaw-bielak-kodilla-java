package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapForumUser = forum.getUserLIst().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdUser, ForumUser -> ForumUser));

        mapForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}
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

         */
        /*
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
        /*
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifulText = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
        System.out.println(beautifulText);

        String beutifulText1 = poemBeautifier.beautify("Text to beautify", (text -> "ABC " + text + " ABC"));
        System.out.println(beutifulText1);

        String beautifulText2 = poemBeautifier.beautify("Text to beautify", (text -> text.replace("e", "E")));
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Text to beautify", (text -> text.length() + " letters :-) lenght " + text));
        System.out.println(beautifulText3);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        //Class People
        //People.getList().stream().forEach(System.out::println);

        //People.getList().stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        //People.getList().stream().map(String::toUpperCase).forEach(s -> System.out.println(s));

        /*People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);*/

        /*
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

         */

        //BookDirectory
        /*
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

         */
        //Kolektor Collectors.toList()
        /*
        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elemants: " + theResultListOfBooks);
        theResultListOfBooks.stream()
                .forEach(System.out::println);

         */

        //Kolektor Collectors.toMap()
        /*
        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elemaents: " + theResultMapOfBooks.size());
            theResultMapOfBooks.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);

         */
        //Kolektor Collectors.joining()
        /*

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = BookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

         */








