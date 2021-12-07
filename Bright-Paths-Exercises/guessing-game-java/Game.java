/*

A number-guessing game.

*/
import java.util.Scanner;

public class Game {
  public static void main(String[] args){
    // Put your code here
    int random = (int)Math.floor(Math.random()*(100-1+1)+1);
    int count = 1;
    boolean test = true;
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, what is your name?\n(type in your name)");
    String name = input.nextLine();
    System.out.println(name + ", I'm thinking of a number between 1 and 100.\nTry to guess my number.\nYour guess?");
    while(test){
      try {
        int guess = Integer.parseInt(input.nextLine());
        while (guess != random){
          if(guess < random && guess >= 1){
            System.out.println("Your guess is too low, try again.\nYour guess?");
          }
          else if(guess > random & guess <=100){
            System.out.println("Your guess is too high, try again.\nYour guess?");
          }
          else{
            System.out.println("Bruh, I said a number between 1 & 100. Don't try me!\nYour guess?");
          }
          count++;
          guess = Integer.parseInt(input.nextLine());
        }
        System.out.println("Well done, " + name +"! You found my number in " + count + " tries!");
        test = false;
      } catch (Exception e) {
        System.out.println("Baw, that's not an integer. Stop playin around!\nYour guess");
      }
    }




  }


}
