package com.betrybe.bankaccount;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

/**
 * A class.
 */
public class Application {
  /**
   * A simple get method.
   */
  public static void main(String[] args) {

    Scanner scanMenu = new Scanner(System.in);
    System.out.println("Boas vindas ao seu Banco Digital.");
    System.out.println("Informe o número da conta:");
    String clientAccount = scanMenu.next();

    if (!StringUtils.isNumeric(clientAccount)) {
      System.out.println("Número da conta inválido!");
    } else {
      int literalAccountNumber = Integer.parseInt(clientAccount);
      String formattedAccount = AccountNumberFormatter.formatAccountNumber(literalAccountNumber);
      System.out.println("Número da conta: " + formattedAccount);
    }

    scanMenu.close();
  }

}
