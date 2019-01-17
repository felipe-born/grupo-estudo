package br.com.involves.jesus.stack.command;

import java.io.PrintStream;

public class HelpCommand implements Command {
    private static HelpCommand instance;
    private final PrintStream output;

    private HelpCommand(PrintStream output) {
        this.output = output;
    }

    public static HelpCommand getInstance() {
        return instance;
    }

    public static void init(PrintStream output) {
        instance = new HelpCommand(output);
    }

    @Override
    public void process(String textCommand) {
        output.println("Deu ruim ai!!! Tenta outro comando: Comandos disponíveis: $UNDO | $PRINT | TEXTO_LIVRE (sem $)");
    }
}
