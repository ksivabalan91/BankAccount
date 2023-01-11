package DBS;

public class Main {

    public static void main(String[] args) {

        // testing account creation for BankAccount creation
        BankAccount zeldaAccount = new BankAccount("Zelda");
        BankAccount linkAccount = new BankAccount("Link",50_000F);

        // testing deposit and withdrawls
        zeldaAccount.deposit(100_000F);
        zeldaAccount.withdraw(50_000F);
        zeldaAccount.withdraw(50_000F);

        linkAccount.withdraw(10_000F);
        linkAccount.withdraw(10_000F);
        linkAccount.withdraw(10_000F);
        
        //final account status
        System.out.println("Customer Name:\t\t"+zeldaAccount.getCustomerName());
        System.out.println("Account No:\t\t"+zeldaAccount.getAccountNumber());
        System.out.println("Account Opened on:\t"+zeldaAccount.getOpenDate());
        System.out.println("Account balance:\t$"+zeldaAccount.getBalance());        
        System.out.println("Transactions:\t\t"+zeldaAccount.getTransactions()+"\n");
        
        System.out.println("Customer Name:\t\t"+linkAccount.getCustomerName());
        System.out.println("Account No:\t\t"+linkAccount.getAccountNumber());
        System.out.println("Account Opened on:\t"+linkAccount.getOpenDate());
        System.out.println("Account balance:\t$"+linkAccount.getBalance());        
        System.out.println("Transactions:\t\t"+linkAccount.getTransactions()+"\n");

        // testing account creation for FixedDepositAccount creation
        FixedDepositAccount ezioAccount = new FixedDepositAccount("Ezio", 10_000F);
        FixedDepositAccount altairAccount = new FixedDepositAccount("Altair",100_000F,4.0F);
        FixedDepositAccount arnoAccount = new FixedDepositAccount("Arno",1_00_000F,4.5f,12);

        // testing deposit and withdrawls, should print "this does nothing"
        ezioAccount.deposit(100_000F);
        ezioAccount.withdraw(50_000F);
        ezioAccount.setBalance(1F);

        // change duration and interest
        ezioAccount.setInterest(4F);
        ezioAccount.setDuration(24);
        
        //final account status with get balance 
        System.out.println("Customer Name:\t\t"+ezioAccount.getCustomerName());
        System.out.println("Account No:\t\t"+ezioAccount.getAccountNumber());
        System.out.println("Account Opened on:\t"+ezioAccount.getOpenDate());
        System.out.println("Fixed deposit interest:\t"+ezioAccount.getInterest());
        System.out.println("Fixed deposit duration:\t"+ezioAccount.getDuration());
        System.out.println("Account balance:\t$"+ezioAccount.getBalance());        
        System.out.println("Transactions:\t\t"+ezioAccount.getTransactions()+"\n");
        
        System.out.println("Customer Name:\t\t"+altairAccount.getCustomerName());
        System.out.println("Account No:\t\t"+altairAccount.getAccountNumber());
        System.out.println("Account Opened on:\t"+altairAccount.getOpenDate());
        System.out.println("Fixed deposit interest:\t"+altairAccount.getInterest());
        System.out.println("Fixed deposit duration:\t"+altairAccount.getDuration());
        System.out.println("Account balance:\t$"+altairAccount.getBalance());        
        System.out.println("Transactions:\t\t"+altairAccount.getTransactions()+"\n");

        System.out.println("Customer Name:\t\t"+arnoAccount.getCustomerName());
        System.out.println("Account No:\t\t"+arnoAccount.getAccountNumber());
        System.out.println("Account Opened on:\t"+arnoAccount.getOpenDate());
        System.out.println("Fixed deposit interest:\t"+arnoAccount.getInterest());
        System.out.println("Fixed deposit duration:\t"+arnoAccount.getDuration());
        System.out.println("Account balance:\t$"+arnoAccount.getBalance());        
        System.out.println("Transactions:\t\t"+arnoAccount.getTransactions()+"\n");





    }
    
}
