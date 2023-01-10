package DBS;

import java.security.SecureRandom;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BankAccount {
    
    private String customerName;
    private String accounNumber;
    private List<String> transactions = new LinkedList<>();
    private Float balance;
    private boolean isClosed = true;
    private Date openDate;
    private Date closeDate;

    // constructor    
    public BankAccount(String customername){
        this(customername, 0.0F);
    }

    public BankAccount(String customername, Float balance){
        this.customerName = customername;
        this.balance = balance;
        this.isClosed = false;
        this.openDate = new Date();
        this.closeDate = new Date();

        // Create a random number generator
        Random rand = new SecureRandom();
        // Generate a number between 1 and 10
        int randomAccNo = rand.nextInt(999_999);

        this.accounNumber = Integer.toString(randomAccNo);

    }

    //getters
    public String getCustomerName() {return customerName;}
    public String getAccounNumber() {return accounNumber;}
    public List<String> getTransactions() {return transactions;}
    public Float getBalance() {return balance;}
    public boolean isClosed() {return isClosed;}
    public Date getOpenDate() {return openDate;}
    public Date getCloseDate() {return closeDate;}
    //setters
    public void setTransactions(List<String> transactions) {this.transactions = transactions;}
    public void setBalance(Float balance) {this.balance = balance;}
    public void setClosed(boolean isClosed) {this.isClosed = isClosed;}
    public void setOpenDate(Date openDate) {this.openDate = openDate;}
    public void setCloseDate(Date closeDate) {this.closeDate = closeDate;}


    //methods
    public void deposit(Float money){
        if(money<0){
            throw new IllegalArgumentException();
        } else{
            balance += money;
            String depositTranscation = "deposit $"+money+" at "+ openDate.getTime() ;
            transactions.add(depositTranscation);
            
        }
    }

    public void withdraw(Float money){
        if ((isClosed||money>balance)||money<0)
            throw new IllegalArgumentException();
            
        else{
            balance -= money;
            String withdrawTranscation = "withdraw $"+money+" at"+ openDate.getTime();
            transactions.add(withdrawTranscation);            
        }
    }

}
