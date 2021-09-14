package ru.geekbrains.java_algoritms_homework_3;

import java.util.Arrays;

public class MyQueue<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private int nextIndex(int index) {
        if (index >= list.length) return ((index + 1) - list.length);
        else return (index + 1);
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue isEmpty!");
        }

        return list[begin];
    }

    public void insert(T item) {
        if (isFull()) {
            int newSize = (int)(list.length * 1.5F + 1); // Определение нового размера массива
            reCapacity(newSize); // Увеличение размера массива
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public int getLength() {
        return list.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void reCapacity(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        System.arraycopy(list, 0, temp, 0, size);
        list = temp;
    }

    public void print() {
        System.out.println(Arrays.toString(list));
    }

}
