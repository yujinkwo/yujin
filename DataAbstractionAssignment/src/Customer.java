import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;
    String type;
    Customer(){
        //create default constructor
        this.name="no name";
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        if (checkDeposit>0) {
            savingRate = 1;
            this.type = CHECKING;
            this.checkBalance = checkDeposit;
        }
        else if (savingDeposit>0) {
            savingRate = 4;
            this.type = SAVING;
            this.savingBalance = savingDeposit;
        }
        this.deposits = new ArrayList(20);
        this.withdraws = new ArrayList(20);
    }

    public double deposit(double amt, Date date, String account){
        //your code here
        if (amt<=0) return 0;
        if (this.type.equals(CHECKING)) {
            this.checkBalance += amt;
        }
        else {
            this.savingBalance += amt;
        }
        this.deposits.add(new Deposit(amt, date, account));
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        if (amt<=0) return 0;
        if (this.type.equals(CHECKING)) {
            if (this.checkBalance>=amt) {
                this.checkBalance -= amt;
            }
            else if (this.checkBalance -1*OVERDRAFT>=amt) {
                this.checkBalance -= amt;
            }
            else if (this.checkBalance -1*OVERDRAFT<amt) {
                amt = -1*OVERDRAFT + this.checkBalance;
                this.checkBalance = OVERDRAFT;
            }
        }
        else {
            if (this.savingBalance>=amt) {
                this.savingBalance -= amt;
            }
            else if (this.savingBalance -1*OVERDRAFT>=amt) {
                this.savingBalance -= amt;
            }
            else if (this.savingBalance -1*OVERDRAFT<amt) {
                amt = -1*OVERDRAFT + this.savingBalance;
                this.savingBalance = OVERDRAFT;
            }
        }
        this.withdraws.add(new Withdraw(amt, date, account));
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        //your code here
        withdraw(amt, new Date(), account);
        return true;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
