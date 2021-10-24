package com.tw;

public class MultiplicationTable {
  public String create(int start, int end) {
    return isValid(start, end)
      ? generateTable(start, end)
      : null;
  }

  public Boolean isValid(int start, int end) {
    return
      isInRange(start) &&
      isInRange(end) &&
      isStartNotBiggerThanEnd(start, end);
  }

  public Boolean isInRange(int number) {
    return number >= 1 && number <= 1000;
  }

  public Boolean isStartNotBiggerThanEnd(int start, int end) {
    return start <= end;
  }

  public String generateTable(int start, int end) {
    StringBuilder table = new StringBuilder();

    for (int i = start; i <= end; i++)
      table.append(generateLine(start, i)).append("\n");

    return table.toString().trim();
  }

  public String generateLine(int start, int row) {
    StringBuilder line = new StringBuilder();

    for (int i = start; i <= row; i++)
      line.append(generateSingleExpression(i, row)).append("  ");

    return line.toString().trim();
  }

  public String generateSingleExpression(int multiplicand, int multiplier) {
    return String.format(
      "%d*%d=%d", multiplicand, multiplier, multiplicand * multiplier
    );
  }
}
