package org.kook.design.patterns.command.example2;

import org.kook.design.patterns.command.example2.command.*;
import org.kook.design.patterns.command.example2.thirdparty.CeilingFan;
import org.kook.design.patterns.command.example2.thirdparty.GarageDoor;
import org.kook.design.patterns.command.example2.thirdparty.Light;
import org.kook.design.patterns.command.example2.thirdparty.impl.SimpleCeilingFan;
import org.kook.design.patterns.command.example2.thirdparty.impl.SimpleGarageDoor;
import org.kook.design.patterns.command.example2.thirdparty.impl.SimpleLight;
import org.kook.design.patterns.command.example2.thirdparty.impl.SimpleStereo;

import java.util.List;

public class Main {

    private static final String LIVING_ROOM = "living room";
    private static final String KITCHEN = "kitchen";
    private static final String UNDERGROUND = "underground";

    public static void main(String[] args) {

        Light livingRoomSimpleLight = new SimpleLight(LIVING_ROOM);
        Light kitchenSimpleLight = new SimpleLight(KITCHEN);
        CeilingFan livingRoomCeilingFan = new SimpleCeilingFan(LIVING_ROOM);
        GarageDoor undergroundGarageDoor = new SimpleGarageDoor(UNDERGROUND);
        SimpleStereo livingRoomStereo = new SimpleStereo(LIVING_ROOM);

        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomSimpleLight);
        Command kitchenLightOnCommand = new LightOnCommand(kitchenSimpleLight);
        Command livingRoomCeilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        Command undergroundGarageDoorOpenCommand = new GarageDoorOpenCommand(undergroundGarageDoor);
        Command livingRoomStereoOnWithCdModeCommand = new StereoOnWithCdModeCommand(livingRoomStereo);

        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomSimpleLight);
        Command kitchenLightOffCommand = new LightOffCommand(kitchenSimpleLight);
        Command livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
        Command undergroundGarageDoorCloseCommand = new GarageDoorCloseCommand(undergroundGarageDoor);
        Command livingRoomStereoOffCommand = new StereoOffCommand(livingRoomStereo);

        Command noCommand = new NoCommand();

        List<Command> onCommands = List.of(
                livingRoomLightOnCommand,
                kitchenLightOnCommand,
                livingRoomCeilingFanHighCommand,
                undergroundGarageDoorOpenCommand,
                livingRoomStereoOnWithCdModeCommand,
                new MacroCommand(List.of(livingRoomLightOnCommand, kitchenLightOnCommand)),
                noCommand
        );
        List<Command> offCommands = List.of(
                livingRoomLightOffCommand,
                kitchenLightOffCommand,
                livingRoomCeilingFanOffCommand,
                undergroundGarageDoorCloseCommand,
                livingRoomStereoOffCommand,
                new MacroCommand(List.of(livingRoomLightOffCommand, kitchenLightOffCommand)),
                noCommand
        );
        RemoteControl remoteControl = new RemoteControl(onCommands, offCommands);

        for (int i = 0; i < remoteControl.getCommandsNumber(); i++) {
            remoteControl.clickButtonOn(i);
            remoteControl.clickButtonOff(i);
            remoteControl.clickButtonUndo();
            System.out.println("******************************************************");
        }

    }

}
