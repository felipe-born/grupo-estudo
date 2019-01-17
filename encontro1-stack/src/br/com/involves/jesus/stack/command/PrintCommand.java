package br.com.involves.jesus.stack.command;

import br.com.involves.jesus.stack.model.Text;

import java.io.PrintStream;

public class PrintCommand implements Command {
    private static PrintCommand instance;
    private final Text text;
    private final PrintStream output;

    private PrintCommand(Text text, PrintStream output) {

        this.text = text;
        this.output = output;
    }

    public static void init(Text text, PrintStream output) {
        instance = new PrintCommand(text, output);
    }

    public static PrintCommand getInstance() {
        return instance;
    }

    @Override
    public void process(String textCommand) {
        output.println(text.toString());
    }
}
