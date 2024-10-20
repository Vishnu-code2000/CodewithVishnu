package Reverse.encap3;

class Customer {

    private int customerID;

    private String customerName;

    private long customerNumber;

    public void setData(int customerID, String customerName, long customerNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerNumber = customerNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

}

public class main {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setData(1309, "JAVA", 8257832);

        System.out.println(customer.getCustomerID());

        System.out.println(customer.getCustomerName());

        System.out.println(customer.getCustomerNumber());

    }

}
