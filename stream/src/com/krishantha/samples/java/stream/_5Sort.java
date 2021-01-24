package com.krishantha.samples.java.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 18:59
 * @Project stream
 */
public class _5Sort {
    public static void main(String[] args) {
        //sorted
        List<String> employeeNames=Employee.getEmployeeNames();
        List<String> sortedNames=employeeNames.stream().sorted().collect(Collectors.toList());
        List<String> sortedNamesRev=employeeNames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedNames.forEach(System.out::println);

//custom sort
        List<String> sortedByLength=employeeNames.stream().sorted((name1,name2)->new Integer(name1.length()).compareTo(name2.length())).collect(Collectors.toList());
        sortedByLength.forEach(System.out::println);
    }
}
