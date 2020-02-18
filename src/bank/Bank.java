package bank;
public class Bank {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount();
        c1.setAccountNumber(1111);
        c1.setOwnerName("Jubileu");
        c1.openAccount("cc");
       
        BankAccount c2 = new BankAccount();
        c2.setAccountNumber(2222);
        c2.setOwnerName("Creuza");
        c2.openAccount("cp");
        
        c1.deposit(100);
        c2.deposit(500);
        c2.withdrawMoney(1000);
        
        c1.withdrawMoney(150);
        c1.closeAccount();
        
        c1.currentStatus();
        c2.currentStatus();
    }
}
