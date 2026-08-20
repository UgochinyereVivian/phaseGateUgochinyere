import java.util.ArrayList;

public class TransactionRecorder{
    private ArrayList<String> depositRecord = new ArrayList<>();
    private TransactionLogApplication logapp;


    public TransactionRecorder(TransactionLogApplication logapp){
        this.logapp = logapp;

    }

public void depositRecorder(double amount){
    double newBalance = this.logapp.getBalance();
    this.depositRecord.add("Deposited: " + amount + "newBalance is" + newBalance);    

}

public void withdrawRecorder(double amount){
    double newBalance = this.logapp.getBalance();
    this.depositRecord.add("Withdrawal: " + amount + "newBalance is" + newBalance);    

}

public ArrayList<String> getDepositHistory(){

    return this.depositRecord;
}


}
