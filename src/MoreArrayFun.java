import java.util.Scanner;
public class MoreArrayFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] myArray;
        myArray = new int[10];
        int count = 0;

        while(count <10){
            System.out.printf("Enter a digit for the position %d of the array: ", count);
            myArray[count] = keyboard.nextInt();
            count++;
        }
        count=0;
        while(count <10){
            System.out.println(count+".-"+myArray[count]);
            count++;

        }



    }
}
