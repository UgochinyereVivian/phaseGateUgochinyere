import java.util.ArrayList;

public class TransactionLogApplication{


    private static double accountBalance = 0.0;

    private static ArrayList<String> depositHistory = new ArrayList<>();


    private int depositCounter = 0;
    
    private TransactionRecorder recorderapp;



public double deposit(double amount){
    if(amount < 0) return 0.0;
    this.accountBalance += amount;
    
    this.recorderapp.depositRecorder(amount);
    return this.getBalance();
    

}


public double withdraw(double amount){
    if(amount > this.getBalance())
         return 0.0;
    
    if(amount <= 0)
         return 0.0;
    

    this.accountBalance -= amount;
    
    this.recorderapp.withdrawRecorder(amount);
    return this.getBalance();
    

}


public ArrayList<String> showTransactionHistory(){

    return this.depositHistory;
}


public double getBalance(){

    return this.accountBalance;

}


public void initRecordApp(TransactionLogApplication logapp){

    this.recorderapp = new TransactionRecorder(logapp);

    logapp.initDepositHistory(recorderapp);

}

private void initDepositHistory(TransactionRecorder recorderapp){

    this.depositHistory = recorderapp.getDepositHistory();

}


public static void print(String message){
    System.out.println(message);

}



//public static void main(String...ugo){
//
//  
//    TransactionLogApplication logapp = new TransactionLogApplication();
//    logapp.print("****Deposit Transaction****");
//
//    logapp.initRecordApp(logapp);
//
//    System.out.println(logapp.deposit(50));
//
//    System.out.println(logapp.showTransactionHistory());
//
//
//    logapp.print("****Withdrwal Transaction****");
//    System.out.println(logapp.withdraw(20));
//    
//    
//    logapp.print("****ShowTransactionHistory Transaction****");
//    System.out.println(logapp.showTransactionHistory());
//
//
//}

}







//public void withdraw{
//
//
//}

//
//
//public static void recordTransaction{
//
//
//}

/**

have class transactionRecorder
    maybe have TR in my transaction app


*/


/** 

    1. test negative input

    



*/
