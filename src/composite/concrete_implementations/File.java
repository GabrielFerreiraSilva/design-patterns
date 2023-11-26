package src.composite.concrete_implementations;

import src.composite.abstract_component.FileSystemComponent;

// This class represents a leaf in the tree structure
public class File extends FileSystemComponent {
  private int size;

  public File(String name, int size) {
    super(name);
    this.size = size;
  }

  @Override
  public void showInfo() {
    System.out.println(
        "File: "
            + this.name
            + " | Size: "
            + this.size
            + " bytes | Permissions: "
            + this.permissions);
  }

  @Override
  public int getSize() {
    return this.size;
  }
}
