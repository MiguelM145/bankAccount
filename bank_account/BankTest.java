public class BankTest {
    public static void main(String[] args){

        BankAccount bank1 = new BankAccount();
        System.out.println("This is bank 1");
            bank1.depositMoney(20, "checking");
            bank1.getBalance();
            bank1.withdrawMoney(5, "checking");
            bank1.getBalance();

        BankAccount bank2 = new BankAccount();
        System.out.println("This is bank 2");
            bank2.depositMoney(40, "savings");
            bank2.getBalance(); 
            bank2.withdrawMoney(32, "savings");
            bank2.getBalance();

        BankAccount bank3 = new BankAccount();
        System.out.println("This is bank 3");
            bank3.depositMoney(80, "checking");
            bank3.getBalance(); 
            bank3.withdrawMoney(90, "checking");
            bank3.getBalance();

        System.out.println(BankAccount.totalMoney); 
        System.out.println(BankAccount.accounts);
    }
}
