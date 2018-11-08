package ood.design_pattern.behavioral.command._04_party.command_impl;

import ood.design_pattern.behavioral.command._04_party._ICommand;
import ood.design_pattern.behavioral.command._04_party.entity.Light;

public class LivingroomLightOffCommand implements _ICommand {
    
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
