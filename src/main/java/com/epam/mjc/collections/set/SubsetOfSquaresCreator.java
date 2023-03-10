package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> squares = new TreeSet<>();
        sourceList.forEach(element -> squares.add(element * element));
        return squares.subSet(lowerBound, true, upperBound, true);
    }
}
