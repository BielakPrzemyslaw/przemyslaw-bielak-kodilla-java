package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task executor(final String taskClass) {
        switch(taskClass) {
            case SHOPPING:
                return new ShoppingTask("Do shopping", "Bread", 10.0);
            case PAINTING:
                return new PaintingTask("What color you like", "Pink", "Car");
            case DRIVING:
                return new DrivingTask("You have licens", "home", "your car");
            default:
                return null;
        }
    }
}
