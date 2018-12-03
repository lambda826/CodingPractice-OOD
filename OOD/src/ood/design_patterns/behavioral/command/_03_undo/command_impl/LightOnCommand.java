package ood.design_patterns.behavioral.command._03_undo.command_impl;

import ood.design_patterns.behavioral.command._03_undo.Light;
import ood.design_patterns.behavioral.command._03_undo._ICommand;

public class LightOnCommand implements _ICommand {
    
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
