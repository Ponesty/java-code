import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
        System.out.println("Welcome to the Mars Adventure Game!");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + "! \nHope you're ready to go to Mars!");

        System.out.println("What color is your space suit?");
        String suitColor = input.nextLine();
        System.out.println("Alrighty, " + suitColor + " is a nice suit color. \nNow how many days would you like the adventure to be?");
        String days = input.nextLine();
        System.out.println(days + " days...We can make that work! \nSo as for snacks, what is your favorite?");
        String snack = input.nextLine();

        System.out.println("Yummy! We will add as much " + snack + " as the ship can carry! \nSpeaking of ships, how big would you like the ship to be? Small, medium, or large?");
        String size = input.nextLine();

        System.out.println("Gotcha We'll pack all of you belongings in the " + size + " ship. \nLooks like we have everything. Let the adventure begin!");
    }
}
