package dev.naman.commands;

import dev.naman.exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {
    List<ICommand> commands = new ArrayList<>();

    public void registerCommand(ICommand command) {
        commands.add(command);
    }

    public void execute(String command) {
        for (ICommand c: commands) {
            if (c.matches(command)) {
                c.execute(command);
                return;
            }
        }

        throw new InvalidCommandException();
    }
}
