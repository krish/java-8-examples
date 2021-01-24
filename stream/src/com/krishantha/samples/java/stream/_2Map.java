package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 17:46
 * @Project stream
 */
public class _2Map {
    /*
 map() use to do same operation on each element of  stream
 n(result) = n(original)
  */
    public static void main(String[] args) {
        List<String> employeeNames=Employee.getEmployeeNames();

        List<String> shortNames=employeeNames.stream().map(name->"Dr ".concat(name)).collect(Collectors.toList());
        System.out.println(shortNames);

    }
}
