package br.com.involves.jesus.stack.command;

import java.util.stream.Stream;

public enum CommandHandler {
    PRINT_COMMAND(commandText -> commandText.equals("$PRINT"), PrintCommand.getInstance()),
    ADD_COMAND(commandText -> !commandText.contains("$"), AddCommand.getInstance()),
    UNDO_COMMAND(commandText -> commandText.equals("$UNDO"), UndoCommand.getInstance());

    private final CommandValidator validator;
    private final Command command;

    CommandHandler(CommandValidator validator, Command command) {

        this.validator = validator;
        this.command = command;
    }

    public static Command getCommand(String commandText) {
        return Stream.of(values())
                .filter(commandHandler -> commandHandler.validator.isValid(commandText))
                .map(commandHandler -> commandHandler.command)
                .findFirst()
                .orElse(HelpCommand.getInstance());
    }
}
