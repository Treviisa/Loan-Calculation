// Write code for Loan Payment Calculation in Java with user input.
// Getting user input for amount of balance, number of years.
// Calculate the Monthly interest payment.
// The total interest paid is the sum of the “Interest” column and should be displayed for the customer or product of the monthly payment and number of payments!
// The amount of the monthly payment (rounded to the nearest dollar for convenience and legal requirements) is $387 for this example.
// Calculate the amount of the $387 payment applied to principal and interest
// Divide the interest rate by the number of payments made each year, 0.06/12 = 0.005
// multiply the balance remaining from the previous month by 0.005
// Hence the amount of the payment going to interest the first month is $20,000 * 0.005 = $287.
// Only $100 goes to pay off the principal the first month.  The second month is $19713 * 0.00 5 = $288 interest an $99 to principal.
// using Monthly Payment = ( 0.06/12* principal * Math.pow(1+ 0.06/12 , 60 ) ) /
//( Math.pow(1 + 0.06/12, 60) - 1 )
// Having the values not exceeding past 2 decimal places.
import java.util.Scanner;
import java.lang.Math;

public class calculation {
    public static void main(String[] args){
        int i;  // this is the counter for the loop
        int month;  // this is the number of months from the amount of years the user wants to see.
        int year;   // this is the number of years the user wants to see.
        double balance; // this is the amount of balance the user is telling us.
        double interest_rate;    // this is the interest rate the user is telling us.
        double interest;    // this is the interest that is resulting from balance for each month multiplied by the interest rate divided by the number of payments made each year.
        double principal;   // this is the principal amount that is resulting from the interest rate divided by the number of payments made each year and multiplied by the balance remaining from the previous month.
        double towards_loan;    // this is the result of the principal amount.
        double monthly_payment;// this is the user input for the amount of payment.
        double payment; // this is the amount from monthly payment.
        double new_balance; // this is the new balance after the principal amount is subtracted from the balance.
        double total_interest = 0; // this is the total interest that is the sum of the interest column.
        // double total_towards_loan; // this is the total towards loan that is the sum of the principal column.
        // double total_payment; // this is the total payment that is the sum of the monthly payment and number of payments.

        Scanner myObj = new Scanner(System.in);
        System.out.println("What years you want to see?"); // this is the user input for the number of years.

        // this is the user input for the number of years that will show the number of months.
        year = myObj.nextInt();
        month = year * 12; // this is the number of months from the amount of years the user wants to see.

        System.out.println("What is the amount of balance?"); // this is the user input for the amount of balance.
        balance = myObj.nextDouble();

        System.out.println("What is the interest rate?"); // this is the user input for the interest rate.
        interest_rate = myObj.nextDouble();

        System.out.println("What is the amount of payment?"); // this is the user input for the amount of payment.
        monthly_payment = myObj.nextDouble();
        payment = monthly_payment;

        // this is the math for the calculation to find new balance, principal, towards loan, and interest each month
        // til the Balance and new balance is 0.
        for (i = 1; i <= month; i++){
            principal = (interest_rate / 12) * balance;
            towards_loan = principal;
            interest = payment - towards_loan;
            new_balance = balance - interest;
            // Round the values to the nearest dollar for convenience and legal requirements.
            towards_loan = Math.round(towards_loan);
            interest = Math.round(interest);
            new_balance = Math.round(new_balance);
            total_interest += interest;
            // total_towards_loan += towards_loan;
            // total_payment += payment;
            System.out.println("Month " + i + " Balance:" + balance  + " Interest: " +
                    interest + " Towards Loan: " + towards_loan + " New Balance: " + new_balance);
            balance = new_balance;
        }
        System.out.println("Total Interest: " + total_interest);
    }
}
