package ood.design_pattern.behavioral.command._01_simpler_remote;

import ood.design_pattern.behavioral.command._01_simpler_remote.command_impl.GarageDoorOpenCommand;
import ood.design_pattern.behavioral.command._01_simpler_remote.command_impl.LightOnCommand;

public class RemoteControlTest {
    
    public static void main(String[] args) {
        
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        // Command
        LightOnCommand lightOn = new LightOnCommand(new Light());
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(new GarageDoor());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
