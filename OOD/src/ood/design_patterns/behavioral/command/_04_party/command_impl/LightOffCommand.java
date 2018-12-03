package ood.design_patterns.behavioral.command._04_party.command_impl;

import ood.design_patterns.behavioral.command._04_party._ICommand;
import ood.design_patterns.behavioral.command._04_party.entity.Light;

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
