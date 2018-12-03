package ood.design_patterns.behavioral.command._04_party;

import ood.design_patterns.behavioral.command._04_party.command_impl.HottubOffCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.HottubOnCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.LightOffCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.LightOnCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.StereoOffCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.StereoOnCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.TVOffCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl.TVOnCommand;
import ood.design_patterns.behavioral.command._04_party.command_impl._MacroCommand;
import ood.design_patterns.behavioral.command._04_party.entity.Hottub;
import ood.design_patterns.behavioral.command._04_party.entity.Light;
import ood.design_patterns.behavioral.command._04_party.entity.Stereo;
import ood.design_patterns.behavioral.command._04_party.entity.TV;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl_Invoker remoteControl = new RemoteControl_Invoker();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        _ICommand[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        _ICommand[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

        _MacroCommand partyOnMacro = new _MacroCommand(partyOn);
        _MacroCommand partyOffMacro = new _MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
