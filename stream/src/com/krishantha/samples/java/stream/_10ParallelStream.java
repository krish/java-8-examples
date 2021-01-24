package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 23:55
 * @Project stream
 */
public class _10ParallelStream {
    /*
    parallelStream() is same as stream() but it use multi threading to do the operation. so small collection may take more time to process
    in bellow example you can see printing order is change time to time. but if you use stream it always print in same order
     */

    public static void main(String[] args) {
        List<String> employeeNames=Employee.getEmployeeNames();

        List<String> shortNames=employeeNames.stream().filter(name->name.length()<9).collect(Collectors.toList());

        shortNames.stream().forEach(System.out::println);
        System.out.println("================== below order might change===================");
        shortNames.parallelStream().forEach(System.out::println);

    }
}
