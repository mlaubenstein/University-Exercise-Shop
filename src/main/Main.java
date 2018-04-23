package main;

import expections.KeinArtikelExpection;
import expections.PreisIstNullExpection;
import shop.Kunde;
import shop.Artikel;


public class Main {

    public static void main (String [] args) throws PreisIstNullExpection, KeinArtikelExpection {


        Kunde p = new Kunde ("Peter");
        Kunde i = new Kunde ("Ina");
      //  try {
            i.kauft(new Artikel("Kleid" , 6));

       // } catch (PreisIstNullExpection übergebenerWertLeerExpection) {
       //     übergebenerWertLeerExpection.printStackTrace ();
       // }
        i.kauft(new Artikel("Kette" ,10));
        p.kauft(new Artikel("Smartphone" ,0));


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
