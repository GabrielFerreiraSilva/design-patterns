package template_method.classes;

public class CurriculumProcessor extends DocumentProcessor {
  @Override
  protected void validateDocument() {
    System.out.println("Validating curriculum");
  }

  @Override
  protected void extractContent() {
    System.out.println("Extracting curriculum's content");
  }
}
