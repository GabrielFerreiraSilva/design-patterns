package composite;

public class File implements FileSystemComponent {
  private final String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void printDescription() {
    System.out.println("File: " + this.name);
  }

  @Override
  public void addComponent(FileSystemComponent component) {
    throw new UnsupportedOperationException("Unsupported operation");
  }

  @Override
  public void removeComponent(FileSystemComponent component) {
    throw new UnsupportedOperationException("Unsupported operation");
  }

  @Override
  public FileSystemComponent getChildComponent(int index) {
    throw new UnsupportedOperationException("Unsupported operation");
  }
}
