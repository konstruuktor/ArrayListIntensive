package ru.zotov.arrayListintensive.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListIntensiveTest {
    private ArrayListIntensive<Integer> arraylist;

    @BeforeEach
        //перед запуском теста обнули переменную
    void init() {
        arraylist = new ArrayListIntensive<>();
    }

    @Test
    void add() {
        //given
        int value = 5;
        //when
        arraylist.add(value);
        //then
        assertEquals(value, arraylist.get(0));
    }

    @Test
    void delete() {
        //given
        int value = 5;
        arraylist.add(value);
        //when
        arraylist.delete(0);
        //then
        assertEquals(0, arraylist.size());
    }

    @Test
    void get() {
        //given
        int value = 5;
        arraylist.add(value);
        //when
        int actual = arraylist.get(0);
        //then
        assertEquals(value, actual);
    }

    @Test
    void size() {
        //given
        int value = 5;
        arraylist.add(value);
        //when
        int size = arraylist.size();
        //then
        assertEquals(1, size);
    }

    @Test
    void update() {
        //given
        int value = 5;
        arraylist.add(value);
        //when
        arraylist.update(0, 6);
        int actual = arraylist.get(0);
        //then
        assertEquals(6, actual);
    }

    @Test
    void clear() {
        //given
        int value = 5;
        arraylist.add(value);
        //when
        arraylist.clear();
        //then
        assertEquals(0, arraylist.size());
    }

    @Test
    void iterator() {
        //given
        //when
        Iterator<Integer> iterator = arraylist.iterator();
        //then
        assertNotNull(iterator);
    }

    @Test
    void testToString() {
        //given
        int value = 5;
        arraylist.add(value);
        //when
        String result = arraylist.toString();
        //then
        assertEquals("[5]", result);
    }
}