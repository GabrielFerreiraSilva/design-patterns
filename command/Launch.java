package command;

import command.commands.TurnStereoOffCommand;
import command.commands.TurnStereoOnCommand;
import command.invokers.RemoteControl;
import command.receivers.Stereo;

public class Launch {
  public static void main(String[] args) {
    // Instanciando o controle remoto e o aparelho de som
    Stereo stereo = new Stereo();
    RemoteControl remoteControl = new RemoteControl();

    // Associando comandos
    remoteControl.setCommand(1, new TurnStereoOnCommand(stereo));
    remoteControl.setCommand(2, new TurnStereoOffCommand(stereo));

    // Pressionando botões do controle remoto
    remoteControl.pushButton1();
    System.out.println();
    remoteControl.pushButton2();

    // Desfazendo os comandos
    System.out.println();
    remoteControl.pushUndoButton();
    System.out.println();
    remoteControl.pushUndoButton();
  }
}
