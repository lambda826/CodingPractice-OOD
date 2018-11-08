package ood.design_pattern.behavioral.command._02_remote.command_impl;

import ood.design_pattern.behavioral.command._02_remote._ICommand;
import ood.design_pattern.behavioral.command._02_remote.entity.Hottub;

public class HottubOnCommand implements _ICommand {
    
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}
