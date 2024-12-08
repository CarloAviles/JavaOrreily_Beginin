import java.util.Scanner;
public class SumFun {
    public static void main(String[] args){
        int sum=0, num = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digit a integer");
        num = keyboard.nextInt();

        while (num>=0) {
            sum += num  ;
            System.out.println("Do you want another number to add if not, digit a negative number");
            num = keyboard.nextInt();
        }
        System.out.println("The result is: " + sum);
    }
}
