package com.partition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PartitionTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void shouldThrowAnIndexOutOfBoundExceptionWhenSizeIsLessThanZero() {
        exceptionRule.expect(IndexOutOfBoundsException.class);
        Partition.partition(List.of(1, 2, 3, 4, 5), -1);
    }

    @Test
    public void shouldReturnAnEmptyListWhenSizeIsEqualToZero() {
        assertEquals(Partition.partition(List.of(1, 2, 3, 4, 5), 0), new ArrayList<List<Integer>>());
    }

    @Test
    public void shouldReturnAListOfSubListsOfSizeTwo() {
        List<List<Integer>> listSubList = List.of(List.of(1,2),List.of(3,4), List.of(5));
        assertEquals(Partition.partition(List.of(1, 2, 3, 4, 5), 2), listSubList);   
    }

    @Test
    public void shouldReturnAListOfSubListsOfSizeThree() {
        List<List<Integer>> listSubList = List.of(List.of(1,2,3),List.of(4,5));
        assertEquals(Partition.partition(List.of(1, 2, 3, 4, 5), 3), listSubList);   
    }
}
