package ood.design_patterns.behavioral.command._04_party.command_impl;

import ood.design_patterns.behavioral.command._04_party._ICommand;
import ood.design_patterns.behavioral.command._04_party.entity.Stereo;

public class StereoOnCommand implements _ICommand {
    
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}
