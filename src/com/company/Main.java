package com.company;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {
        List<String> j1 = new ArrayList<>(List.of("horror","action","triller"));
        List<String> j2 = new ArrayList<>(List.of("action","triller"));
        List<String> j3 = new ArrayList<>(List.of("horror","drama"));

        List<Person> a1 = new ArrayList<>(
                List.of(new Person("Vasya","gendalf"),
                        new Person("Danil","Aragorn"),
                        new Person("Petya","Golum")));
        List<Person> a2 = new ArrayList<>(
                List.of(new Person("Anton","Iron man"),
                new Person("Danil","Spider-man"),
                new Person("Igor","dr. Strange")));
        List<Person> a3 = new ArrayList<>(
                List.of(new Person("Vasya","Dog"),
                new Person("Danil","Cat"),
                new Person("Sasha","Snake")));

        List<String> t1 = new ArrayList<>(List.of("01:20"));
        List<String> t2 = new ArrayList<>(List.of("00:40","00:53","00:12"));
        List<String> t3 = new ArrayList<>(List.of("02:30"));

        Person mm1 = new Person("Ivan","movieMaker");
        Person mm2 = new Person("Alexey","movieMaker");

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Lord of Rings",2001,"movie",mm1,j1,a1,t1,1000));
        movies.add(new Movie("Avengers",2001,"movie",mm2,j2,a2,t3,500));
        movies.add(new Movie("About animals",2018,"serial",mm1,j3,a3,t2,2000));

//        final var year = 2019;
//        final var filtered = new ArrayList<Movie>();
//        for(var movie : movies){
//            if(movie.getYear() == year){
//                filtered.add(movie);
//            }
//        }
//        for(var movie : filtered){
//            System.out.println(movie);
//        }

//        var movies2019 = movies
//                .stream()
//                .filter(m -> m.getYear() == 2019)
//                .collect(Collectors.toList());
//        movies2019.forEach(System.out::println);

//        movies.stream().filter(
//                movie -> {
//                    System.out.println(movie);
//                    return movie.getYear() == 2019;
//                }
//        ).;

//        var movieNames = movies.stream()
//                        .map(movie -> movie.getName())
//                                .collect(Collectors.toList());
//        movieNames.forEach(System.out::println);
//
//        var names = new ArrayList<String>();
//        for(var m : movies){
//            names.add(m.getName());
//        }

//        var squared = new ArrayList<Integer>(List.of(1,2,3,4,5)).stream()
//                .map(num -> num * num)
//                .collect(Collectors.toList());
//        squared.forEach(System.out::println);
//        var totalBudget = movies.stream()
//                .mapToDouble(movie -> movie.getBudget())
//                .sum();
//        System.out.println(totalBudget);
//        var filtered = movies.stream()
//                .filter(m -> m.getYear() == 2001)
//                .collect(Collectors.toList());
//        filtered.forEach(System.out::println);
//        var numbers = List.of(2,2,4,5,6,6,7,8);
//        var filtered = numbers.stream()
//                .filter(i -> i % 2 == 0)
//                .distinct()
//                .collect(Collectors.toList());
//        filtered.forEach(System.out::println);
//        var listOfListActors = movies.stream()
//                .map(m -> m.getActors())
//                .collect(Collectors.toList());
//
//        var listOfActors = movies.stream()
//                .flatMap(m -> m.getActors().stream())
//                .collect(Collectors.toList());
//        System.out.println();
//        var sortedByBudget = movies.stream()
////                .sorted(Comparator.comparing(Movie::getBudget))
////                .collect(Collectors.toList());
//        var filtered = movies.stream()
//                .skip(1)
//                .limit(1)
//                .collect(Collectors.toList());
//        filtered.forEach(System.out::println);
//        var filtered = movies.stream()
//                .sorted(Comparator.comparingInt(Movie::getYear))
//                .dropWhile(m -> m.getYear() < 2010)
//                .takeWhile(m -> m.getYear() <= 2018)
//                .collect(Collectors.toList());
//                filtered.forEach(System.out::println);

//        var lowBudgetMovie = movies.stream()
//                .min(Comparator.comparingDouble(Movie::getBudget)).get();
//        var highBudgetMovie = movies.stream()
//                .max(Comparator.comparingDouble(Movie::getBudget)).get();
//        System.out.println(lowBudgetMovie);
//        System.out.println(highBudgetMovie);

//        var total = movies.stream()
//                .mapToDouble(m -> m.getBudget())
//                .sum();
//        System.out.println(total);
//        var actorNames = movies.stream()
//                .flatMap(m -> m.getActors().stream())
//                .map(Person::getName)
//                .collect(Collectors.joining(" /\\ ", "[[ ", " ]]"));
//        System.out.println(actorNames);
//        var sorted = movies.stream()
//                .sorted(Comparator.comparingInt(Movie::getYear))
//                .collect(Collectors.toList());
//        var unique = movies.stream()
//                .flatMap(m -> m.getActors().stream())
//                .map(Person::getName)
//                .collect(Collectors.toCollection(TreeSet::new));
//        unique.forEach(System.out::println);
//        var split = movies.stream()
//                .collect(partitioningBy(m -> m.getYear() >= 2015));
//        split.get(Boolean.TRUE).forEach(System.out::println);
//        System.out.println();
//        split.get(Boolean.FALSE).forEach(System.out::println);
//        var grouped = movies.stream()
//                .collect(groupingBy(Movie::getMovieMaker));
//        var spentByYear = movies.stream()
//                        .collect(groupingBy(Movie::getYear,summingDouble(Movie::getBudget)));
//        spentByYear.forEach((k,v) -> System.out.printf("%s - %,.2f%n",k,v));
//        System.out.println();
        Map<Person,List<String>> byDirector = movies.stream()
                .collect(groupingBy(Movie::getMovieMaker,mapping(Movie::getName,toList())));

        Map<Person,Long> Director = movies.stream()
                .collect(groupingBy(Movie::getMovieMaker,counting()));
        System.out.println();
    }
}
