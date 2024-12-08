import java.util.Scanner;
import java.util.Random;
public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int number_random = random.nextInt(1,101);
        int tries=0, number=0;
        
        do {
            System.out.println("Enter your integer guess between 1 and 100, inclusive");
            number = keyboard.nextInt();

            if((number>100) || (number<0)){
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive");
                tries++;
            }else if(number<number_random){
                System.out.println("Your guess was too low");
                tries++;
            } else if (number>number_random) {
                System.out.println("Your guess was too high");
                tries++;
            }
        }while (number!=number_random);
        tries++;
        System.out.printf("Congratulations! You guessed the number in %d guesses! Thanks for playing",tries);
    }
}
