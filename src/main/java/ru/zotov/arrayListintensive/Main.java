package ru.zotov.arrayListintensive;

import ru.zotov.arrayListintensive.example.ArrayListIntensive;
import ru.zotov.arrayListintensive.example.QuickSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListIntensive<Integer> testlist = new ArrayListIntensive<>();
           for (int i = 25; i >= 0; i--) {
            testlist.add(i);
        }
        System.out.println(testlist);

        int v = testlist.size();
        System.out.println(v);

        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] sorted = quickSort.sort(testlist);

        ArrayListIntensive<Integer> sortedlist = new ArrayListIntensive<>(sorted);
        System.out.println(sortedlist);

        testlist.update(8, 777);
        System.out.println(testlist);

        testlist.delete(5);
        System.out.println(testlist);

        int y = testlist.get(9);
        System.out.println(y);

        testlist.clear();
        System.out.println(testlist);

    }


}
