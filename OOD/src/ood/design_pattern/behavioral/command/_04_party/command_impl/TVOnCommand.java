package ood.design_pattern.behavioral.command._04_party.command_impl;

import ood.design_pattern.behavioral.command._04_party._ICommand;
import ood.design_pattern.behavioral.command._04_party.entity.TV;

public class TVOnCommand implements _ICommand {
    
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    public void undo() {
        tv.off();
    }
}
