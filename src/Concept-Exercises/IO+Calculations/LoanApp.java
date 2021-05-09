import java.time.LocalDateTime;
import java.util.Scanner;

public class LoanApp {
    public static void main(String[] args) {
        Loan loan1 = new Loan();
        loan1.setClientName("John Smith");
        printLoanDetails(loan1.getClientName(), loan1.getLoanDate(), loan1.getMonthlyPayment(), loan1.getTotalPayment());

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPlease enter annual interest rate. i.e., 8.5: ");
        loan1.setAnnualInterestRate(sc.nextDouble());
        System.out.print("Please enter the number of years for the loan: ");
        loan1.setNumberOfYears(sc.nextInt());
        System.out.print("Please enter loan amount: ");
        loan1.setLoanAmount(sc.nextInt());
        System.out.print("Please enter client name: ");
        loan1.setClientName(sc.next());
        printLoanDetails(loan1.getClientName(), loan1.getLoanDate(), loan1.getMonthlyPayment(), loan1.getTotalPayment());
    }

    public static void printLoanDetails(String clientName, LocalDateTime loanDate, double monthlyPayment, double totalPayment){
        System.out.println("\nThe loan for " + clientName + " was created on " + loanDate.toString() + "\nThe monthly payment" +
                "is " + monthlyPayment + "\nThe total payment is " + totalPayment);
    }
}
