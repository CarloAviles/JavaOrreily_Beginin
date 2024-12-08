import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        int num;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Give a number: ");
        num = keyboard.nextInt();
        keyboard.nextLine();

        num *= 2;

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("age is " + age);
        System.out.println("The result of multiplication is: " + num );
        System.out.println("City is " + city);

    }
}
