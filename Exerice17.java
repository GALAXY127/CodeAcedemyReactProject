package com.company;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Exerice17 {
    public static void main(String[] args) {
        //task 1
        List<String> words = Arrays.asList("Hello", "world","!");
        words.stream().forEach(System.out::println);

        //task 2
        IntStream.range(0 , 10).forEach(System.out::print);

        //task3
        IntStream.iterate(10, n->n+2).map( n -> n*n).limit(10).forEach(System.out::println);

        // task4
       System.out.println("Task4 "+IntStream.range(0,99).filter(x -> x%2 ==0).sum());

       //task 5
        DoubleStream s = new Random().doubles(1D, 100D); // inte klar

        //task 6
        int[] ints = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.stream(ints).reduce(0, (a,b) -> a+b));

        //task 7
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
       System.out.println( list.stream().reduce(10, Integer::sum));

       //Task 8
        List<String> strings = Arrays.asList("Hello", "Java", "!");
        List<Integer> strings1 = strings.stream().map(x -> x.length()).collect(Collectors.toList());

        //Task 9
        List<Integer> lista = Arrays.asList(10, 5, 12, -1, 17); 
        String so =  lista.stream().sorted().collect(Collectors.toList()).stream().map(x ->String.valueOf(x)).collect(Collectors.joining(" , "));
        System.out.println(so);


        //task 10
        List<Integer> lis = Arrays.asList(10, 5, 12, -1, 17);
       System.out.println( lis.stream().collect(Collectors.averagingDouble(x->x)));


    }

}
