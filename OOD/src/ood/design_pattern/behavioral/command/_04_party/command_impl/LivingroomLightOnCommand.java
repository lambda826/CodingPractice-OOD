package ood.design_pattern.behavioral.command._04_party.command_impl;

import ood.design_pattern.behavioral.command._04_party._ICommand;
import ood.design_pattern.behavioral.command._04_party.entity.Light;

public class LivingroomLightOnCommand implements _ICommand {
    
    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
