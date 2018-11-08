package ood.design_pattern.behavioral.command._01_simpler_remote.command_impl;

import ood.design_pattern.behavioral.command._01_simpler_remote.Light;
import ood.design_pattern.behavioral.command._01_simpler_remote._ICommand;

public class LightOffCommand implements _ICommand {
    
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
