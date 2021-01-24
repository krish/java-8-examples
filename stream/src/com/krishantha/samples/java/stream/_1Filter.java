package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 17:24
 * @Project stream
 */
public class _1Filter {
    /*
    filter() use to filter sub set from  stream
    n(result) <= n(original)
     */

    public static void main(String[] args) {
        List<String> employeeNames = Employee.getEmployeeNames();

        List<String> shortNames = employeeNames.stream().filter(name -> name.length() <= 8).collect(Collectors.toList());
        System.out.println(shortNames);

    }
}
