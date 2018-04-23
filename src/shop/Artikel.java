package shop;

public class Artikel implements DatenArtikel {
    private String bezeichnung;
    private double preis;

    public Artikel (String bezeichnung, double preis){
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
