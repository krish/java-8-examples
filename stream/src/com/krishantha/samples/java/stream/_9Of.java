package com.krishantha.samples.java.stream;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 23:43
 * @Project stream
 */
public class _9Of {

    /*
    Stream is not only valid with collection. any group of values are subject to use streams
    Stream.of() method can convert group of values to stream and then you can apply any operation you need.
     */

    public static void main(String[] args) {
        Stream<String> vouwels=Stream.of("A","E","I","O","U");
        List<String> letters=vouwels.map(l->l.toUpperCase()+"."+l.toLowerCase()).collect(Collectors.toList());
        System.out.println(letters);

        Integer[] intArray={143,45,78,34,986,23,78,764};
        List<Integer> sorted=Stream.of(intArray).sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
        System.out.println(sorted);
    }
}
