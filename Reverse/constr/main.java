package Reverse.constr;

class Customer {

    private int cID;

    private String cName;

    public Customer(int cID, String cName) { // constructor

        this.cID = cID;

        this.cName = cName;

    }

    public int getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

}

public class main {

    public static void main(String[] args) {

        Customer cust = new Customer(11, "JAVA Constructor");

        System.out.println(cust.getcID());

        System.out.println(cust.getcName());
    }

}
