package mobile_banking;

public class Bank {
    public Bank(){

    }

    public void start_banking(){
        String pin_araf = "13622";
        String pin_hasan = "11455";

        Account araf = new Account("Araf", "01722355382", pin_araf);
        Account hasan = new Account("Hasan", "01315101539",pin_hasan);

        System.out.println(araf);

        System.out.println(hasan);

        hasan.pin_update(pin_hasan, "4321");
        araf.add_money(2000);
        hasan.add_money(2000);

        araf.cash_out(1500, "1234");
        araf.cash_out(800, "13622");


        if (araf.pin_update("13622", "1234"))
            pin_araf = "1234";
        else
            pin_araf = pin_araf;

        araf.cash_out(500, "13622");
        araf.cash_out(1000, "1234");

        System.out.println(araf);
        System.out.println(hasan);

    }
}
