package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> toDo = board.getToDoList().getTasks();
        toDo.add("Task to do");

        List<String> inProgress = board.getInProgressList().getTasks();
        inProgress.add("Task in progress");

        List<String> done = board.getDoneList().getTasks();
        done.add("Task done");
        //Then
        Assert.assertEquals("Task to do", toDo.get(0));
        Assert.assertEquals("Task in progress", inProgress.get(0));
        Assert.assertEquals("Task done", done.get(0));
    }

}
