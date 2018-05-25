package pl.coderstrust.accounting.model;

import static org.junit.Assert.assertEquals;
import static pl.coderstrust.accounting.model.TestInvoiceProvider.invoiceOne;
import static pl.coderstrust.accounting.model.TestInvoiceProvider.invoiceTwo;

import org.junit.Test;

import java.time.LocalDate;

public class InvoiceTest {

  @Test
  public void shouldGetIssueDate() {
    //given
    Invoice invoiceTwo = invoiceTwo();
    LocalDate expected = LocalDate.of(2018, 2, 2);

    //when
    LocalDate actual = invoiceTwo.getIssueDate();

    //then
    assertEquals(expected, actual);
  }

  @Test
  public void shouldReturnId() {
    //given
    Invoice invoiceOne = invoiceOne();
    Long idExpected = 1L;
    invoiceOne.setId(idExpected);

    //when
    Long idActual = invoiceOne.getId();

    //then
    assertEquals(idExpected, idActual);
  }

  @Test
  public void shouldReturnBuyersAddress() {
    //given
    Invoice invoiceTwo = invoiceTwo();
    String expected = "Graniczna 14, 05-500 Piaseczno";

    //when
    String actual = invoiceTwo.getBuyer().getAddress();

    //then
    assertEquals(expected, actual);
  }

  @Test
  public void shouldChangeSellersCompanyData() {
    //given
    Invoice invoiceTwo = invoiceTwo();
    Company expected = new Company("Alpha", "Powsińska 33, 02-333 Warszawa", 4223322000L);
    invoiceTwo.setSeller(expected);

    //when
    Company actual = invoiceTwo.getSeller();

    //then
    assertEquals(expected, actual);
  }
}