package ood.design_patterns.behavioral.command._02_remote.command_impl;

import ood.design_patterns.behavioral.command._02_remote._ICommand;
import ood.design_patterns.behavioral.command._02_remote.entity.Light;

public class LightOnCommand implements _ICommand {
    
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
