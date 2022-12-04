import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day4part2 {
  public static void main(String[] args) {
    try {
      File file = new File("Day4test.txt");
      Scanner input = new Scanner(file);
      int rangepair = 0;
      while (input.hasNext()) {
        String line = input.nextLine();
        String[] onetwo = line.split(",");
        String one = onetwo[0];
        String two = onetwo[1];
        String[] onesplit = one.split("-");
        String[] twosplit = two.split("-");
        int onestart = Integer.parseInt(onesplit[0]);
        int oneend = Integer.parseInt(onesplit[1]);
        int twostart = Integer.parseInt(twosplit[0]);
        int twoend = Integer.parseInt(twosplit[1]);
        //one holds two
        if (onestart<=twostart&&oneend>=twoend) {
          rangepair+=1;
        } else if (twostart<=onestart&&twoend>=oneend) { //two holds one
          rangepair+=1;
        } else if (oneend>=twostart&&onestart<=twoend) {
          rangepair+=1;
        }
      }
      System.out.println(rangepair);
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
