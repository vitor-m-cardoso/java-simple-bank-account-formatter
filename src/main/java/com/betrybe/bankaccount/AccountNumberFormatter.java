package com.betrybe.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public static String formatAccountNumber(int literalAccountNumber) {
    String stringAccountNumber = String.valueOf(Math.abs(literalAccountNumber));

    if (stringAccountNumber.length() < 6) {
      return StringUtils.leftPad(stringAccountNumber, 6, "000");
    } else if (stringAccountNumber.length() > 6) {
      return StringUtils.right(stringAccountNumber, 6);
    }
    return stringAccountNumber;
  }
}