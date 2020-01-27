package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int IdUser;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postQty;

    public ForumUser(int idUser, String userName, char sex, LocalDate dateOfBirth, int postQty) {
        IdUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postQty = postQty;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQty() {
        return postQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IdUser=" + IdUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQty=" + postQty +
                '}';
    }
}
