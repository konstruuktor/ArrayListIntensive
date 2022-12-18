package ru.zotov.arrayListintensive.example;

import java.util.Iterator;

class SimpleIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;

    SimpleIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}