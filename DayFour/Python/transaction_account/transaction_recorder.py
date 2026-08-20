class TransactionRecorder:
    depositRecord = []
    logapp = 0


    def __init__(self,logapp):
        self.logapp = logapp

        

    def depositRecorder(self,amount):
        newBalance = self.logapp.getBalance();
        self.depositRecord.append(f"Deposited: {amount} + newBalance is {newBalance}");    



    def withdrawRecorder(self,amount):
        newBalance = self.logapp.getBalance();
        self.depositRecord.append(f"Withdrawal:  {amount} + newBalance is {newBalance}");    


    def getDepositHistory(self):

        return self.depositRecord


