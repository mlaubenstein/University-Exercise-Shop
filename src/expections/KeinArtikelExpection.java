package expections;

public class KeinArtikelExpection extends Exception {

    private static final String errMsg = "Keine Artikel im Warenkorb";

    public KeinArtikelExpection(){

        super(errMsg + "!");
    }
}
