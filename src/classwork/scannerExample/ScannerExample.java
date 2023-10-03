package classwork.scannerExample;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter a first number");
//    int number = Integer.parseInt(scanner.nextLine());
//    System.out.println("Enter a second number");
//    int number1 = Integer.parseInt(scanner.nextLine());
//    System.out.println("Please choose one of 2 operators + or -");
//    String operator = scanner.nextLine();
//    String result;
//
//    if (operator.equals("+")) {
//      System.out.println(STR."The result is \{number + number1}");
//    } else if (operator.equals("-")) {
//      System.out.println(STR."The result is \{number - number1}");
//    }

    System.out.println("Please enter a number");
    String numberStr = scanner.nextLine();
    String[] numberArrayStr = numberStr.split(",");
    int[] numbers = new int[numberArrayStr.length];
    int index = 0;

    for (String string : numberArrayStr) {
      numbers[index++] = Integer.parseInt(string);
    }

    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }

    System.out.println(STR."The maximum result is \{max}");

  }
}
