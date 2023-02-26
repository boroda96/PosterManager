package ru.netology.domain.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {

    PosterManager test = new PosterManager();
    PosterManager test5 = new PosterManager(5);

    @Test
    public void addFilms3() {
        test.add("film1");
        test.add("film2");
        test.add("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = test.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilms1() {

        test.add("film1");

        String[] expected = {"film1"};
        String[] actual = test.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilms0() {

        String[] expected = {};
        String[] actual = test.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilms15() {
        test.add("film1");
        test.add("film2");
        test.add("film3");
        test.add("film4");
        test.add("film5");
        test.add("film6");
        test.add("film7");
        test.add("film8");
        test.add("film9");
        test.add("film10");
        test.add("film11");
        test.add("film12");
        test.add("film13");
        test.add("film14");
        test.add("film15");

        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11", "film12", "film13", "film14", "film15"};
        String[] actual = test.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed3() {
        test.add("film1");
        test.add("film2");
        test.add("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed15() {
        test.add("film1");
        test.add("film2");
        test.add("film3");
        test.add("film4");
        test.add("film5");
        test.add("film6");
        test.add("film7");
        test.add("film8");
        test.add("film9");
        test.add("film10");
        test.add("film11");
        test.add("film12");
        test.add("film13");
        test.add("film14");
        test.add("film15");

        String[] expected = {"film15", "film14", "film13", "film12", "film11", "film10", "film9", "film8", "film7", "film6"};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed11() {
        test.add("film1");
        test.add("film2");
        test.add("film3");
        test.add("film4");
        test.add("film5");
        test.add("film6");
        test.add("film7");
        test.add("film8");
        test.add("film9");
        test.add("film10");
        test.add("film11");


        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed10() {
        test.add("film1");
        test.add("film2");
        test.add("film3");
        test.add("film4");
        test.add("film5");
        test.add("film6");
        test.add("film7");
        test.add("film8");
        test.add("film9");
        test.add("film10");


        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed9() {
        test.add("film1");
        test.add("film2");
        test.add("film3");
        test.add("film4");
        test.add("film5");
        test.add("film6");
        test.add("film7");
        test.add("film8");
        test.add("film9");

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed1() {
        test.add("film1");

        String[] expected = {"film1"};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed0() {

        String[] expected = {};
        String[] actual = test.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilmsReversed5() {
        test5.add("film1");
        test5.add("film2");
        test5.add("film3");
        test5.add("film4");
        test5.add("film5");
        test5.add("film6");

        String[] expected = {"film6", "film5", "film4", "film3", "film2"};
        String[] actual = test5.findLastAll();

        Assertions.assertArrayEquals(expected, actual);

    }


}