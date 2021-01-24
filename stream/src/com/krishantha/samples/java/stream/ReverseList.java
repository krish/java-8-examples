package com.krishantha.samples.java.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-January-2021 20:13
 * @Project stream
 */
public class ReverseList<T> implements Iterable<T> {

    List<T> list;

    public ReverseList(List<T> list) {
        this.list = list;
    }


    @Override
    public Iterator<T> iterator() {
        int lastIndex=this.list.size()-1;


        Iterator<T> iterator=new Iterator<T>() {
            int currentIndex=lastIndex;
            @Override
            public boolean hasNext() {
                return currentIndex >=0;
            }

            @Override
            public T next() {
                T next=list.get(currentIndex);
                currentIndex--;
                return next;
            }
        };
        return iterator;
    }


}
