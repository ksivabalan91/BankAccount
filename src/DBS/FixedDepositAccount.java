package DBS;

public class FixedDepositAccount extends BankAccount  {


    private Float interest = 3.0F;
    private int duration = 6;
    private int interestCounter = 0;
    private int durationCounter = 0;
    
    //constructors
    public FixedDepositAccount(String customerName, Float balance){
        super(customerName,balance);
    }

    public FixedDepositAccount(String customerName, Float balance, Float interest){
        super(customerName, balance);
        this.interest = interest;
    }

    public FixedDepositAccount(String customerName, Float balance, Float interest, int duration){
        super(customerName,balance);
        this.interest = interest;
        this.duration = duration;        
    }
    
    // getters
    public Float getInterest() {return interest;}
    public int getDuration() {return duration;}

    // setters able to set interest and duration 1 time
    public void setInterest(Float interest) {
        if  (interestCounter==0){this.interest = interest;interestCounter++;} 
        else throw new IllegalArgumentException();
    }
    public void setDuration(int duration) {
        if  (durationCounter==0){this.duration = duration;durationCounter++;} 
        else throw new IllegalArgumentException();
    }

    // override getBalance to include interest and override deposit and withdraw to null
    @Override
    public Float getBalance(){
        super.setBalance(super.getBalance()*(interest/100/12*duration)+super.getBalance()); 
        return super.getBalance();
    }
    public void setBalance(Float balance){System.out.println("Set balance does nothing\n");}
    public void deposit(Float money){System.out.println("Deposit does nothing\n");}
    public void withdraw(Float money){System.out.println("Withdraw does nothing\n");}

}
