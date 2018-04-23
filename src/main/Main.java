package main;

import shop.Kunde;
import shop.Artikel;
import shop.Warenkorb;

public class Main {

    public static void main (String [] args){


        Kunde p = new Kunde ("Peter");
        Kunde i = new Kunde ("Ina");
        i.kauft(new Artikel("Kleid" ,199.99));
        i.kauft(new Artikel("Kette" ,499.));
        p.kauft(new Artikel("Smartphone" ,600.));


        String petersRechnungsText;
        String inasRechnungsText;
        double petersPreis = p.bezahlt();
        double inasPreis = i.bezahlt();

        int petersAnzahl = p.getWkorb().getAnzahl(); int inasAnzahl = i.getWkorb().getAnzahl();
        petersRechnungsText = p.name () + " bezahlt " + petersPreis + "  ̄fuer " + petersAnzahl + " Artikel.";
        inasRechnungsText = i.name () + " bezahlt " + inasPreis + "  ̄fuer " + inasAnzahl + " Artikel.";
        System.out.println(petersRechnungsText);
        System.out.println(inasRechnungsText);
    }
}
