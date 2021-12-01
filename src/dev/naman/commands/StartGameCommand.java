package dev.naman.commands;

import dev.naman.controllers.GameController;
import dev.naman.models.Game;

public class StartGameCommand implements ICommand {
    GameController gameController = new GameController();

    @Override
    public boolean matches(String command) {
        return false;
    }

    @Override
    public void execute(String command) {
        gameController.run(new Game());
    }
}
