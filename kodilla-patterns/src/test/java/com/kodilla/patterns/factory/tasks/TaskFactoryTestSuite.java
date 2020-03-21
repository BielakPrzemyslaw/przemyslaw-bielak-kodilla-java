package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING,"My shopping list","bread","10.0");
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();
        //Then
        Assert.assertEquals("My shopping list", shopping.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testMakePaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING,"What color use","read","my figurine cloak");
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        //Then
        Assert.assertEquals("What color use", painting.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testMakeDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING,"Where you ride ","yellow","my painting blue track");
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();
        //Then
        Assert.assertEquals("Where you ride ", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(driving.isTaskExecuted());
    }


}
