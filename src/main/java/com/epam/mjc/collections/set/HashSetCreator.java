package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
         HashSet<Integer> output = new HashSet<>();
         for (Integer element : sourceList) {
             if (element % 2 == 0 && element != 0) {
                 int number = element;
                 output.add(number);
                 do {
                     number /= 2;
                     output.add(number);
                 } while (number % 2 == 0);
             } else if (element % 2 == 1) {
                 output.add(element);
                 output.add(element * 2);
             } else {
                 output.add(element);
             }
         }
         return output;
    }
}
