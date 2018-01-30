package test.sorter;

import main.sorter.Sorter;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class SorterTest {

   @Test
    public void sortsListOfTwoNumbers() {
        List<Integer> unsortedList = asList(2, 1);
        List<Integer> sortedList = asList(1, 2);

        Sorter sorter = new Sorter();
        assertEquals(sortedList, sorter.sortList(unsortedList));
    }
}
