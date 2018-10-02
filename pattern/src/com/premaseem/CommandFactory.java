package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public final class CommandFactory {
    private final Map<String, Command> commands;

    private CommandFactory() {
        commands = new HashMap<>();
    }

    public void addCommand(final String name, final Command command) {
        commands.put(name, command);
    }

    public void executeCommand(String name) {
        if (commands.containsKey(name)) {
            commands.get(name).execute();
        }else{
            System.out.println(name+ " Command not found");
        }
    }

    public void listCommands() {
        System.out.println("Available commands: " + commands.keySet().stream().collect(Collectors.joining(", ")));
    }

    /* Factory pattern */
    public static CommandFactory init() {
        final CommandFactory cf = new CommandFactory();

        // commands are added here using lambdas.
        // It is also possible to dynamically add commands without editing the code.
        cf.addCommand("LightOn", () -> System.out.println("Light turned on"));
        cf.addCommand("LightOff", () -> System.out.println("Light turned off"));

        return cf;
    }
}
