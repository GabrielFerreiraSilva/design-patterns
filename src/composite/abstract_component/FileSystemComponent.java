package src.composite.abstract_component;

public abstract class FileSystemComponent {
  // This abstract class must be extended by either leaf and composite components
  protected String name;
  protected String permissions;

  protected FileSystemComponent(String name) {
    this.name = name;
  }

  public abstract void showInfo();

  public abstract int getSize();

  public void setPermissions(String permissions) {
    this.permissions = permissions;
  }

  public void addComponent(FileSystemComponent component) {
    throw new UnsupportedOperationException();
  }

  public void removeComponent(FileSystemComponent component) {
    throw new UnsupportedOperationException();
  }
}
