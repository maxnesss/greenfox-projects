package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    List<BankAccount> listOfBankAccounts =new ArrayList<>();
    Customer (String name){
        this.name = name;
    }

    public void CreateBankAccount(){
        listOfBankAccounts.add(new BankAccount(this));
    }
    public void addBalance(String accountNumber, int amount, String from){
        for (BankAccount account : listOfBankAccounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                account.setBalance(amount);
            }
        }
    }

    public String getName() {
        return name;
    }
}
