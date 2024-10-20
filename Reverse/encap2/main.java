package Reverse.encap2;

class Encap {

    private String coolean;

    public void setCoolean(String coolean) {
        this.coolean = coolean;
    }

    public String getCoolean() {
        return coolean;
    }

}

public class main {

    public static void main(String[] args) {

        Encap ec = new Encap();

        ec.setCoolean("hello");
        System.out.println(ec.getCoolean());
    }

}
