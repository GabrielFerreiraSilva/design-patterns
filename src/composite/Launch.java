package src.composite;

import src.composite.abstract_component.FileSystemComponent;
import src.composite.concrete_implementations.Directory;
import src.composite.concrete_implementations.File;

public class Launch {
  public static void main(String[] args) {
    // Creating new Files
    FileSystemComponent file1 = new File("file1.txt", 100);
    FileSystemComponent file2 = new File("file2.txt", 150);
    FileSystemComponent file3 = new File("file3.txt", 200);

    // Creating a subdirectory
    FileSystemComponent subDirectory = new Directory("SubDirectory");
    FileSystemComponent file4 = new File("file4.txt", 120);
    FileSystemComponent file5 = new File("file5.txt", 180);
    subDirectory.addComponent(file4);
    subDirectory.addComponent(file5);

    // Creating the root directory
    FileSystemComponent rootDirectory = new Directory("RootDirectory");
    rootDirectory.addComponent(file1);
    rootDirectory.addComponent(file2);
    rootDirectory.addComponent(file3);
    rootDirectory.addComponent(subDirectory);

    // Setting permissions
    file1.setPermissions("read-only");
    file2.setPermissions("read-write");
    file3.setPermissions("read-only");
    file4.setPermissions("read-write");
    file5.setPermissions("read-only");
    subDirectory.setPermissions("read-write");

    // There is a root directory. Inside it there are 3 texts files and a subdirectory that contains
    // two text files inside it
    rootDirectory.showInfo();

    // Calculating total directory size
    int totalSize = rootDirectory.getSize();
    System.out.println("\nTotal Size: " + totalSize + " bytes");
  }
}
