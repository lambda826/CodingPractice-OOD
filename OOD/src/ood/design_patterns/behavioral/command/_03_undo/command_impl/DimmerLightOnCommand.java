package ood.design_patterns.behavioral.command._03_undo.command_impl;

import ood.design_patterns.behavioral.command._03_undo.Light;
import ood.design_patterns.behavioral.command._03_undo._ICommand;

public class DimmerLightOnCommand implements _ICommand {
    
    Light light;
    int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);
    }

    public void undo() {
        light.dim(prevLevel);
    }
}
