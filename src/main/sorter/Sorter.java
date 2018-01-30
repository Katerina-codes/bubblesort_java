package main.sorter;

import java.util.List;

public class Sorter {
    public List<Integer> sortList(List<Integer> unsortedList) {
        for (Integer currentNumber : unsortedList) {
        currentNumber = unsortedList.get(0);
        Integer nextNumber = unsortedList.get(1);
        if (currentNumber > nextNumber) {
                unsortedList.set(0, nextNumber);
                unsortedList.set(1, currentNumber);
            }
        }
        return unsortedList;
    }
}

