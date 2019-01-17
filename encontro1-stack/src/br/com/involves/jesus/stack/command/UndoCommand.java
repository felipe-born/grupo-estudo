package br.com.involves.jesus.stack.command;

import br.com.involves.jesus.stack.model.Text;

public class UndoCommand implements Command {
    private static UndoCommand instance;
    private final Text text;

    public UndoCommand(Text text) {

        this.text = text;
    }

    public static UndoCommand getInstance() {
        return instance;
    }

    public static void init(Text text) {
        instance = new UndoCommand(text);
    }

    @Override
    public void process(String textCommand) {
        this.text.undo();
    }
}
