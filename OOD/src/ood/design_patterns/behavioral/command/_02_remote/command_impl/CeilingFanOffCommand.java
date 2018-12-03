package ood.design_patterns.behavioral.command._02_remote.command_impl;

import ood.design_patterns.behavioral.command._02_remote._ICommand;
import ood.design_patterns.behavioral.command._02_remote.entity.CeilingFan;

public class CeilingFanOffCommand implements _ICommand {
    
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}
