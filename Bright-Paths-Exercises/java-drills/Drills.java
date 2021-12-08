import java.util.Scanner;

public class Drills {
    public static void main(String[] args) {
        // Part 1 - Variables and data types
        String firstName = "Anakin";
        String lastName = "Skywalker";
        String birthYear = "41 BBY";
        String homeWorld = "Tatooine";
        double height = 1.88;
        double weight = 264.38;

        // Part 2 - Mathematical Operators
        double purse = 150.0;
        System.out.println("You walk into Mubo’s Droid Depot to buy a droid. The cost is 24.3.");
        purse -= 24.3;
        System.out.println("Next, you walk into Dok-Ondar’s Den of Antiquities. You purchase a very fine set of boots that cost you a flat 45 credits.");
        purse -= 45;
        System.out.println("As you move around in the Black Spire Outpost you hear some noise down an alley. A group of Jedi are playing dice. You play a few rounds and double the credits in your purse.");
        purse *= 2;
        System.out.println("With your purse bursting at the seams you walk into Savi’s Lightsabers. You inquire about a rare lightsaber, and the cashier says he will give it to you for one tenth of all the credits in your pocket.");
        purse -= (purse*0.1);
        System.out.println("I have " + purse + " credits left.");

        // Part 3 - Conditional Love
        Scanner input = new Scanner(System.in);
        String handleColor, bladeColor;
        System.out.println("Enter lightsaber handle color:");
        handleColor = input.nextLine();
        System.out.println("Enter lightsaber blade color:");
        bladeColor = input.nextLine();
        if(handleColor.equals("black") && bladeColor.equals("purple")){
            System.out.println("This one's mine!");
        } else {
            System.out.println("Pass");
        }

        String shipName;
        System.out.println("Enter ship name:");
        shipName = input.nextLine();
        if(shipName.equals("Mellenium Falcon")){
            System.out.println("let's go");
        } else{
            System.out.println("I better hide somewhere.");
        }

        double itemPrice;
        boolean recommend;
        System.out.println("How much for that meal?");
        itemPrice = Double.parseDouble(input.nextLine());
        System.out.println("Do you recommend it?(true = yes, false = no");
        recommend = Boolean.parseBoolean(input.nextLine());
        if(itemPrice < 5 && recommend){
            System.out.println("I'll give it a shot");
        } else {
            System.out.println("I think I'll pass on that one chief");
        }

        double drinkPrice, oz;
        System.out.println("How much for the drink?");
        drinkPrice = Double.parseDouble(input.nextLine());
        System.out.println("Alright..how many ounces is the drink?");
        oz = Double.parseDouble(input.nextLine());
        if(drinkPrice < 1 || oz > 24) {
            System.out.println("Sweet, I'll take it");
        } else {
            System.out.println("Eh, I won't get a drink");
        }
    }


}
