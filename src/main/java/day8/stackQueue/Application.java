package day8.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    private static void testQueue() {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("queue.peek() : " + queue.peek());
        System.out.println("queue.size() : " + queue.size());
        System.out.println("queue.add(100) : " + queue.add(100));
        System.out.println("queue.peek() : " + queue.peek());
        System.out.println("queue.size() : " + queue.size());
        System.out.println("queue.add(110) : " + queue.add(110));
        System.out.println("queue.add(120) : " + queue.add(120));
        System.out.println("queue.peek() : " + queue.peek());
        System.out.println("queue.size() : " + queue.size());
        System.out.println("queue.poll() : " + queue.poll());
        System.out.println("queue.peek() : " + queue.peek());
        System.out.println("queue.size() : " + queue.size());
        System.out.println("queue.remove() : " + queue.remove());
        System.out.println("queue.peek() : " + queue.peek());
        System.out.println("queue.size() : " + queue.size());
    }

    private static void testStack() {
        Stack<Integer> stack = new Stack<>();
        System.out.println("stack.push(100) " + stack.push(100));
        System.out.println("stack.push(200) " + stack.push(200));
        System.out.println("stack.get(0) : " + stack.get(0));
        System.out.println("stack.get(1) : " + stack.get(1));
        System.out.println("stack.size() : " + stack.size());
        System.out.println("stack.peek() : " + stack.peek());
        System.out.println("stack.pop() : " + stack.pop());
        System.out.println("stack.size() : " + stack.size());
        System.out.println("stack.peek() : " + stack.peek());
    }
}
