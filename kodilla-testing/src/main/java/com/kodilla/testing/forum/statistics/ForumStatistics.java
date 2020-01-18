package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfUserPosts;
    private double averageNumberOfUserComments;
    private double averageCommentaryPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfUserPosts() {
        return averageNumberOfUserPosts;
    }

    public double getAverageNumberOfUserComments() {
        return averageNumberOfUserComments;
    }

    public double getAverageCommentaryPerPost() {
        return averageCommentaryPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberOfUserPosts = calculatePostsAveragePerUser();
        averageNumberOfUserComments =  calculateCommentsAvgPerUser();
        averageCommentaryPerPost = calculateCommentsAvgPerPost();

    }

    private double calculatePostsAveragePerUser() {

        if (numberOfUsers > 0) {
            return (double) numberOfPosts / numberOfUsers;
        } else {
            return 0;
        }

    }

    private double calculateCommentsAvgPerUser() {

        if(numberOfPosts > 0) {
            return (double)numberOfComments / numberOfUsers;
        }else{
            return 0;
        }

    }

    private double calculateCommentsAvgPerPost() {
        if(numberOfPosts > 0) {
            return (double) numberOfComments / numberOfPosts;
        }else{
            return 0;
        }

    }

    public void showStatistics() {
        System.out.println("Forum statistics:");
        System.out.println("Users quantity: " + numberOfUsers);
        System.out.println("Post quantity: " + numberOfPosts);
        System.out.println("Comments quantity" + numberOfComments );
        System.out.println("Post average per user: " + averageNumberOfUserPosts);
        System.out.println("Comments average per user:" + averageNumberOfUserComments);
        System.out.println("Comments average per post: " + averageCommentaryPerPost);
    }


}
