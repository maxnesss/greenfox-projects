package bank;


import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Customer max = new Customer("Maxim Nesazal");

        max.CreateBankAccount();
        max.addBalance(max.listOfBankAccounts.get(0).getAccountNumber(),50000,"Komercni Banka");
        max.listOfBankAccounts.get(0).getInfo();
        System.out.println(max.listOfBankAccounts.size());
    }
}
