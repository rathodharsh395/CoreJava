package collectionFramework.listImpl;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        //parenthesis solving
        //valid : {}, {[]}
        //invalid: {{,]],{[[}
        //switch and stack
        Stack<Integer> stack =new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(30);
        System.out.println(stack.push(20));//return integer

        //search(): search for presence and return index of any element
        System.out.println(stack.search(20));// return index

        //peek(): will just give element which is on top of stack. it won't delete the element
        System.out.println("on top of stack "+ stack.peek());

        //pop(): it will delete the element which is on top of stack
        System.out.println("Pop "+ stack.pop());

        //size(): no. of elements present in the stack
        System.out.println("Size of stack "+stack.size());

        //isEmpty(): it will return true if the stack is empty otherwise false
        System.out.println("Is stack empty "+stack.isEmpty());

        //search(): index starts form top(1) & if element not present return -1
        System.out.println("search 300 "+stack.search(300));

    }
}
