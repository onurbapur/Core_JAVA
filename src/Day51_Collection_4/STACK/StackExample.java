/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.STACK;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        System.out.println("Stack data structure(First In Last Out-FILO in java.");//LIFO
        Stack<Integer> numStack = new Stack<>();

        numStack.push(3);
        numStack.push(30);
        numStack.push(2);
        numStack.push(5);
        numStack.push(75);
        numStack.push(12);

        numStack.forEach(eleman-> System.out.println(eleman));
        System.out.println("numStack.peek() = " + numStack.peek());

        numStack.forEach(eleman-> System.out.println("After peek()- "  + eleman));
        System.out.println("numStack.pop() = " + numStack.pop());
        System.out.println("numStack.pop() = " + numStack.pop());

        numStack.forEach(eleman-> System.out.println("After pop()- "  + eleman));
        System.out.println("numStack.search(30) = " + numStack.search(30));

    }
}
