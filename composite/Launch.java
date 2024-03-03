package composite;

import composite.classes.Directory;
import composite.classes.File;
import composite.classes.FileSystemComponent;

public class Launch {
  public static void main(String[] args) {
    // Criando arquivos
    FileSystemComponent file1 = new File("file1.txt");
    FileSystemComponent file2 = new File("file2.txt");
    FileSystemComponent file3 = new File("file3.txt");

    // Criando diretórios
    FileSystemComponent root = new Directory("Root");
    FileSystemComponent dir1 = new Directory("Dir1");
    FileSystemComponent dir2 = new Directory("Dir2");

    // Formando a estrutura
    root.addComponent(file1);
    root.addComponent(dir1);
    root.addComponent(file2);
    dir1.addComponent(file3);
    root.addComponent(dir2);

    // Executando a operação
    root.printDescription();
  }
}
