package Reverse.enacap;

class Bank {

    private int accountNumber;
    private int pin;

    public void setaccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public void setpin(int pin) {

        this.pin = pin;
    }

    public int getaccountNumber() {

        return accountNumber;
    }

    public int getpin() {

        return pin;
    }

}

public class main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        // System.out.println(bank.accountNumber);
        // System.out.println(bank.pin);

        bank.setaccountNumber(653478234);
        bank.setpin(7834);
        System.out.println(bank.getaccountNumber());
        System.out.println(bank.getpin());
    }

}
