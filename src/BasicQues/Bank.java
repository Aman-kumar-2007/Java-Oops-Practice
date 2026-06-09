package BasicQues;
/*
Create a class Bank

Data members:

accountNo
holderName

Create:

Default constructor
Parameterized constructor

Display outputs for both.

 */
public class Bank {
    int accountNo;
    String holderName;
    Bank(int ac,String name){
        this.accountNo = ac;
        this.holderName = name;
    }
    Bank(){
        accountNo = 0;
        holderName = "Not Assigned";
    }
    public static void main(String[] args){
        Bank b1 = new Bank();
        Bank b2 = new Bank(890, "Aman");

        System.out.println("Default Constructor Output:");
        System.out.println(b1.accountNo + " " + b1.holderName);

        System.out.println("Parameterized Constructor Output:");
        System.out.println(b2.accountNo + " " + b2.holderName);

    }
}
