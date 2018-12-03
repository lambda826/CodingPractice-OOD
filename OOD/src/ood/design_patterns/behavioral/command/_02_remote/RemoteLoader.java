package ood.design_patterns.behavioral.command._02_remote;

import ood.design_patterns.behavioral.command._02_remote.command_impl.CeilingFanOffCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.CeilingFanOnCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.GarageDoorDownCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.GarageDoorUpCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.LightOffCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.LightOnCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.StereoOffCommand;
import ood.design_patterns.behavioral.command._02_remote.command_impl.StereoOnWithCDCommand;
import ood.design_patterns.behavioral.command._02_remote.entity.CeilingFan;
import ood.design_patterns.behavioral.command._02_remote.entity.GarageDoor;
import ood.design_patterns.behavioral.command._02_remote.entity.Light;
import ood.design_patterns.behavioral.command._02_remote.entity.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
