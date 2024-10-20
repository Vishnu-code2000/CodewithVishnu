package Reverse.Employee;

import java.util.Scanner;

import java.lang.Integer;

class Employee { // plain old java object pojo class

    private int eId;
    private String eName;
    private String eEmail;
    private String eAddress;

    public Employee() {

    }

    public Employee(int eId, String eName, String eEmail, String eAddress) {

        this.eId = eId;
        this.eName = eName;
        this.eEmail = eEmail;
        this.eAddress = eAddress;

    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteAddress() {
        return eAddress;
    }

    public String geteEmail() {
        return eEmail;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }
}

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter employees");

        int n = scan.nextInt();
        scan.nextLine();

        Employee[] eas = new Employee[n];

        for (int i = 0; i < n; i++) {

            Employee e = new Employee();

            System.out.println("Enter Employee details");

            String deatils = scan.nextLine(); // 1 tim tim@gmail.com seattle

            String[] arr = deatils.split(",");

            e.seteId(Integer.parseInt(arr[0]));

            e.seteName(arr[1]);

            e.seteEmail(arr[2]);

            e.seteAddress(arr[3]);

            eas[i] = e;

        }

        for (Employee employee : eas) {
            System.out.println(employee.geteId());
            System.out.println(employee.geteName());
            System.out.println(employee.geteEmail());
            System.out.println(employee.geteAddress());
        }

    }

}
