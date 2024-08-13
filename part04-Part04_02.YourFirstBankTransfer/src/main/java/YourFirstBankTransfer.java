
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account rrAcount = new Account("Matthews account",1000.00);
        Account myAcount = new Account("My account",0.00);
        rrAcount.withdrawal(100.0);
        myAcount.deposit(100);
        System.out.println(rrAcount);
        System.out.println(myAcount);
    }
}
