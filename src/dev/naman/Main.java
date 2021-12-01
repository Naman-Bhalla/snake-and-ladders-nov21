package dev.naman;

import dev.naman.commands.CommandRegistry;
import dev.naman.commands.CreateUserCommand;
import dev.naman.commands.StartGameCommand;
import dev.naman.exceptions.InvalidCommandException;
import dev.naman.models.Cell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        CommandRegistry commandRegistry = new CommandRegistry();
        commandRegistry.registerCommand(new CreateUserCommand());
        commandRegistry.registerCommand(new StartGameCommand());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // print the menu
            System.out.printf("> ");
            String input = br.readLine().toString();
            try {
                commandRegistry.execute(input);
            } catch (InvalidCommandException exception) {
                System.out.println("The command you entered was invalid");
            }
        }
        // CreateUser naman@scaler.com naman
        // StartGame naman@scaler.com abc@scaler.com 100
    }
	// write your code here
}

// Command Design Pattern + Registry
// Builder -> Director

// StartGame u1, u2, u3 100 AUTOMATIC
// StartGame u1, u2 500 MANUAL
// 3
// 6  1
// 45  39
// 32  20
// 1
// 8 91

// Assignment
// 1. Make a game run
// Have a factory
// Pass the game object created via factory to gamecontroller
