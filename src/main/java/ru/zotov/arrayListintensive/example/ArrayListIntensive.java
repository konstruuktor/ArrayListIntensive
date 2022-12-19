package ru.zotov.arrayListintensive.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListIntensive<E> implements Teams<E> {
    public E[] values = (E[]) new Object[0];

    public ArrayListIntensive() {
    }

    public ArrayListIntensive(E[] objects){
        this.values = objects;
    }
    /**
     * Добавляет новый элемент в коллекцию
     *
     * @param e новый элемент, который будет добавлен
     * @return результат успешности добавления
     */
    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * Удаляет элемент по индексу
     *
     * @param index индекс удаляемого элемента
     */
    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Получение элемента по индексу
     *
     * @param index индекс получаемого элемента
     * @return возвращает полученный по индексу элемент
     */
    @Override
    public E get(int index) {
        return values[index];
    }

    /**
     * Получение размера ArrayList
     *
     * @return возвращает размер ArrayList
     */
    @Override
    public int size() {
        return values.length;
    }

    /**
     * Изменение элемента ArrayList
     *
     * @param index Индекс изменяемого элемента
     * @param e     новое значение, которым заменяем существующее
     */
    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    /**
     * Удаление всех элементов ArrayList
     */
    @Override
    public void clear() {
        values = (E[]) new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return new SimpleIterator<>(values);
    }

    /**
     * Стандартное переопределение метода toString для отображения в виде строки
     *
     * @return
     */
    public String toString() {
        Iterator<E> it = iterator();
        if (!it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }


}
