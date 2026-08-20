from transaction_recorder import TransactionRecorder

class transaction_account:



    def __init__(self):
        self.___account_balance = 0.0
        self.___deposit_history = []

        self.___recorder_app = None;
        


    def deposit(self,amount):
        if(amount < 0): 
            return 0.0
        self.___account_balance += amount

        self.__recorder_app.depositRecorder(amount)
        return self.getBalance()



    def  withdraw(self,amount):
        if(amount > self.getBalance()):
            return 0.0

        if(amount <= 0):
            return 0.0


        self.__accountBalance -= amount

        self.__recorder_app.withdrawRecorder(amount)
        return self.getBalance(self)





    def showTransactionHistory(self):

        return self.__deposit_history



    def getBalance(self):

        return self.___account_balance




    def initRecordApp(self,logapp):

        self.__recorder_app = TransactionRecorder(logapp)

        logapp.initDepositHistory(self.__recorder_app)



    def initDepositHistory(self,recorder_app):

        self.depositHistory = recorder_app.getDepositHistory()








