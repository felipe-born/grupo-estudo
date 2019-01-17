package br.com.involves.jesus.stack.ui;

import br.com.involves.jesus.stack.command.CommandProcessor;
import br.com.involves.jesus.stack.command.HelpCommand;
import br.com.involves.jesus.stack.model.Text;

import java.io.PrintStream;
import java.util.Scanner;

public class Gui {
    private final Text text;
    private final Scanner input;
    private final PrintStream output;
    private boolean shouldContinue = true;

    public Gui(Text text, Scanner input, PrintStream output) {

        this.text = text;
        this.input = input;
        this.output = output;
    }

    public void init() {
        output.println("E aí, bora começar essa bagaça!!");
        HelpCommand.getInstance().process(null);

        while (shouldContinue) {
            String command = input.nextLine();

            CommandProcessor.execute(command);

            output.println("## => " + text.toString());
        }
    }
}
