package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 18:53
 * @Project stream
 */
public class _4Count {

    public static void main(String[] args) {
        List<String> employeeNames=Employee.getEmployeeNames();

      long employeeCount=employeeNames.stream().filter(name->name.length()>8).count();
        System.out.println("Total number of employees >8 length "+employeeCount);

    }
}
