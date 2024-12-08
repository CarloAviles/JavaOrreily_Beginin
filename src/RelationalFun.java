public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 38;

        String myName = "John";
        String yourName = "John";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison );

        ageComparison = yourAge == bobsAge ;
        System.out.println("yourAge == bobsAge?: " + ageComparison);


        boolean nameComparison = myName.equals(yourName);
        System.out.println("does names match?: " + nameComparison );

        boolean currentAgeComparison = currentAge >= 21;
        System.out.println("CurrentAge is greater or equal to 21?: " + currentAgeComparison);

    }
}
