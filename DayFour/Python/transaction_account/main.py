from transaction_account import transaction_account

def message():
    msg = """
        ******Welcome To StayDoggy Digital App*********
        1. Deposit
        2. Withdraw
        3. Check History
        0. Exit
    """
    print(msg)

def deposit(amount):
    if amount < 0:
        print("invalid deposit")
        return 0.0
    else:
        print(f"amount : {amount}\nVAT: 0.0")
        print("Successful✅️")
        print("new account balance is: ", end="")
        return logapp.deposit(amount)

def withdraw(amount):
    if amount > logapp.getBalance():
         print("Insufficient Funds")
         return 0.0
    elif amount <= 0:
         print("Invalid Amount")
         return 0.0
    else:
        print(f"amount : {amount}\nVAT: 0.0")
        print("Successful✅️")
        print("new account balance is: ", end="")
        return logapp.withdraw(amount)

def showHistory():
    print(logapp.showTransactionHistory())

if __name__ == "__main__":
    logapp = transaction_account()
    logapp.initRecordApp(logapp)
    
    message()
    userInput = int(input())

    while userInput != 0:
        if userInput == 1:
            print("enter amount: ", end="")
            amount = int(input())
            print(deposit(amount))
            message()
            print()
            userInput = int(input())
        elif userInput == 2:
            print("enter amount: ", end="")
            amount = int(input())
            print(withdraw(amount))
            print()
            message()
            userInput = int(input())
        elif userInput == 3:
            showHistory()
            message()
            userInput = int(input())
        else:
            print("na you saka oo")
            message()
            userInput = int(input())

