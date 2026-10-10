import java.util.ArrayList;

public class Bank {
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor dengan parameter initial balance
    public Bank(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Initial balance: Rp " + (int) initialBalance);
    }

    // Method untuk deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposit: Rp " + (int) amount);
        }
    }

    // Method untuk withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdraw: Rp " + (int) amount);
        }
    }

    // Method untuk mendapatkan saldo saat ini
    public double getBalance() {
        return balance;
    }

    // Method untuk menampilkan riwayat transaksi (penerapan ArrayList)
    public void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println("- " + transaction);
        }
    }
}