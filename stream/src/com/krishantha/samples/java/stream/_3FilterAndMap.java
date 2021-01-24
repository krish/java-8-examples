package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 17:48
 * @Project stream
 */
public class _3FilterAndMap {
    public static void main(String[] args) {
        List<String> employeeNames=Employee.getEmployeeNames();

        List<String> shortNames=employeeNames.stream().filter(name->name.length()<=8).map(name->"Dr ".concat(name)).collect(Collectors.toList());
        System.out.println(shortNames);

    }
}
