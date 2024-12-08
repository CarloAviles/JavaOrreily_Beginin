import java.util.Scanner;
public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number to verify if is divisible by three: ");
        int number = keyboard.nextInt();

        if(number%3==0){
            System.out.printf("The number %d is divisible by Three",number);
        }else {
            System.out.printf("The number %d is not divisible by Three",number);
        }
    }
}
