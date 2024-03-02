package command.commands;

import command.receivers.Stereo;

public class TurnStereoOnCommand implements Command {
  private final Stereo stereo;

  public TurnStereoOnCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    this.stereo.on();
    if (this.stereo.isCdInside()) {
      this.stereo.play();
      this.stereo.setVolume(10);
    }
  }

  @Override
  public void undo() {
    if (this.stereo.isCdInside()) {
      this.stereo.setVolume(0);
      this.stereo.pause();
    }
    this.stereo.off();
  }
}
