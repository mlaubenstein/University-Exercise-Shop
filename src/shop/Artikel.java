package shop;

import expections.PreisIstNullExpection;

public class Artikel implements DatenArtikel {
    private String bezeichnung;
    private double preis;

    public Artikel (String bezeichnung, double preis) throws PreisIstNullExpection {
        if (preis  == 0|| bezeichnung == null ){
            throw new PreisIstNullExpection ();
        }
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }


    @Override
    public String bezeichnung() {
        return this.bezeichnung;
    }

    @Override
    public double preis() {
        return this.preis;
    }
}
