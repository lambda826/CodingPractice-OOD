package ood.design_pattern.behavioral.command._02_remote;

import ood.design_pattern.behavioral.command._02_remote.command_impl._NoCommand;

public class RemoteControl {
    
    _ICommand[] onCommands;
    _ICommand[] offCommands;

    public RemoteControl() {
        onCommands = new _ICommand[7];
        offCommands = new _ICommand[7];

        _ICommand noCommand = new _NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, _ICommand onCommand, _ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
