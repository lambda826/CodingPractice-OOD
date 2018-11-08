package ood.design_pattern.behavioral.command._01_simpler_remote;

public class SimpleRemoteControl {
    
    private _ICommand slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(_ICommand command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
