package DBS;

public class Main {

    public static void main(String[] args) {

        // **BANK ACCOUNT CLASS** //

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

        //--ERROR CHECKING--//
        
        //check deposit conditions
        try{linkAccount.deposit(-1000f);} //negative deposit
        catch(IllegalArgumentException e) {System.out.println("negative deposit value error: "+e+"\n");}
        
        try{
            linkAccount.setClosed(true); // closed account
            linkAccount.deposit(1000f);} 
        catch(IllegalArgumentException e) {System.out.println("closed account deposit error: "+e+"\n");}
        
        //check withdraw conditions
        try{zeldaAccount.withdraw(-1000f);} //negative withdrawal
        catch(IllegalArgumentException e) {System.out.println("negative withdrawl value error: "+e+"\n");}
        
        try{zeldaAccount.withdraw(1_000_000f);} //withdrawal more than account balance
        catch(IllegalArgumentException e) {System.out.println("withdrawl more than balance value error: "+e+"\n");}
        
        try{
            zeldaAccount.setClosed(true); // closed account
            zeldaAccount.withdraw(1000f);} 
        catch(IllegalArgumentException e) {System.out.println("closed account withdrawl error: "+e+"\n");}



        //---------------------------------------------------------------------------------------------------------------------------//
        
        // **FIXED DEPOSIT ACCOUNT CLASS** //

        // testing account creation for FixedDepositAccount creation
        FixedDepositAccount ezioAccount = new FixedDepositAccount("Ezio", 10_000F);
        FixedDepositAccount altairAccount = new FixedDepositAccount("Altair",100_000F,4.0F);
        FixedDepositAccount arnoAccount = new FixedDepositAccount("Arno",1_00_000F,4.5f,12);

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

        //--ERROR CHECKING--//

        // testing deposit and withdrawls method overrides, should print "this does nothing"
        ezioAccount.deposit(100_000F);
        ezioAccount.withdraw(50_000F);
        ezioAccount.setBalance(1F);

        //change duration and interest 2nd time
        try{ezioAccount.setInterest(6F);} 
        catch(IllegalArgumentException e) {System.out.println("2nd time interest change error: "+e+"\n");}
        
        try{ezioAccount.setDuration(36);} 
        catch(IllegalArgumentException e) {System.out.println("2nd time duration change error: "+e+"\n");}

    }
    
}
