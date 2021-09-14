/*
        Алгоритмы и структуры данных на Java
        Практическое задание к лекции № 3
        Кононов Леонид Александрович
        Согласно заданию, в программе реализовано:
        1. Создан класс реализации дека;
        2. Создана программа, переворачивающая вводимые строки;
        3. Добавлено увеличение массива в классе стек и приоритетная очередь;
        4. Реализован метод, увеличивающий массив в классе очередь.
*/

        package ru.geekbrains.java_algoritms_homework_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> myDeque = new Deque<>();
        myDeque.insert(4);
        myDeque.insert(6);
        myDeque.insert(8);
        myDeque.insert(3);
        myDeque.insert(1);
        myDeque.insert(9);
        myDeque.insert(7);

        int dequeTempSize = myDeque.size();

//        for (int i = 0; i < dequeTempSize; i++) { // Реализация очереди
//            System.out.println(myDeque.removeFront());
//        }

        for (int i = 0; i < dequeTempSize; i++) {
            System.out.println(myDeque.removeRear()); // Реализация стека
        }
//        System.out.println("Front element before removing: " + myDeque.peekFront()); // Тестирование чтения и убирания элементов с обеих сторон
//        System.out.println("Rear element before removing: " + myDeque.peekRear());
//        System.out.println("Removed element: " + myDeque.removeFront());
//        System.out.println("Removed element: " + myDeque.removeRear());
//        System.out.println("Front element after removing: " + myDeque.peekFront());
//        System.out.println("Rear element after removing: " + myDeque.peekRear());



//        MyStack<Integer> myStack = new MyStack<>();
//
//        myStack.push(5);
//        myStack.push(2);
//        myStack.push(9);
//        myStack.push(1);
//        myStack.push(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(myStack.pop());
//        }

//        Expression e = new Expression("()+{}+[{}]");
//        System.out.println(e.checkBracket());

//        MyStack<Character> myCharStack = new MyStack<>(); // Создание массива для хранения символов
//        myCharStack.reverse("any string"); // Разворот и вывод строки в консоль




//        MyQueue<Integer> queue = new MyQueue<>();
//
//        queue.insert(3);
//        queue.insert(2);
//        queue.insert(7);
//        queue.insert(4);
//        queue.insert(6);
//        queue.insert(3);
//        queue.insert(8);
//        queue.insert(1);
//        queue.insert(5);
//        queue.insert(9);
////        queue.print(); //Вывод массива на печать
//        queue.insert(8); // Переполнение массива
//        queue.insert(5);
//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(5);
//        queue.insert(3);
//        queue.insert(3);
//        queue.insert(8);
//        queue.insert(8);
////        queue.print();
//        int tempSize = queue.size();
//
//        for (int i = 0; i < tempSize; i++) {
//            System.out.println(queue.remove());
//        }

//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(5);
//        mpq.insert(2);
//        mpq.insert(20);
//        mpq.insert(21);
//        mpq.insert(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(mpq.remove());
//        }
    }
}
