package br.com.involves.jesus.stack.command;

import br.com.involves.jesus.stack.model.Text;

public class AddCommand implements Command {

    private static AddCommand instance;
    private final Text text;

    private AddCommand(Text text) {

        this.text = text;
    }

    public static void init(Text text) {
        instance = new AddCommand(text);
    }

    public static AddCommand getInstance() {
        return instance;
    }

    @Override
    public void process(String textCommand) {
        text.add(textCommand);
    }
}
