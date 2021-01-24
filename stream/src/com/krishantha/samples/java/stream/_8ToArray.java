package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 23:38
 * @Project stream
 */
public class _8ToArray {

    public static void main(String[] args) {
        List<String> employeeNames=Employee.getEmployeeNames();

        String[] names=employeeNames.stream().filter(name-> name.length()<9).toArray(String[]::new);

       for(String name:names){
           System.out.println(name);
       }

    }
}
