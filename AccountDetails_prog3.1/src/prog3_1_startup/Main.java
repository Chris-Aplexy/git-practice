package prog3_1_startup;

public class Main {
    public static void main(String[] args) {
        Employee empl = new Employee("Mwesigwa Christopher","Aplexy",6356738.78,2001,06,8);

        Account ad = new Account(empl,Account.SAVINGS);

        System.out.println(empl.toString());
        ad.makeDeposit(20000356.56);
        ad.makeWithdrawal(200000.7);
        System.out.println(ad.toString());
        //System.out.println(ad.makeDeposit(20000356.56));

    }
}
