class BankAccount
{
    int balance = 0;

    public int deposit(int amount)
    {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount)
    {
        balance -= amount;
        return balance;
    }
    public int chechMyBalance() {
        System.out.println("잔액: " + balance);
        return balance;
    }
}
public class ClassTest {
    public static void main(String[] args) {
        BankAccount myAcc1 = new BankAccount();
        BankAccount myAcc2 = new BankAccount();


        myAcc1.deposit(10000);
        myAcc2.deposit(10000);
        myAcc1.withdraw(2000);
        myAcc2.withdraw(3000);
        myAcc1.chechMyBalance();
        myAcc2.chechMyBalance();
    }
}
