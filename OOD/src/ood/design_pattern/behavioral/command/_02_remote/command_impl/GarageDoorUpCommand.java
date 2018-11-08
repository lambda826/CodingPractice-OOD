package ood.design_pattern.behavioral.command._02_remote.command_impl;

import ood.design_pattern.behavioral.command._02_remote._ICommand;
import ood.design_pattern.behavioral.command._02_remote.entity.GarageDoor;

public class GarageDoorUpCommand implements _ICommand {
    
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
