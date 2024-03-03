package template_method;

import template_method.classes.CurriculumProcessor;
import template_method.classes.DocumentProcessor;
import template_method.classes.InvoiceProcessor;

public class Launch {
  public static void main(String[] args) {
    DocumentProcessor curriculumProcessor = new CurriculumProcessor();
    DocumentProcessor invoiceProcessor = new InvoiceProcessor();

    curriculumProcessor.processDocument();
    System.out.println();
    invoiceProcessor.processDocument();
  }
}
