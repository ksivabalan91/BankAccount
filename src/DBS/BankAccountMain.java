package DBS;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount sivaAccount = new BankAccount("Siva");
        BankAccount nanAccount = new BankAccount("Nanthinii",50_000F);

        sivaAccount.deposit(100_000F);
        sivaAccount.withdraw(50_000F);
        sivaAccount.withdraw(50_000F);

        nanAccount.withdraw(10_000F);
        nanAccount.withdraw(10_000F);
        nanAccount.withdraw(10_000F);
                
        System.out.println(sivaAccount.getCustomerName());
        System.out.println(sivaAccount.getBalance());
        System.out.println(sivaAccount.getOpenDate());
        System.out.println(sivaAccount.getTransactions());

        System.out.println(nanAccount.getCustomerName());
        System.out.println(nanAccount.getBalance());
        System.out.println(nanAccount.getOpenDate());
        System.out.println(nanAccount.getTransactions());


    }
    
}
