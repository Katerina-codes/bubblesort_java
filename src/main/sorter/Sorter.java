package main.sorter;

import java.util.List;

public class Sorter {
    public List<Integer> sortList(List<Integer> unsortedList) {
        boolean swapped = true;

        while (swapped) {

            swapped = false;

            for (int i = 0; i < unsortedList.size() - 1; i++) {
                if (unsortedList.get(i) > unsortedList.get(i + 1)) {

                    int currentValue = unsortedList.get(i);
                    unsortedList.set(i, unsortedList.get(i + 1));
                    unsortedList.set(i + 1, currentValue);
                    swapped = true;
                }
            }
        }
        return unsortedList;
    }
}

