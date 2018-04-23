package expections;

public class PreisIstNullExpection extends Exception {
    private static final String errMsg = "Ein übergebener Artikelwert ist 0";

    public PreisIstNullExpection()
    {
        super(errMsg + "!");
    }

}
