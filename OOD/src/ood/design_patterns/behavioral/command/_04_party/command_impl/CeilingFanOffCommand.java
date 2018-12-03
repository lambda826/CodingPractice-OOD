package ood.design_patterns.behavioral.command._04_party.command_impl;

import ood.design_patterns.behavioral.command._04_party._ICommand;
import ood.design_patterns.behavioral.command._04_party.entity.CeilingFan;

public class CeilingFanOffCommand implements _ICommand {
    
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    public void undo() {
        switch (prevSpeed) {
        case CeilingFan.HIGH:
            ceilingFan.high();
            break;
        case CeilingFan.MEDIUM:
            ceilingFan.medium();
            break;
        case CeilingFan.LOW:
            ceilingFan.low();
            break;
        default:
            ceilingFan.off();
            break;
        }
    }
}
