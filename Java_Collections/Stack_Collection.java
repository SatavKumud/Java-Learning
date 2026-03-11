package Java_Collections;

import java.util.Stack;

public class Stack_Collection {
    public static void main(String[] args) {
        Stack<String> students = new Stack<>();

        students.push("Kumud");
        students.push("Saru");
        students.push("Chinu");
        students.push("Vaishu");

        System.out.println("Stack is:"+ students);

        System.out.println("Popped element is: "+students.pop());
        System.out.println("Stack after popping element is: "+students);

        System.out.println("Element at top is:"+ students.peek());

    }
}
