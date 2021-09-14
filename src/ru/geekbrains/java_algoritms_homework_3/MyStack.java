package ru.geekbrains.java_algoritms_homework_3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyStack() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public void push(T item) {
        if (isFull()) {
            int newSize = (int)(size * 1.5F + 1); // Определение нового размера массива
            reCapacity(newSize); // Увеличение размера массива
        }
        list[size] = item;
        size++;
    }

    public T pop() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
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

    private void reCapacity(int newSize){
        T[] temp = (T[]) new Object[newSize];
        System.arraycopy(list, 0, temp, 0, size);
        list = temp;
    }

    public void reverse(String straight) { // Метод разворота строки с использованием стэка
        Object[] strArr = new Object[straight.length()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = straight.charAt(i);
            push((T)strArr[i]);
        }
        int temp = size;
        for (int i = 0; i < temp; i++) {
            System.out.print(pop());
        }
    }
}
