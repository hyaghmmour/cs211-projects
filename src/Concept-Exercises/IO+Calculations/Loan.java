import java.time.LocalDateTime;

public class Loan {
    private double annualInterestRate, loanAmount;
    private int numberOfYears;
    private String clientName;
    private LocalDateTime loanDate;




    public Loan(){
        this.loanAmount = 0.0;
        this.annualInterestRate = 0.0;
        this.numberOfYears = 0;
        this.clientName = null;
        this.loanDate = LocalDateTime.now();

    }

    public Loan(double annualInterestRate, double loanAmount, int numberOfYears) {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.loanDate = LocalDateTime.now();
    }

    public Loan(double annualInterestRate, double loanAmount, int numberOfYears, String clientName) {
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.clientName = clientName;
        this.loanDate = LocalDateTime.now();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount*monthlyRate;
        monthlyPayment /= 1- Math.pow(1/(1+monthlyRate), numberOfYears*12);
        return monthlyPayment;
    }

    public double getMonthlyPayment(double annualInterestRate, int numberOfYears, double loanAmount){
        double monthlyRate = annualInterestRate/1200;
        double monthlyPayment = (loanAmount*monthlyRate)/Math.pow((1-(1/(1+monthlyRate))), (numberOfYears*12));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }

}
