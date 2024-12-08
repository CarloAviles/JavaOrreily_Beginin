import java.util.Scanner;
public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pack, totalCourses = 0, cost = 0;

        System.out.println("Wich package do you wish? \n 1.-Package 1: $10/month, includes 2 courses per month \nEach aditional course is $6" +
                "2.-Package 2: $12/month, includes 4 courses per month \nEach aditional course is $4" +
                "3.-Package 3: $15/month, includes 6 courses per month \nEach aditional course is $3");
        pack = keyboard.nextInt();

        System.out.println("How many courses do you took");
        totalCourses =  keyboard.nextInt();

        if(pack == 1){
            if(totalCourses<=2)
            {
                cost=10;
            }else {
                totalCourses = totalCourses - 2;
                cost= 10+(totalCourses*6);
            }
        } else if (pack == 2) {
            if(totalCourses<=4)
            {
                cost=12;
            }else {
                totalCourses = totalCourses - 4;
                cost= 12+(totalCourses*4);
            }
        } else {
            if(totalCourses<=6)
            {
                cost=15;
            }else {
                totalCourses = totalCourses - 6;
                cost= 15+(totalCourses*3);
            }
        }
        System.out.println("Total cost is: " + cost);


    }
}
