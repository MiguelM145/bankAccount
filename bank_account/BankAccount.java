public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    public static int accounts = 0;
    public static double totalMoney = 0; 

    public BankAccount() { 
        BankAccount.accounts += 1; 
        this.checkingBalance = 0;
        this.savingsBalance = 0; 
    }

    public double getChecking(){
        return this.checkingBalance; 
    }

    public double getSavings(){
        return this.savingsBalance;
    }

    public void depositMoney(double money, String account){
        if(account.equals("checking")){
            this.checkingBalance += money; 
        }else if(account.equals("savings")){
            this.savingsBalance += money; 
        }
        BankAccount.totalMoney += money; 
    }

    public void withdrawMoney (double money, String account) {
        if(account.equals("checking")){
            if(checkingBalance < money){
                System.out.println("Insuffient funds in checkings");
            }else{
                this.checkingBalance -= money; 
                BankAccount.totalMoney -= money; 
                System.out.println("Withdraw Complete");
            }
            
        }else if( account.equals("savings")){
            if(savingsBalance < money){
                System.out.println("Insuffient funds in savings");
            }else{
                this.savingsBalance -= money; 
                BankAccount.totalMoney -= money; 
                System.out.println("Withdraw Complete");
            }
        }
    }

    public void getBalance(){
        System.out.println( "Your Checking Balance is: " + this.checkingBalance);
        System.out.println("Your Saving Balance is: " + this.savingsBalance);
    }

}
