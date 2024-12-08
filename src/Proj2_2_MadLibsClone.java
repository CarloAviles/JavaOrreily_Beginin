import java.util.Scanner;
public class Proj2_2_MadLibsClone {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String adjetive1, girls_name, adjetive2, occuption1, place, clothing, hobby, adjetive3, occupation2, boys_name, mans_name;

        System.out.print("Enter one adjetive: ");
        adjetive1 = keyboard.nextLine();

        System.out.print("Enter a girl name: ");
        girls_name = keyboard.nextLine();

        System.out.println("Enter another adjetive: ");
        adjetive2 = keyboard.nextLine();

        System.out.println("Enter one occuption: ");
        occuption1 = keyboard.nextLine();

        System.out.println("Enter a place: ");
        place = keyboard.nextLine();

        System.out.println("Enter clothing: ");
        clothing = keyboard.nextLine();

        System.out.println("Enter one hobby: ");
        hobby = keyboard.nextLine();

        System.out.println("Enter another adjetive: ");
        adjetive3 = keyboard.nextLine();

        System.out.println("Enter another ocupation: ");
        occupation2 = keyboard.nextLine();

        System.out.println("Enter a boy name: ");
        boys_name = keyboard.nextLine();

        System.out.println("Enter a man name: ");
        mans_name = keyboard.nextLine();

        System.out.printf("There once was a %s girl named %s, who was a %s %s in the kingdom of %s. " +
                "She loved to wear %s and to %s. She wanted to marry the %s %s named %s but her father, " +
                "King %s forbid her from seeing him", adjetive1, girls_name, adjetive2, occuption1,place,
                clothing,hobby,adjetive3,occupation2,boys_name,mans_name);
    }
}
