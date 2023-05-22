package adaptAssignment.exceptionHandellingAssignment;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class IllegalBankTransactionException extends Exception {
    public IllegalBankTransactionException(String msg) {
        super(msg);
    }
}

class SavingAccount {
    long id;
    double balance;

    public double withdraw(double amount) throws InsufficientBalanceException, IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Invalid Amount entered");
        }
        if (balance == 0 || amount > balance) {
            throw new InsufficientBalanceException("Account Balance is Low");
        }

        balance -= amount;
        return amount;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

}
public class ques3 {
    public static void main(String[] args) {

        SavingAccount accountObj = new SavingAccount();

        accountObj.deposit(2000);
        try {
            double amountWithdrawn = accountObj.withdraw(2000); // executes successfully

            double amountWithdrawn1 = accountObj.withdraw(1000); // throws
            // InsufficientBalanceException

            double amount1 = accountObj.withdraw(-1000); // throws
            // IllegalBankTransactionException

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
