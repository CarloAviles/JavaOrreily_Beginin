import java.util.Random;
public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int dice=0;

        for(int i=0; i<10; i++){
            dice = random.nextInt(1, 6);
            System.out.println(dice);
        }

    }
}
