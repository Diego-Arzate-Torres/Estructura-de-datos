package edu.diego.arzate.torres.Modulo1.tarea3.process;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * La clase process contiene métodos para convertir una expresión matemática en notación infija a notación postfija y evaluar una expresión en notación postfija.
 */
public class process {

    /**
     * Convierte una expresión matemática en notación infija a notación postfija.
     *
     * @param expression La expresión en notación infija a convertir.
     * @return La expresión convertida en notación postfija.
     */
    public static String process(String expression) {


    /**
     * Evalúa una expresión matemática en notación postfija.
     *
     * @param postfix La expresión en notación postfija a evaluar.
     * @return El resultado de la evaluación de la expresión.
     */

        int precedence[] = new int[128];
        precedence['+'] = 1;
        precedence['-'] = 1;
        precedence['*'] = 2;
        precedence['/'] = 2;
        precedence['^'] = 3;
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder postfix = new StringBuilder();
        for (char c : expression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence[c] <= precedence[stack.peek()]) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static int evaluate(String postfix) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                    case '^':
                        stack.push((int) Math.pow(a, b));
                        break;
                }
            }
        }
        return stack.pop();
    }
}