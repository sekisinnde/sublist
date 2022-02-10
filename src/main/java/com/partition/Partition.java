package com.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {

    public static List<List<Integer>> partition(List<Integer> list, int size) throws IndexOutOfBoundsException {
        // an instance of ArrayList Object having a List as a sublist

        // List<List<Integer>> this is programing to an interface
        List<List<Integer>> sublist = new ArrayList<List<Integer>>();
        int row;
        int counter = 0;

        if (size < 0) {
            throw new IndexOutOfBoundsException();
        } 

        if(size == 0 ) {
            return sublist;
        }


        if (size == 1) {
            row = list.size();
        } else {
            // its all about odd and even 
            row = list.size() != size && list.size() % size != 0 ? (list.size() / size) + 1 : list.size() / size;
        }


        for (int ar = 0; ar < row; ar++) { 
            List<Integer> rowList = new ArrayList<Integer>();
            for (int ac = 0; ac < size; ac++) {
                if (counter <= list.size() - 1)
                    rowList.add(list.get(counter++));
            }
            sublist.add(rowList);
        }

        return sublist;
    }
}
