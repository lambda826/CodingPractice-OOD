package ood.design_pattern.behavioral.command._01_simpler_remote.command_impl;

import ood.design_pattern.behavioral.command._01_simpler_remote.GarageDoor;
import ood.design_pattern.behavioral.command._01_simpler_remote._ICommand;

public class GarageDoorOpenCommand implements _ICommand {
    
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
