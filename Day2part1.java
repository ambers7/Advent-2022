import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day2part1 {
  public static void main(String[] args) {
    try {
      File file = new File("Day2test.txt");
      Scanner input = new Scanner(file);

      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
