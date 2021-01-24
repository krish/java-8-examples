package com.krishantha.samples.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 17:12
 * @Project stream
 */
public class Employee {

    public static List<String> getEmployeeNames(){
        try {
            return Files.readAllLines(Paths.get("names.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
