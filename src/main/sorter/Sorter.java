package main.sorter;

import java.util.List;

public class Sorter {
    public List<Integer> sortList(List<Integer> unsortedList) {
        int currentIndex = 0;
        Integer nextNumber = unsortedList.get(1);

        for (Integer currentElement : unsortedList) {
            int swapCounter = 1;

            while (swapCounter > 0 && currentIndex < unsortedList.size() - 1) {
                swapCounter = 0;

                if (currentElement > nextNumber) {
                    unsortedList.set(currentIndex, nextNumber);
                    unsortedList.set(currentIndex += 1, currentElement);

                    nextNumber = unsortedList.get(nextNumber);
                    swapCounter++;
                } else {
                    swapCounter = 0;
                }

                if (currentElement > nextNumber) {
                    sortList(unsortedList);
                }
            }
        }

        return unsortedList;
    }
}

