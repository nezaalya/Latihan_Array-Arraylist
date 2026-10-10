public class BankDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank ABC");
        
        // Set initial balance Rp 100,000 via the constructor
        Bank myAccount = new Bank(100000);
        System.out.println("Current balance: Rp " + (int) myAccount.getBalance());
        System.out.println();

        // Run deposit method
        myAccount.deposit(500000);
        System.out.println("Deposit: Rp 500000");
        System.out.println("Current balance: Rp " + (int) myAccount.getBalance());
        System.out.println();

        // Run withdraw method
        myAccount.withdraw(150000);
        System.out.println("Withdraw: Rp 150000");
        System.out.println("Current balance: Rp " + (int) myAccount.getBalance());

        // Menampilkan riwayat transaksi menggunakan ArrayList
        myAccount.showTransactionHistory();
    }
}