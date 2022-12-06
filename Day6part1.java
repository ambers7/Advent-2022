import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day6part1 {
  public static void main(String[] args) {
    try {
      File file = new File("Day6test.txt");
      Scanner input = new Scanner(file);
      String text = "";
      while (input.hasNext()) {
        text+=input.nextLine();
      }
      int count = 0; //add count to index+1 to get marker
      ArrayList<String> fourchar = new ArrayList<String>();
      fourchar.add(""+text.charAt(0));
      fourchar.add(""+text.charAt(1));
      fourchar.add(""+text.charAt(2));
      fourchar.add(""+text.charAt(3));
      for (int i = 0;i<text.length();i++) {
        //compare first one and box it with three, if first one
        //is duplicated somewhere then make a diff box with 2 3 4 5
        //and move past the first one
      }
      System.out.println(fourchar);
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
