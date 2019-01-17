package br.com.involves.jesus.stack.command;

public class CommandProcessor {
    public static void execute(String textCommand) {
        Command command = CommandHandler.getCommand(textCommand);
        command.process(textCommand);

    }
}
