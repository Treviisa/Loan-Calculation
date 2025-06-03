// Write code for Loan Payment Calculation in Java with user input and if...loop statements.
import java.util.Scanner;

public class Month_Select {
    public static void main(String[] args){
        int i;

        Scanner myObj = new Scanner(System.in);
        System.out.println("What months you want to see? 15 or 12");

        int time = myObj.nextInt();
        if (time == 15){
            for (i = 1; i <=time; i++){
                System.out.println("Month " + i);
            }
        } else if (time == 12){
            for (i = 1; i <=time; i++){
                System.out.println("Month " + i);
            }
        } else {
            System.out.println("Invalid input");

        }
    }
}
