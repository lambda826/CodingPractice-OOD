package ood.design_pattern.behavioral.command._03_undo.command_impl;

import ood.design_pattern.behavioral.command._03_undo.Light;
import ood.design_pattern.behavioral.command._03_undo._ICommand;

public class LightOffCommand implements _ICommand {
    
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
