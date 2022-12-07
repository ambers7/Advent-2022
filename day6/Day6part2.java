import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day6part2 {
  public static void main(String[] args) {
    try {
      File file = new File("Day6test.txt");
      Scanner input = new Scanner(file);
      String text = "";
      while (input.hasNext()) {
        text+=input.nextLine();
      }
      int index = 0;
      ArrayList<String> fourchar = new ArrayList<String>();
      //add first fourteen characters
      for (int j=0;j<14;j++) {
        fourchar.add(""+text.charAt(j));
      }
      System.out.println(fourchar);
      System.out.println(noRepeat(fourchar));
      for (int i = 0;i<text.length();i++) {
        if (noRepeat(fourchar)) {
          index = i;
          System.out.println("no repeat, index: "+index+"i: "+i);
          break;
        } else {
          if (i+4<text.length()) {
            fourchar.remove(0);
            fourchar.add(""+text.charAt(i+14));
            System.out.println(fourchar+"I: "+i);
          }
        }
      }
      System.out.println(index+14); //since need to add the 3 more chars to the end of the array and an extra since the very first character isnt counted
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
  //see if in arraylist of size 4 any characters repeat
  //if no repeats then true, if repeats then false
  public static boolean noRepeat(ArrayList<String> list) {
    boolean tf = true;
    for (int i = 0;i<14;i++) {
      for (int j = i+1;j<14;j++) {
        if (list.get(i).equals(list.get(j))) {
          tf = false;
        }
      }
    }
    return tf;
  }
}
