package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jackob = new YGeneration("Jackob Whiles");
        User thomas = new Millenials("Thomas Miless");
        User elisabeth = new ZGeneration("Elisabeth Kowalski");

        //When
        String jackobUseMedia = jackob.sharePost();
        System.out.println("Jackob daile: " + jackobUseMedia);
        String thomasUseMedia = thomas.sharePost();
        System.out.println("Thomas daily: " + thomasUseMedia);
        String elisabethUseMedia = elisabeth.sharePost();
        System.out.println("Elisabeth daile: " + elisabethUseMedia);

        //Then
        Assert.assertEquals("Use Facebook social media", jackobUseMedia);
        Assert.assertEquals("Use Twitter social media", thomasUseMedia);
        Assert.assertEquals("Use Snapchat social media", elisabethUseMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //When
        User jackob = new YGeneration("Jackob Whiles");

        //When
        String jackobUseMedia = jackob.sharePost();
        System.out.println("Jackob daile: " + jackobUseMedia);
        jackob.setSocialPublisher(new SnapchatPublisher());
        jackobUseMedia = jackob.sharePost();
        System.out.println("Jackob daile: " + jackobUseMedia);

        //Then
        Assert.assertEquals("Use Snapchat social media", jackobUseMedia);
    }
}
