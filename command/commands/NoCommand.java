package command.commands;

public class NoCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Blank command");
  }

  @Override
  public void undo() {}
}
