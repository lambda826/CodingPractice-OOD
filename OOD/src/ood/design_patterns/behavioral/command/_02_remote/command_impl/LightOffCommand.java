package ood.design_patterns.behavioral.command._02_remote.command_impl;

import ood.design_patterns.behavioral.command._02_remote._ICommand;
import ood.design_patterns.behavioral.command._02_remote.entity.Light;

public class LightOffCommand implements _ICommand {
    
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
