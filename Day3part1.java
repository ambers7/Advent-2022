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
      int prioritysum = 0;
      while (input.hasNext()) {
        String line = input.nextLine();
        int splitindex = line.length()/2;
        String firsthalf = line.substring(0,splitindex);
        String secondhalf = line.substring(splitindex);
        char mostCommon = mostCommon(firsthalf,secondhalf);
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int priority = 0;
        for (int i = 0;i<alphabet.length;i++) {
          if (mostCommon==alphabet[i]) {
            priority = i+1;
          }
        }
        prioritysum+=priority;
      }
      System.out.println(prioritysum);
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
  private static char mostCommon(String str1, String str2) {
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
