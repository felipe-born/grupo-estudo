package br.com.involves.jesus.stack.main;

import br.com.involves.jesus.stack.algorithm.Stack;
import br.com.involves.jesus.stack.algorithm.jesus_impl.JesusStack;

import static java.lang.String.format;

public class TestMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new JesusStack<>();

        stack.push(15);

        expect(15, stack.top());
        expect(1, stack.size());

        stack.push(320);

        expect(320, stack.top());
        expect(2, stack.size());

        expect(320, stack.pop());
        expect(1, stack.size());

        expect(15, stack.pop());
        expect(0, stack.size());

        expect(true, stack.isEmpty());
    }

    private static <T> void expect(T expected, T actual) {

        System.out.print(format("[Expect: %s | Actual: %s]", expected, actual));

        if (equals(expected, actual))
            System.out.println(" - OK");
        else System.out.println(" - FAIL");
    }

    private static <T> boolean equals(T expected, T actual) {
        if (expected == null && actual == null)
            return true;
        if (expected == null || actual == null)
            return false;
        return expected.equals(actual);
    }
}
