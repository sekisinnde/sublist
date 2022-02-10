package com.partition;

import java.util.Arrays;

public class PartitionTwoDim {

    public static void main(String[] args) {

        // {{1,2, {3, 4}, {5}}}
        // out
        // {1, 2}
        // {3, 4}
        // {5}
        // [row] [col]
        // C1 C2
        // R1 1 2
        // R2 3 4
        // R3 5 0

        for (int[] a : partition(new int[] { 1, 2, 3, 4, 5 }, 2)) {
            System.out.println(Arrays.toString(a));
        }
    }

    // thi is a two dimensional array
    public static int[][] partition(int arr[], int col) {
        int partition[][];
        int row;

        if (col == 1) {
            row = arr.length;
        } else {
            row = arr.length != col && arr.length % col != 0 ? (arr.length / col) + 1 : arr.length / col;
        }

        partition = new int[row][col];
        int counter = 0;

        for (int ar = 0; ar < row; ar++) {
            for (int ac = 0; ac < col; ac++) {
                if (counter <= arr.length - 1) {
                    partition[ar][ac] = arr[counter];
                    counter++;
                }
            }
        }

        return partition;
    }
}
