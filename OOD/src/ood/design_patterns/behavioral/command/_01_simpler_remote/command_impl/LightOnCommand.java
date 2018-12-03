package ood.design_patterns.behavioral.command._01_simpler_remote.command_impl;

import ood.design_patterns.behavioral.command._01_simpler_remote.Light;
import ood.design_patterns.behavioral.command._01_simpler_remote._ICommand;

public class LightOnCommand implements _ICommand {
    
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
