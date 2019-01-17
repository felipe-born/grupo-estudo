package br.com.involves.jesus.stack.command;

import br.com.involves.jesus.stack.model.Text;

import java.io.PrintStream;
import java.util.Scanner;

public class CommandsInitializer {
    public static void initializeAllCommands(Text text, Scanner input, PrintStream output) {
        AddCommand.init(text);
        PrintCommand.init(text, output);
        HelpCommand.init(output);
        UndoCommand.init(text);
    }
}
