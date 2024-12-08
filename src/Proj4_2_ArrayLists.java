import java.util.Scanner;
import java.util.ArrayList;
public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> realNumbers = new ArrayList<>();
        double number = 0.0;
        while (number >= 0){
            System.out.println("Enter a number: ");
            number = keyboard.nextDouble();
            if(number >= 0){
                realNumbers.add(number);
            }
        }
        for(int i=realNumbers.size() - 1 ; i==0;i--){
            System.out.println(realNumbers.get(i));
        }



    }
}
