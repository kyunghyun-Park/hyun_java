package haha;

class BankAccount {
    int balance = 0;

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
    public int chechMyBalance() {
        System.out.println("잔액:"+balance);
        return balance;
    }
}
 class PassingRef {
     public static void main(String[] args) {
         BankAccount hyun = new BankAccount();
         hyun.deposit(3000);
         hyun.withdraw(200);
         hyun.chechMyBalance();
         check(hyun);
     }

     public static void check(BankAccount acc){
         acc.chechMyBalance();
     }
}
