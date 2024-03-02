package command.receivers;

public class Stereo {
  private int volume;
  private boolean isCdInside;

  public Stereo() {
    volume = 0;
    isCdInside = true;
  }

  public void on() {
    System.out.println("The stereo is on");
  }

  public void off() {
    System.out.println("The stereo is off");
  }

  public void insertCd() {
    if (!isCdInside) {
      isCdInside = true;
      System.out.println("CD inserted");
    } else {
      System.out.println("There is a CD already inside");
    }
  }

  public void removeCd() {
    if (isCdInside) {
      isCdInside = false;
      System.out.println("CD removed");
    } else {
      System.out.println("There is no CD inside");
    }
  }

  public void setVolume(int volume) {
    this.volume = volume;
    System.out.println("Volume: " + this.volume);
  }

  public boolean isCdInside() {
    return this.isCdInside;
  }

  public void play() {
    System.out.println("The music is playing");
  }

  public void pause() {
    System.out.println("The music is paused");
  }
}
