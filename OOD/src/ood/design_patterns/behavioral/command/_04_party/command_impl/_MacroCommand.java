package ood.design_patterns.behavioral.command._04_party.command_impl;

import ood.design_patterns.behavioral.command._04_party._ICommand;

public class _MacroCommand implements _ICommand {
    
    _ICommand[] commands;

    public _MacroCommand(_ICommand[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
