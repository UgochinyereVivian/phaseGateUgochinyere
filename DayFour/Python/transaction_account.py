
class transaction_account:

    __account_balance = 0.0

    deposit_history = []

    deposit_counter = 0

    recorder_app = new recorder_application()

    

def deposit(amount,self):
    if(amount < 0): return 0.0;
        self.accountBalance += amount;

        self.recorderapp.depositRecorder(amount);
    return self.getBalance();





    def  withdraw(amount,self):
        if(amount > self.getBalance())
            return 0.0

        if(amount <= 0):
            return 0.0


        self.accountBalance -= amount;

        self.recorderapp.withdrawRecorder(amount);
        return self.getBalance();





    def showTransactionHistory(self):

        return self.depositHistory



    def getBalance():

        return self.accountBalance;




    def initRecordApp(TransactionLogApplication logapp):

        self.recorderapp = new TransactionRecorder(logapp);

        logapp.initDepositHistory(recorderapp);



    def initDepositHistory(TransactionRecorder recorderapp):

        self.depositHistory = recorderapp.getDepositHistory()








