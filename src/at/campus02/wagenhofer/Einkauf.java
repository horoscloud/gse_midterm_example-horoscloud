package at.campus02.wagenhofer;

public class Einkauf {

    private String artikelname;
    private double preis;

    public Einkauf(String artikelname, double preis) {
        this.artikelname = artikelname;
        this.preis = preis;
    }

    public String getArtikelname() {return artikelname;}

    public double getPreis() {return preis;}

    @Override
    public String toString() {
        return "Einkauf{" +
                "artikelname='" + artikelname + '\'' +
                ", preis=" + preis +
                '}';
    }
}
