package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
  private final String name;
  private final List<FileSystemComponent> children;

  public Directory(String name) {
    this.name = name;
    this.children = new ArrayList<>();
  }

  @Override
  public void printDescription() {
    System.out.println("Directory: " + this.name);
    System.out.println("------");
    for (FileSystemComponent component : children) {
      component.printDescription();
    }
    System.out.println("------");
  }

  @Override
  public void addComponent(FileSystemComponent component) {
    this.children.add(component);
  }

  @Override
  public void removeComponent(FileSystemComponent component) {
    this.children.remove(component);
  }

  @Override
  public FileSystemComponent getChildComponent(int index) {
    return this.children.get(index);
  }
}
