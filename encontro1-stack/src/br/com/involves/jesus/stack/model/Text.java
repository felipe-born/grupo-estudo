package br.com.involves.jesus.stack.model;

import br.com.involves.jesus.stack.algorithm.jesus_impl.JesusStack;
import br.com.involves.jesus.stack.algorithm.Stack;

public class Text {

    private String textBuilder = new String();
    private Stack<String> stackText = new JesusStack<>();

    public void add(String textCommand) {
        textBuilder = textBuilder + textCommand;
        stackText.push(textCommand);
    }

    public void undo() {
        String pop = stackText.pop();
        textBuilder = textBuilder.substring(0, textBuilder.length() - pop.length());
    }

    @Override
    public String toString() {
        return textBuilder;
    }
}
