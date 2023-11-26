package src.composite.concrete_implementations;

import src.composite.abstract_component.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

// This class represents a node in the tree structure
public class Directory extends FileSystemComponent {
  private List<FileSystemComponent> components;

  public Directory(String name) {
    super(name);
    this.components = new ArrayList<>();
  }

  public void addComponent(FileSystemComponent component) {
    components.add(component);
  }

  public void removeComponent(FileSystemComponent component) {
    components.remove(component);
  }

  @Override
  public void showInfo() {
    System.out.println("Directory: " + this.name + " | Permissions: " + this.permissions);
    System.out.println("Contents");

    for (FileSystemComponent component : components) {
      component.showInfo();
    }
  }

  @Override
  public int getSize() {
    int totalSize = 0;
    for (FileSystemComponent component : components) {
      totalSize += component.getSize();
    }
    return totalSize;
  }
}
