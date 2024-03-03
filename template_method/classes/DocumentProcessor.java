package template_method.classes;

public abstract class DocumentProcessor {
  public final void processDocument() {
    validateDocument();
    extractContent();

    if (isEncoded()) {
      decode();
    }

    analyzeContent();
    postProcess();
  }

  protected abstract void validateDocument();

  protected abstract void extractContent();

  protected void analyzeContent() {
    System.out.println("Analyzing content");
  }

  protected void postProcess() {
    System.out.println("Finishing document processing");
  }

  protected boolean isEncoded() {
    return false;
  }

  protected void decode() {
    System.out.println("Decoding document");
  }
}
