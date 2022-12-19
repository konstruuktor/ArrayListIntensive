package ru.zotov.arrayListintensive.example;

import java.util.Comparator;

public class QuickSort<E extends Comparable<E>> {
    public Comparator<Integer> comparator() {
        return new NaturalComparator<Integer>();
    }

    public Integer[] sort(ArrayListIntensive<E> list) {
        Integer[] array = new Integer[list.size()];
        System.arraycopy(list.values, 0, array, 0, list.size());
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(Integer[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            //   if (arr[j] <= pivot) {
            if (comparator().compare(arr[j], pivot) < 1) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

}
