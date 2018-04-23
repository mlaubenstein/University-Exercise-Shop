package shop;

public class Warenkorb {
    private int anzahl = 0;
    private Artikel artFeld[];

    public Warenkorb() {
        this.anzahl = 0;
        this.artFeld = new Artikel[100];
    }

    public void add(Artikel a){
        if (a == null)return;
        if (anzahl < 100){
            if (a != null){
                artFeld[anzahl]= a;
                anzahl++;
            }
        }
    }

    public int getAnzahl(){
        return this.anzahl;
    }

    public double getSumme(){
        double summe = 0.0d;
        for (int i = 0; i< getAnzahl (); i++){
            summe = summe +artFeld[i].preis ();
        }
        return summe;
    }

    public void remove(Artikel a) {
        Artikel[] temp = new Artikel[100];
        int tempcounter = 0;

        for (int i = 0; i < getAnzahl(); i++) {
            if (check(artFeld[i], a)) {
                temp[tempcounter] = artFeld[i];
                tempcounter++;
            }
        }
        artFeld = temp;
        anzahl = tempcounter;
    }

    private boolean check(Artikel artFeld, Artikel a) {
        if (artFeld == null ||
                (artFeld.bezeichnung () == a.bezeichnung ()
                        && artFeld.preis () == a.preis ())) {
            return false;
        }
        return true;
    }
}
