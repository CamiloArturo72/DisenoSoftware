public class Account {
    private double balance;

    
    public Account(double initialBalance) {
        balance = initialBalance;
    }

   
    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            balance -= amount;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account = new Account(1200.0); 
        double withdrawalAmount = 1000.0;

        System.out.println("Saldo antes del retiro: " + account.getBalance());
        double newBalance = account.withdraw(withdrawalAmount);
        System.out.println("Saldo después del retiro: " + newBalance);
    }
}


