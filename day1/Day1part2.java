import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day1part2 {
  public static void main(String[] args) {
    try {
      File file = new File("Day1test.txt");
      Scanner input = new Scanner(file);
      ArrayList<Integer> sums = new ArrayList<Integer>();
      int linesSum = 0;
      while (input.hasNextLine()) {
        String stringnum = input.nextLine();
        if (!stringnum.equals("")) {
          int x = Integer.parseInt(stringnum);
          linesSum+=x;
        } else {
          sums.add(linesSum);
          linesSum = 0;
        }
      }
      System.out.println(sums);
      int greatest = 0;
      int secondgreatest = 0;
      int thirdgreatest = 0;
      for (int i = 0;i<sums.size();i++) {
        if (sums.get(i)>greatest) {
          greatest = sums.get(i);
        }
      }
      for (int i = 0;i<sums.size();i++) {
        if (sums.get(i)==greatest) {
          sums.remove(i);
        }
      }
      for (int i = 0;i<sums.size();i++) {
        if (sums.get(i)>secondgreatest) {
          secondgreatest = sums.get(i);
        }
      }
      for (int i = 0;i<sums.size();i++) {
        if (sums.get(i)==secondgreatest) {
          sums.remove(i);
        }
      }
      for (int i = 0;i<sums.size();i++) {
        if (sums.get(i)>thirdgreatest) {
          thirdgreatest = sums.get(i);
        }
      }
      System.out.println(greatest+secondgreatest+thirdgreatest);
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
