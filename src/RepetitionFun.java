public class RepetitionFun {
    public static void main(String[] args){
        int count = 0;

        while (count < 10){
            System.out.println(count);
            count++;
        }

        do{
            System.out.println(count);
            count++;
        }while(count<11);

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
