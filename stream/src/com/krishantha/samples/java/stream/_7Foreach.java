package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 19:21
 * @Project stream
 */
public class _7Foreach {

    public static void main(String[] args) {
        List<String> employeeNames = Employee.getEmployeeNames();
        List<String> filteredList = employeeNames.stream().filter(name -> name.length() < 9).collect(Collectors.toList());
        filteredList.stream().forEach(name -> System.out.println(name.toUpperCase(Locale.ROOT)));
        //filteredList.parallelStream().forEach(name-> System.out.println(name.toUpperCase(Locale.ROOT)));
        System.out.println("-----------------------------");
        filteredList.forEach(name -> System.out.println(name.toUpperCase(Locale.ROOT)));

        /*
        list.stream().foreach() and list.foreach() does not have differance. but parallelStream() vs list.foreach() has differance.
        also if list has custom iterator then its different.
         */
        System.out.println("-----------------------------");

        ReverseList<String> newList = new ReverseList(filteredList);


        newList.forEach(System.out::println);


    }
}
