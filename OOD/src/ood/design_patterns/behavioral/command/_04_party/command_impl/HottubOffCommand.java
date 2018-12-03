package ood.design_patterns.behavioral.command._04_party.command_impl;

import ood.design_patterns.behavioral.command._04_party._ICommand;
import ood.design_patterns.behavioral.command._04_party.entity.Hottub;

public class HottubOffCommand implements _ICommand {
    
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo() {
        hottub.on();
    }
}
