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
      System.out.println(mostCommon("vJrwpWtwJgWr","hcsFMMfFFhFp"));
      System.out.println(mostCommon("jqHRNqRjqzjGDLGL","rsFMfFZSrLrFZsSL"));
      System.out.println(mostCommon("PmmdzqPrV","vPwwTWBwg"));
      while (input.hasNext()) {
        String line = input.nextLine();
      }
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
  private static char mostCommon(String str1, String str2) {
    int[] occurence = new int[52];
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char mostCommon = 'a';
    for (int i = 0;i<str1.length();i++) {
      for (int j = 0;j<str2.length();j++) {
        if (str1.charAt(i)==str2.charAt(j)) {
          mostCommon = str1.charAt(i);
        }
      }
    }
    return mostCommon;
  }
}
