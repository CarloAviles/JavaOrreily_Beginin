import java.util.Scanner;
public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        int[] intArray;
        intArray = new int[5];
        int count = 0;

        while (count<intArray.length){
            System.out.println("Enter a digit: ");
            intArray[count] = keyboard.nextInt();
            count++;
        }
        count=0;
        System.out.println("The result of multiply every value for 2 is:");
        while (count<intArray.length){
            System.out.println(intArray[count]*2);
            count++;
        }



    }


}
