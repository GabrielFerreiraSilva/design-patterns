package composite;

public interface FileSystemComponent {
  void printDescription();

  void addComponent(FileSystemComponent component);

  void removeComponent(FileSystemComponent component);

  FileSystemComponent getChildComponent(int index);
}
