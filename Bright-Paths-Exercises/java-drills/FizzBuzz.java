// Part 4 - FizzBuzz Deep Dive

public class FizzBuzz { // Creating the class called FizzBuzz
    public static void main(String[] args) { //creating the main function.
        System.out.println("Using if's:");
        fizzBuzz100();  //calling the fizzBuzz100 function

        System.out.println("\nUsing switch:");
        fizzBuzz100Switch();
    }

    private static void fizzBuzz100() { // Creating a private function called fizzBuzz100 function
        for (int i = 1; i <= 100; i++) { //creating for loop from 1 to 100
            if ((i % 3) == 0) //if i modular 3 equals 0 is true run what is in this if statement
                System.out.println("fizz"); // prints out fizz
            else if ((i % 5) == 0) // if i modular 5 equals 0 is true run what is in the else if statement
                System.out.println("buzz"); // prints out buzz
            else if (((i % 5) == 0) && ((i % 3) == 0)) // if i modular 5 and i modular 3 both equal 0 run what is in else if
                System.out.println("fizzbuzz"); // prints out fizzbuzz
            else // if all if's and else if statements above return false, run what is in this else.
                System.out.println(i); //prints out i
        }
    } // The bug is that fizzbuzz is never printed even though some numbers make the condition true. I would recommend swapping the first if statement expression with the else if statement expression printing out fizzbuzz.

    private static void fizzBuzz100Switch() {
        for (int i = 1; i <= 100; i++) {
            switch(i%3) {
                case 0:
                    switch(i%5){
                        case 0:
                            System.out.println("fizzbuzz");
                            break;
                        default:
                            System.out.println("fizz");
                            break;
                    }
                    break;
                default:
                    switch(i%5){
                        case 0:
                            System.out.println("buzz");
                            break;
                        default:
                            System.out.println(i);
                            break;
                    }
                    break;
            }
        }

    }
    }
