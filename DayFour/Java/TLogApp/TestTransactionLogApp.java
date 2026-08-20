import org.junit.jupiter.api.BeforeEach;
import java.org.junit.jupiter.api.Test;
import static java.org.junit.jupiter.api.Assertions.*;


public class TestTransactionLogApp{

//@BeforeEach()
//    void setUp(){
//        TransactionLogApplication logapp = new TransactionLogApplication();
//        logapp.initRecordApp(logapp);
//    }
//
//

@Test
    public void thatThatWhenANegativeNumber50isDeposited00isReturned(){
       TransactionLogApplication logapp = new TransactionLogApplication();
       logapp.initRecordApp(logapp);

       double trackedReturn = logapp.deposit(-50);
       double expectedReturn = (0.0);

       assertEquals(trackedReturn,expectedReturn);
    }


@Test
    public void thatThatWhenAPositiveAmount50isDeposited_newBalanceBecomes50(){

       TransactionLogApplication logapp = new TransactionLogApplication();
       logapp.initRecordApp(logapp);

       double trackedReturn = logapp.deposit(50);
       double expectedReturn = (50.0);

       assertEquals(trackedReturn,expectedReturn);
    }


@Test
    public void thatThatWhenAnAmount10000_reaterThanUsersBalanace_isWithdrawn_theUserIsNotifiedOfInsufficientBalance_and0isReturned(){

       TransactionLogApplication logapp = new TransactionLogApplication();
       logapp.initRecordApp(logapp);

       double trackedReturn = logapp.withdraw(10,000);
       double expectedReturn = (0.0);

       assertEquals(trackedReturn,expectedReturn);
    }

@Test
    public void thatThatWhenANegativeNumber50isWithdrawn_theUserIsNotifiedOfInvalidWithdrawand0isReturned(){


       TransactionLogApplication logapp = new TransactionLogApplication();
       logapp.initRecordApp(logapp);

       double trackedReturn = logapp.withdraw(-50);
       double expectedReturn = (0.0);

       assertEquals(trackedReturn,expectedReturn);
    }
}
