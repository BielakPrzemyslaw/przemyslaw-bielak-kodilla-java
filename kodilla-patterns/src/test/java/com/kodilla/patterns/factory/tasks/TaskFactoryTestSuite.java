package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.executor(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Do shopping", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.executor(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("What color you like", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.executor(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("You have licens", driving.getTaskName());
    }
}
