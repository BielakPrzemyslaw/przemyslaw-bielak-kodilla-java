package com.kodilla.testing.collection;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    private static OddNumbersExterminator oddNumbersExterminator;
    @Before
    public void before(){
        System.out.println("Test Case: Begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: End");
    }

    @BeforeClass
    public static void beforeClass(){
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(emptyList, resultList);
    }

    @Test
    public void testOddNumbersExterminatorNormalLIst(){
        //Given
        ArrayList<Integer> normalList = new ArrayList();
        normalList.add(10);
        normalList.add(5);
        normalList.add(17);
        normalList.add(34);
        normalList.add(6);
        normalList.add(42);
        normalList.add(11);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(10);
        expectedResultList.add(34);
        expectedResultList.add(6);
        expectedResultList.add(42);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assert.assertEquals(expectedResultList, resultList);
    }
}
