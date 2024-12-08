import java.util.ArrayList;
public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL =  new ArrayList<>();

        myAL.add(new Integer(10));
        myAL.add(new Integer(20));
        myAL.add(30);

        for(int i = 0; i < myAL.size(); i++){
            System.out.println(myAL.get(i));
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;

        System.out.println(numericValue);

        String pi = "3.1416";
        double pidouble =  Double.parseDouble(pi);

        System.out.println(pidouble);
        pidouble+=3.1;
        System.out.println(pidouble);

    }
}
