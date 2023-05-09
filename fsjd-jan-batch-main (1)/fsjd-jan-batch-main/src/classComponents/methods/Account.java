package classComponents.methods;

public class Account {
    int customerId;
    int accountNumber;
    String accountHolderName;
    int balance;

    //no input no output

    void printMiniStatement() {
        System.out.println("printing mini statement");
        System.out.println("printing mini statement");
        System.out.println("printing mini statement");
    }
    //input- output
    int addBalances(int balance1, int balance2) {
        return balance1 + balance2;
    }

    // input but no output
    void displayBankName(String bankName) {
        System.out.println("Bank name is " + bankName);
    }

    // no input - output
    int cal(){
        return 10*20;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.printMiniStatement();
        account.displayBankName("SBI");
        System.out.println("Balance add "+account.addBalances(100,230));
        System.out.println("cal method "+account.cal());
    }

}
