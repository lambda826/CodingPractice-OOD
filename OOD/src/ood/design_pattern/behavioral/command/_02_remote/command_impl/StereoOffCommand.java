package ood.design_pattern.behavioral.command._02_remote.command_impl;

import ood.design_pattern.behavioral.command._02_remote._ICommand;
import ood.design_pattern.behavioral.command._02_remote.entity.Stereo;

public class StereoOffCommand implements _ICommand {
    
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
