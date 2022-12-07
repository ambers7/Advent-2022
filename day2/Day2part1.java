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
      ArrayList<String> opp = new ArrayList<String>();
      ArrayList<String> you = new ArrayList<String>();
      while (input.hasNext()) {
        opp.add(input.next());
        you.add(input.next());
      }
      int score = 0;
      for (int i = 0;i<opp.size();i++) {
        //add score for shape you selected
        if (you.get(i).equals("X")) { //rock
          score+=1;
        } else if (you.get(i).equals("Y")) { //paper
          score+=2;
        } else { //scissors
          score+=3;
        }
        //win lose points
        //A,X: rock, B,Y: paper, C,Z: scissors
        if (opp.get(i).equals("A")) { //rock
          if (you.get(i).equals("Y")) { //paper
            score+=6;
          } else if (you.get(i).equals("X")) {//draw
            score+=3;
          }
        }
        if (opp.get(i).equals("B")) { //paper
          if (you.get(i).equals("Z")) { //scissors
            score+=6;
          } else if (you.get(i).equals("Y")) {//draw
            score+=3;
          }
        }
        if (opp.get(i).equals("C")) { //scissors
          if (you.get(i).equals("X")) { //rock
            score+=6;
          } else if (you.get(i).equals("Z")) {//draw
            score+=3;
          }
        }
      }
      System.out.println(score);
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("file not found");
    }
  }
}
