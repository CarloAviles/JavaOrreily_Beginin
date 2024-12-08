import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3, average;

        System.out.println("Give three real number");
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        num3 = keyboard.nextDouble();

        average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average of these numbers is: " + average);
    }
}
