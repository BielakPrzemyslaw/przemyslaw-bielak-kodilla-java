package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String typeOfTask, String taskName, String colorOrWhatToBuy, String whatToPaintOrUsingOrQuantity) {
        switch(typeOfTask) {
            case SHOPPING:
                return new ShoppingTask(taskName, colorOrWhatToBuy, Double.parseDouble(whatToPaintOrUsingOrQuantity));
            case PAINTING:
                return new PaintingTask(taskName, colorOrWhatToBuy, whatToPaintOrUsingOrQuantity);
            case DRIVING:
                return new DrivingTask(taskName, colorOrWhatToBuy, whatToPaintOrUsingOrQuantity);
            default:
                return null;
        }
    }
}
