package command.invokers;

import command.commands.Command;
import command.commands.NoCommand;

import java.util.Stack;

public class RemoteControl {
  private final Command[] commands;
  private final Stack<Command> previousCommands;

  public RemoteControl() {
    this.commands = new Command[4];
    this.previousCommands = new Stack<>();

    for (int i = 0; i < 4; i++) {
      this.commands[i] = new NoCommand();
    }
  }

  public void setCommand(int button, Command command) {
    this.commands[button - 1] = command;
  }

  public void pushButton1() {
    System.out.println("Button 1 pushed");
    this.commands[0].execute();
    this.previousCommands.push(this.commands[0]);
  }

  public void pushButton2() {
    System.out.println("Button 2 pushed");
    this.commands[1].execute();
    this.previousCommands.push(this.commands[1]);
  }

  public void pushButton3() {
    System.out.println("Button 3 pushed");
    this.commands[2].execute();
    this.previousCommands.push(this.commands[2]);
  }

  public void pushButton4() {
    System.out.println("Button 4 pushed");
    this.commands[3].execute();
    this.previousCommands.push(this.commands[3]);
  }

  public void pushUndoButton() {
    System.out.println("Undo button pushed");
    this.previousCommands.pop().undo();
  }
}
