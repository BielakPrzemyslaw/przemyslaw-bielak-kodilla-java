package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private static final List<ForumUser> UserLIst = new ArrayList<>();

    public Forum() {
        UserLIst.add(new ForumUser(1, "JanKowalski", 'M', LocalDate.of(2000, 10, 23), 4));
        UserLIst.add(new ForumUser(2, "Wiedzmin18", 'M', LocalDate.of(1979, 12, 6), 12));
        UserLIst.add(new ForumUser(3, "CzokoHunter", 'M', LocalDate.of(1998, 4, 18), 1));
        UserLIst.add(new ForumUser(4, "Semi89", 'F', LocalDate.of(2001, 1, 22), 20));
        UserLIst.add(new ForumUser(5, "Jaskolka19", 'F', LocalDate.of(2011, 5, 30), 8));
        UserLIst.add(new ForumUser(6, "MarcoPOlo45", 'M', LocalDate.of(2002, 3, 15), 0));
    }

    public static List<ForumUser> getUserLIst() {
        return new ArrayList<>(UserLIst);
    }
}
