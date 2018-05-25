package pl.coderstrust.accounting.database.impl.file;

import pl.coderstrust.accounting.database.Database;
import pl.coderstrust.accounting.model.Invoice;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    FileHelper fileHelper = new FileHelper();
    JsonHelper jsonHelper = new JsonHelper();
    Configuration configuration = new Configuration();
    Invoice obj00 = new TestInvoiceProvider().invoiceOne();
    Invoice obj01 = new TestInvoiceProvider().invoiceTwo();
    Invoice obj02 = new TestInvoiceProvider().invoiceThree();
    Database db = new InFileDatabase(fileHelper, jsonHelper, configuration);
    db.getInvoices();
    db.saveInvoice(obj02);
    List<Invoice> invoicesExamples = Arrays.asList(obj00, obj01, obj02);
    db.saveInvoices(invoicesExamples);
    db.getInvoiceById(2L);
    db.getInvoices();
    db.removeInvoiceById(2L);
    db.updateInvoice(obj00);
  }
}

