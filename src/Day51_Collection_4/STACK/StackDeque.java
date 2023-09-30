/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.STACK;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*

Note: Please note that the Stack class in Java is a legacy class and inherits from Vector in Java.
It is a thread-safe class and hence involves overhead when we do not need thread safety.
It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.
 */
public class StackDeque {
    public static void main(String[] args) {
        System.out.println("Stack and Deque");
        Stack<Integer> numbersStack = new Stack<>();

        numbersStack.push(2);
        numbersStack.push(3);
        numbersStack.push(5);
        numbersStack.push(4);
        numbersStack.push(10);

        System.out.println("Wrong order.");
        System.out.println("numbersStack = " + numbersStack);//Wrong sequence
        System.out.println("---------------------");

        System.out.println(numbersStack.pop());

        System.out.println("Deque implementation of Stack");
        Deque<Integer> numbersDeque = new ArrayDeque<>();
        numbersDeque.push(2);
        numbersDeque.push(3);
        numbersDeque.push(5);
        numbersDeque.push(4);
        numbersDeque.push(10);


        System.out.println("Correct order.");
        System.out.println("numbersDeque = " + numbersDeque);
        System.out.println(numbersDeque.pop());
    }
}
