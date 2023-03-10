package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> newSet = new HashSet<>(firstSet);
        newSet.retainAll(secondSet);
        newSet.removeAll(thirdSet);

        Set<String> thirdSetRelativeComplement = new HashSet<>(thirdSet);
        thirdSetRelativeComplement.removeAll(firstSet);
        thirdSetRelativeComplement.removeAll(secondSet);

        newSet.addAll(thirdSetRelativeComplement);

        return newSet;
    }
}
