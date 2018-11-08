package ood.design_pattern.behavioral.command._02_remote.command_impl;

import ood.design_pattern.behavioral.command._02_remote._ICommand;
import ood.design_pattern.behavioral.command._02_remote.entity.GarageDoor;

public class GarageDoorDownCommand implements _ICommand {
    
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
