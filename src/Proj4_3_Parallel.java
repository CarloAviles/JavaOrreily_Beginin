import java.util.ArrayList;
import java.util.Scanner;
public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> stringsArray = new ArrayList<>();
        ArrayList<Integer> integersArray = new ArrayList<>();
        int register = 0;

        //Asking for the name and age
        while (register<5){
            System.out.print("Enter a name:  ");
            stringsArray.add(keyboard.nextLine());

            System.out.print("Enter an age:  ");
            integersArray.add(keyboard.nextInt());
            keyboard.nextLine();//Consume newLine "residual"

            register++;
        }
        //reset the counter register
        register=0;
        //Printing the data captured
        while (register<5){
            System.out.printf("%s is %d years old \n", stringsArray.get(register), integersArray.get(register));
            register++;
        }


    }
}
