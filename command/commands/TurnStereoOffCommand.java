package command.commands;

import command.receivers.Stereo;

public class TurnStereoOffCommand implements Command {
  private final Stereo stereo;

  public TurnStereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    if (this.stereo.isCdInside()) {
      this.stereo.setVolume(0);
      this.stereo.pause();
    }
    this.stereo.off();
  }

  @Override
  public void undo() {
    this.stereo.on();
    if (this.stereo.isCdInside()) {
      this.stereo.play();
      this.stereo.setVolume(10);
    }
  }
}
