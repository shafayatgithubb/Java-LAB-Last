public class BankAccount {
    private String accountNumber;
    private double balance;

    String getAccountNumber() {
        return accountNumber;
    }

    String setAccountNumber(String accountNumber) {
        return accountNumber;
    }


    double getBalence() {
        return balance;
    }

    double setBalence(double balance) {
        if (balance < 0) {
            System.out.println("Negative Balence");
        }
        return balance;
    }

    double deposit(double bal) {
        if (bal > 0) {
            return balance += bal;
        }
        return 0.00;
    }

    void withDraw(double bal) {
        if (bal < balance) {
            this.balance -= bal;
        }
        System.out.println("jhamela ase account er takay");
    }

    void summery() {
        System.out.println("AccountNumber: " + accountNumber + " Balance:" + balance);
    }

    double calculateInterest(int months) {
        return 0.00;
    }

}

class SavingAccount extends BankAccount {
    private double AnnualRate;

    double calculateInterest(int months) {
        return getBalence() * (Math.pow((1 + AnnualRate / 12), (months - 1)));
    }

}
