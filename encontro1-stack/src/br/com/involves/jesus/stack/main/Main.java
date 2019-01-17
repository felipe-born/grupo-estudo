package br.com.involves.jesus.stack.main;

import br.com.involves.jesus.stack.command.CommandsInitializer;
import br.com.involves.jesus.stack.model.Text;
import br.com.involves.jesus.stack.ui.Gui;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Text text = new Text();
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        Gui gui = new Gui(text, input, output);

        CommandsInitializer.initializeAllCommands(text, input, output);

        gui.init();

    }
}
