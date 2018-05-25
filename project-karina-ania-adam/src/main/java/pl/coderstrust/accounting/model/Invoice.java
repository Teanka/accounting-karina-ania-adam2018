package pl.coderstrust.accounting.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * Created by Adam on 2018-04-16.
 */
public class Invoice {

  private Long id;
  private String identifier;
  private LocalDate issueDate;
  private Company buyer;
  private Company seller;
  private List<InvoiceEntry> entries;

  public Invoice(Long id, String identifier, LocalDate issueDate,
      Company buyer, Company seller,
      List<InvoiceEntry> entries) {
    this.id = id;
    this.identifier = identifier;
    this.issueDate = issueDate;
    this.buyer = buyer;
    this.seller = seller;
    this.entries = entries;
  }

  // needed for json serialization
  public Invoice() {
  }

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public Company getBuyer() {
    return buyer;
  }

  public void setBuyer(Company buyer) {
    this.buyer = buyer;
  }

  public Company getSeller() {
    return seller;
  }

  public void setSeller(Company seller) {
    this.seller = seller;
  }

  public List<InvoiceEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<InvoiceEntry> entries) {
    this.entries = entries;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Invoice)) {
      return false;
    }
    Invoice invoice = (Invoice) obj;
    return Objects.equals(id, invoice.id)
        && Objects.equals(identifier, invoice.identifier)
        && Objects.equals(issueDate, invoice.issueDate)
        && Objects.equals(buyer, invoice.buyer)
        && Objects.equals(seller, invoice.seller)
        && Objects.equals(entries, invoice.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifier, issueDate, buyer, seller, entries);
  }
}
