public class LogicalFun {
    public static void main (String[] args){
        boolean isRaining = true;
        boolean isWarm = false;

        boolean combined =  isRaining && isWarm;

        System.out.println("Is raining and warm?: " + combined);

        combined = isRaining || isWarm;

        System.out.println("Is it raining or Warm=: " + combined);

        combined =  !isRaining;

        System.out.println("Is not raining outside?: " + combined);

        }
}
