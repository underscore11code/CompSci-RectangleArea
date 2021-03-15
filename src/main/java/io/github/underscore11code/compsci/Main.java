package io.github.underscore11code.compsci;

/*
* E--- D---
* March 15, 2021
* RectangleArea
* Prints the area of a rectangle, or give the user an error, depending on what they enter.
*/

import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    int width = setOrExit("width");
    int height = setOrExit("height");

    System.out.println("Area of the rectangle: " + width * height);
  }

  private static int setOrExit(String request) {
    System.out.print("Enter the " + request + ": ");
    int tmp = scanner.nextInt();
    if (tmp < 0) {
      System.out.println("Invalid Input.");
      System.exit(1); // Non-zero exit status indicates there was an error.
    }
    return tmp;
  }
}

/*
* I'm using a simple method in mine to accomplish this in a more tidy way.
* If I was to do the assignment using nested if blocks, it'd look similar to the following:
*
* int width = next input
* if width >= 0
*   int height = next input
*   if height >= 0
*     print height * width
*   else
*     print "invalid input"
* else
*   print "invalid input"
*/
