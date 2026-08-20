
class main:

    logapp = new TransactionLogApplication();

    logapp.initRecordApp(logapp);
        
    main = new main();
    main.message();
    userInput = int(input())

    while(userInput != 0):
        match(userInput):
            case 1: 
                print("enter amount: ",end="")
                amount = int(input())
                print(main.deposit(amount))
                main.message()
                print()
                userInput = int(input())
                break
                

            case 2:
                
                print("enter amount: ",end="")
                amount = int(input())
                print(main.withdraw(amount))
                print()
                message()
                userInput = int(input())
                break
            

            case 3:
                main.showHistory()
                main.message()
                userInput = int(input())
                break

            case_: print("na you saka oo");
                



def message():
    message = """

        ******Welcome To StayDoggy Digital Happ*********
        1. Deposit
        2. Withdraw
        3. Check Balance
        0. Exit

    """
    print(message);



def deposit(amount):
    if(amount < 0):
        print("invalid deposit");
    else:
        print("amount : " + amount +" \nVAT: 0.0");
        print("Successful✅️");
        print("new account balance is: ");
        return logapp.deposit(amount);
    


def withdraw(amount):
    if(amount > logapp.getBalance()):
         println("Insufficient Funds");
    elif(amount <= 0):
         print("Invalid Amount");
    else:
        print("amount : " + amount +" \nVAT: 0.0");
        print("Successful✅️");
        print("new account balance is: ",end="");
        return logapp.withdraw(amount);
    
 

def showHistory():
    logapp.showTransactionHistory();

