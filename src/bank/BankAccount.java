package bank;
public class BankAccount {
    public int accountNumber;
    protected String accountType; // cc / cp
    private String ownerName;
    private float accountBalance;
    private boolean status;
    
    public void currentStatus() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getAccountNumber());
        System.out.println("Tipo: " + this.getAccountType());
        System.out.println("Dono: " + this.getOwnerName());
        System.out.println("Saldo: " + this.getAccountBalance());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void openAccount(String type) {
        this.setAccountType(type);
        this.setStatus(true);
        if(type == "cc") {
            this.setAccountBalance(50.0f);
        } else if(type == "cp") {
            this.setAccountBalance(150.0f);
        }
        System.out.println("Conta aberta com sucesso!!!");
    }
    
    public void closeAccount() {
        if(this.getAccountBalance() > 0) {
            System.out.println("Conta com dinheiro!!!");
        } else if(this.getAccountBalance() < 0) {
            System.out.println("Conta em débito!!!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
        }
    }
    
    public void deposit(float money) {
        if(this.getStatus() == true) {
            this.setAccountBalance(this.getAccountBalance() + money);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getOwnerName());
        } else {
            System.out.println("ERRO! Impossível realizar o depósito!!!");
        }
    }
    
    public void withdrawMoney(float value) {
        if(this.getStatus() == true) {
            if(this.getAccountBalance() >= value){
                this.setAccountBalance(this.getAccountBalance() - value);
                System.out.println("Saque realizado com sucesso na conta de " + this.getOwnerName());
            } else {
                System.out.println("Saldo insuficiente para realizar o saque!!!");
            }
        } else {
            System.out.println("ERRO! Impossível realizar o saque!!!");
        }
    }
    
    public void montlyPayment() {
        float montlyPaymentValue = 0;
        if(this.getAccountType() == "cc") {
            montlyPaymentValue = 12f;
        } else if(this.getAccountType() == "cp") {
            montlyPaymentValue = 20f;
        }
        
        if(this.getStatus() == true) {
            if(this.getAccountBalance() > montlyPaymentValue) {
                this.setAccountBalance(this.getAccountBalance() - montlyPaymentValue);
            } else {
                System.out.println("Saldo insuficiente!!!");
            }
        } else {
            System.out.println("ERRO! Conta inativa!!!");
        }
    }
    
    public BankAccount() {
        this.setAccountBalance(0);
        this.setStatus(false);
    }
    
    public void setAccountNumber(int n) {
        this.accountNumber = n;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public void setAccountType(String t) {
        this.accountType = t;
    }
    
    public String getAccountType() {
        return this.accountType;
    }
    
    public void setOwnerName(String o) {
        this.ownerName = o;
    }
    
    public String getOwnerName() {
        return this.ownerName;
    }
    
    public void setAccountBalance(float b) {
        this.accountBalance = b;
    }
   
    public float getAccountBalance() {
        return this.accountBalance;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }
}
