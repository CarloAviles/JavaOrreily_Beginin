import java.util.ArrayList;
import java.util.Scanner;
public class Proj5_1_NamePermutations {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> namesArray = new ArrayList<>();
        ArrayList<String> lastnamesArray = new ArrayList<>();

        int size, spacePosition;
        StringBuilder sb;

        System.out.println("Need 5 full names");
        for(int i=0; i<5; i++){
            System.out.println("Give me name: ");
            sb = new StringBuilder(keyboard.nextLine());
            spacePosition = sb.indexOf(" ");
            size = sb.length();

            namesArray.add(sb.substring(0, spacePosition));
            lastnamesArray.add(sb.substring(spacePosition+1,size));
        }
        System.out.println("The different names permutations are: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.println(namesArray.get(i) + " " + lastnamesArray.get(j));
            }
        }




    }
}
