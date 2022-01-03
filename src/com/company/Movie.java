package com.company;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String type;
    private Person movieMaker;
    private List<String> janr;
    private List<Person> actors;
    private List<String> time;
    private double budget;

    public Movie(String name, int year, String type, Person movieMaker, List<String> janr, List<Person> actors, List<String> time, double budget) {
        this.name = name;
        this.year = year;
        this.type = type;
        this.movieMaker = movieMaker;
        this.janr = janr;
        this.actors = actors;
        this.time = time;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public Person getMovieMaker() {
        return movieMaker;
    }

    public List<String> getJanr() {
        return janr;
    }

    public List<Person> getActors() {
        return actors;
    }

    public List<String> getTime() {
        return time;
    }

    @Override
    public String toString() {
        return name;
    }
}
