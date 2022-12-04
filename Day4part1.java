import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day4part1 {
  public static void main(String[] args) {
    try {
      File file = new File("Day4test.txt");
      Scanner input = new Scanner(file);
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
