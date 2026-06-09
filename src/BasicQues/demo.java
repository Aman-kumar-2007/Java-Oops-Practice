package BasicQues;
/*
Create class ATMAccount.

Private members:

accountNumber
balance

Rules:

balance cannot be less than 1000

Use getters/setters.

 */
public class demo {
    private int accountNumber;
    private double balance;

    void setAccountNumber(int accountNum){
        this.accountNumber = accountNum;
    }

    void setBalance(double balan){
        if(balan > 1000){
            this.balance = balan;
        } else System.out.println("Balance can't be less than 1000");
    }

    int getAccountNumber(){
        return this.accountNumber;
    }

    double getBalance(){
        return this.balance;
    }

    public static void main(String[] args){
        demo a = new demo();
        a.setBalance(5000);
        a.setAccountNumber(9090);

        System.out.println(a.getAccountNumber());
        System.out.println(a.getBalance());

    }
}
