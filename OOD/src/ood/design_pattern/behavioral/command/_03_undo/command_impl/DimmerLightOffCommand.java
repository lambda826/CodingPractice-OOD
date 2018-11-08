package ood.design_pattern.behavioral.command._03_undo.command_impl;

import ood.design_pattern.behavioral.command._03_undo.Light;
import ood.design_pattern.behavioral.command._03_undo._ICommand;

public class DimmerLightOffCommand implements _ICommand {
    
    Light light;
    int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        prevLevel = 100;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(prevLevel);
    }
}
