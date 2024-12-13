package com.mycompany.ejercicios;

import java.util.HashMap;
import java.util.Stack;

public class ParenthesesBalance {

    public ParenthesesBalance() {

    }

    public boolean isParendBalanced(String text) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> openingParen = new HashMap<>();

        openingParen.put(')', '(');
        openingParen.put(']', '[');
        openingParen.put('}', '{');

        for (Character c : text.toCharArray()) {
            if (openingParen.containsValue(c)) {
                stack.push(c);
                System.out.println("Letter c:" + c + "Stack: " + stack);
            } else if (openingParen.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != openingParen.get(c)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
