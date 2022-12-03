import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day3part1 {
  public static void main(String[] args) {
    try {
      File file = new File("Day3test.txt");
      Scanner input = new Scanner(file);

      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
