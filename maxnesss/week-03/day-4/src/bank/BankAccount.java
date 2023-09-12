package bank;

import java.time.LocalDate;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private Customer owner;
    private String accountType;
    private int balance;
    private List<String> historyOfTransactions;
    private List<Customer> listOfPartners;
    private LocalDate lastUsageDate;

    BankAccount(Customer owner){
        this.owner = owner;
        this.balance =0;
        this.accountNumber = generateAccountNo();
        this.accountType = "balance";

    }
    public void getInfo(){
        System.out.println(accountNumber+ " :");
        System.out.println("  Account type: "+ owner.getName());
        System.out.println("  Account type: "+ accountType);
        System.out.println("  Usable balance: "+ balance);
    }
    private String generateAccountNo(){
        String accNo = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                accNo += ""+((int)(Math.random()*10));
            }
            accNo = accNo.concat(" ");
        }
        return accNo;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
}
