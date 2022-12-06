import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day5part2 {
  public static void main(String[] args) {
    try {
      ArrayList<ArrayList<String>> crates = new ArrayList<ArrayList<String>>();
      crates.add(new ArrayList<String>(Arrays.asList("N","W","B")));
      crates.add(new ArrayList<String>(Arrays.asList("B","M","D","T","P","S","Z","L")));
      crates.add(new ArrayList<String>(Arrays.asList("R","W","Z","H","Q")));
      crates.add(new ArrayList<String>(Arrays.asList("R","Z","J","V","D","W")));
      crates.add(new ArrayList<String>(Arrays.asList("B","M","H","S")));
      crates.add(new ArrayList<String>(Arrays.asList("B","P","V","H","J","N","G","L")));
      crates.add(new ArrayList<String>(Arrays.asList("S","L","D","H","F","Z","Q","J")));
      crates.add(new ArrayList<String>(Arrays.asList("B","Q","G","J","F","S","W")));
      crates.add(new ArrayList<String>(Arrays.asList("J","D","C","S","M","W","Z")));
      File file = new File("Day5test.txt");
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        String line = input.nextLine();
        String[] words = line.split(" ");
        int howmany = Integer.parseInt(words[1]);
        int first = Integer.parseInt(words[3]);
        int second = Integer.parseInt(words[5]);
        for (int i = 0;i<howmany;i++) {
          //add value to second, remove value from first
          String value = crates.get(first-1).get(i);
          crates.get(second-1).add(i,value);
        }
        for (int i = 0;i<howmany;i++) {
          crates.get(first-1).remove(0);
        }
        System.out.println(crates);
      }
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
