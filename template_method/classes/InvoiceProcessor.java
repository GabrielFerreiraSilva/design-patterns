package template_method.classes;

public class InvoiceProcessor extends DocumentProcessor {
  @Override
  protected void validateDocument() {
    System.out.println("Validating invoice");
  }

  @Override
  protected void extractContent() {
    System.out.println("Extracting invoice's content");
  }

  @Override
  protected boolean isEncoded() {
    return true;
  }

  @Override
  protected void decode() {
    System.out.println("Decoding invoice");
  }
}
