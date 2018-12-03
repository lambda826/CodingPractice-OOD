package ood.design_patterns.behavioral.command._03_undo.command_impl;

import ood.design_patterns.behavioral.command._03_undo.CeilingFan;
import ood.design_patterns.behavioral.command._03_undo._ICommand;

public class CeilingFanOnCommand implements _ICommand {
    
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
	public void undo() {
		ceilingFan.off();
	}
}
