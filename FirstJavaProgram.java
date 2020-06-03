class BankAccount {
    String accNumber;
    String ssNumber;
    int balance=0;

    public BankAccount(String acc,String ss,int bal){
        accNumber = acc;
        ssNumber = ss;
        balance=bal;
    }
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int chechMyBalance() {
        System.out.println("계좌번호:"+accNumber);
        System.out.println("주민번호:"+ssNumber);
        System.out.println("잔액:"+balance);
        return balance;
    }
}
public class FirstJavaProgram {
    public static void main(String[] args) {
        BankAccount park = new BankAccount("12-23-23", "961211-2222222", 10000);


        BankAccount hong = new BankAccount("23-23-23", "990517-1111111", 20000);


        park.deposit(100000);
        hong.deposit(20000);
        park.withdraw(200);
        hong.withdraw(200);
        park.chechMyBalance();
        hong.chechMyBalance();
    }
}