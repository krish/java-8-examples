package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 19:16
 * @Project stream
 */
public class _6MinMAx {
    public static void main(String[] args) {
        List<String> employeeNames=Employee.getEmployeeNames();

        String shortestName=employeeNames.stream().min((name1,name2)->new Integer(name1.length()).compareTo(name2.length())).get();
        System.out.println(shortestName);

        String lengthestName=employeeNames.stream().max((name1,name2)->new Integer(name1.length()).compareTo(name2.length())).get();
        System.out.println(lengthestName);

    }
}
