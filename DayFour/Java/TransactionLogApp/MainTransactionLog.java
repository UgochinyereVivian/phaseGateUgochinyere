import java.util.Scanner;

public class MainTransactionLog{

    public static Scanner scanner = new Scanner(System.in);
    public static TransactionLogApplication logapp = new TransactionLogApplication();


public static void main(String...ugo){
    logapp.initRecordApp(logapp);
        
    MainTransactionLog main = new MainTransactionLog();
    main.message();
    int userInput = scanner.nextInt();

    while(userInput != 0){
        switch(userInput){
            case 1: 
                print("enter amount: ");
                int amount = scanner.nextInt();
                println(main.deposit(amount));
                main.message();
                println();
                userInput = scanner.nextInt();
                break;
                

            case 2:
                
                print("enter amount: ");
                amount = scanner.nextInt();
                println(main.withdraw(amount));
                println();
                message();
                userInput = scanner.nextInt();
                break; 
            

            case 3:
                main.showHistory();
                main.message();
                userInput = scanner.nextInt();
                break; 

            default: println("na you saka oo");
                


        }
      
    }



}


public static void message(){
    String message = """

        ******Welcome To StayDoggy Digital Happ*********
        1. Deposit
        2. Withdraw
        3. Check Balance
        0. Exit

    """;
    println(message);



}


public static double deposit(double amount){
    if(amount < 0)
        println("invalid deposit");
    else{
        println("amount : " + amount +" \nVAT: 0.0");
        println("Successful✅️");
        print("new account balance is: ");
        return logapp.deposit(amount);
    }

    return logapp.deposit(amount);
    
}


public static double withdraw(double amount){
    if(amount > logapp.getBalance())
         println("Insufficient Funds");
    else if(amount <= 0)
         println("Invalid Amount");
    else{
        println("amount : " + amount +" \nVAT: 0.0");
        println("Successful✅️");
        System.out.print("new account balance is: ");
        return logapp.withdraw(amount);
    }

   return logapp.withdraw(amount);
    
}

public static void showHistory(){
    logapp.showTransactionHistory();

}

public static void print(String message){
    System.out.print(message);

}

public static void println(String message){
    System.out.println(message);

}

public static void println(){
    System.out.println();

}

public static void println(double message){
    System.out.println(message);

}






}
