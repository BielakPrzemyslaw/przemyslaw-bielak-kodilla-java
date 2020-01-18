package com.kodilla.testing.forum.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @Before
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++) {
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(40);
        when(statisticsMock.commentsCount()).thenReturn(60);
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testZeroPost() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getNumberOfPosts());
        assertEquals(0, forumStatistics.getAverageNumberOfUserPosts(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentaryPerPost(), 0.01);
    }

    @Test
    public void testThousandPost() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getNumberOfPosts());
        assertEquals(100, forumStatistics.getAverageNumberOfUserPosts(), 0.01);
        assertEquals(0.06, forumStatistics.getAverageCommentaryPerPost(), 0.01);
    }

    @Test
    public void testZeroComments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getNumberOfComments());
        assertEquals(0, forumStatistics.getAverageNumberOfUserComments(), 0.001);
        assertEquals(0, forumStatistics.getAverageCommentaryPerPost(), 0.01);
    }

    @Test
    public void testLessCommentsThatPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10,forumStatistics.getNumberOfPosts());
        assertEquals(2, forumStatistics.getNumberOfComments());
        assertEquals(1, forumStatistics.getAverageNumberOfUserPosts(), 0.01);
        assertEquals(0.2, forumStatistics.getAverageNumberOfUserComments(), 0.01);
        assertEquals(0.2, forumStatistics.getAverageCommentaryPerPost(), 0.01);
    }

    @Test
    public void testMoreCommentsThatPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20,forumStatistics.getNumberOfPosts());
        assertEquals(40, forumStatistics.getNumberOfComments());
        assertEquals(2, forumStatistics.getAverageNumberOfUserPosts(), 0.01);
        assertEquals(4, forumStatistics.getAverageNumberOfUserComments(), 0.01);
        assertEquals(2, forumStatistics.getAverageCommentaryPerPost(), 0.01);
    }

    @Test
    public void testZeroUser() {
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getNumberOfUsers());

    }

    @Test
    public void testHundredUser() {
        //Given
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User:");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getNumberOfUsers());


    }

}
