package ru.zotov.arrayListintensive.example;

public interface Teams<E> extends Iterable<E> {

    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
    void clear();
    boolean add(E e, int index);
}
