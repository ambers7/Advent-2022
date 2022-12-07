import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
public class Day2part2 {
  public static void main(String[] args) {
    try {
      File file = new File("Day2test.txt");
      Scanner input = new Scanner(file);
      ArrayList<String> opp = new ArrayList<String>();
      ArrayList<String> winlosedraw = new ArrayList<String>();
      while (input.hasNext()) {
        opp.add(input.next());
        winlosedraw.add(input.next());
      }
      int score = 0;
      for (int i = 0;i<opp.size();i++) {
        /*find out what shape you need to win,
        add the points for that shape, add the points
        for lose/draw/win (X/Y/Z)*/
        //win lose draw points
        if (winlosedraw.get(i).equals("Y")) { //draw
          score+=3;
        } else if (winlosedraw.get(i).equals("Z")) { //win
          score+=6;
        }
        //shape points
        //A,X: rock, B,Y: paper, C,Z: scissors
        if (opp.get(i).equals("A")) { //rock
          if (winlosedraw.get(i).equals("Y")) { //draw
            //rock so add 1
            score+=1;
          } else if (winlosedraw.get(i).equals("X")) { //lose
            //scissors so add 3
            score+=3;
          } else { //win
            //paper so add 2
            score+=2;
          }
        }
        if (opp.get(i).equals("B")) { //paper
          if (winlosedraw.get(i).equals("Y")) { //draw
            //paper so add 2
            score+=2;
          } else if (winlosedraw.get(i).equals("X")) {//lose
            //rock so add 1
            score+=1;
          } else { //win
            //scissors so add 3
            score+=3;
          }
        }
        if (opp.get(i).equals("C")) { //scissors
          if (winlosedraw.get(i).equals("Y")) { //draw
            //scissors so add 3
            score+=3;
          } else if (winlosedraw.get(i).equals("X")) {//lose
            //paper so add 2
            score+=2;
          } else { //win
            //rock so add 1
            score+=1;
          }
        }
      }
      System.out.println(score);
      input.close();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
  }
}
