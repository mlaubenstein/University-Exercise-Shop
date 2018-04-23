package shop;

import static java.lang.Math.round;

public class Kunde implements DatenKunde{

    private String name;
    private Warenkorb wkorb;
    private double wert;


    public Kunde (String name){
        this.name = name;
        this.wkorb = new Warenkorb ();

    }

    public Warenkorb getWkorb() {
        return wkorb;
    }


    public void kauft(Artikel a){
        wkorb.add ( a );
    }

    public double bezahlt(){
        wert = wkorb.getSumme ();

         if         (wert==0.00d)                       wert = 0.00d;
         else if    (wert < 10.00d && wert > 0.00d)     wert+= 6.00d;
         else if    (wert < 30.00d && wert >= 10.00d )  wert+= 4.00d;
         else if    (wert < 100.00d && wert >= 30.00d)  wert = wert +(wert * 0.03d);

        wert = wert * 100;
        wert = round (wert);
        wert = wert / 100;


        return wert;
    }

    @Override
    public String name() {
        return name;
    }


}


