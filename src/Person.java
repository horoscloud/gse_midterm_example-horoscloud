public class Person {

    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.koerpergroesse = koerpergroesse;
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String getVorname() {return vorname;}

    public String getNachname() {return nachname;}

    public int getKoerpergroesse() {return koerpergroesse;}
    public void setKoerpergroesse(int koerpergroesse) {this.koerpergroesse = koerpergroesse;}

    public String getAktivitaetslevel() {
        switch (aktivitaetslevel){
            case 1: return "Couch Potato";
            case 2: return "Gelegenheitssportler";
            case 3: return "Sportler";
            case 4: return "Profisportler";
            default: return "Fehlerhafte Eingabe!";
        }
    }
    public void setAktivitaetslevel(byte aktivitaetslevel) {this.aktivitaetslevel = aktivitaetslevel;}


    public String rechneBMI(int gewicht){

        double bmi = gewicht / (((double)getKoerpergroesse() / 100) * ((double)getKoerpergroesse() / 100));

        if(bmi <= 18.5)
            return "Untergewicht";
        if(bmi > 18.5 && bmi <= 25)
            return "Normalgewicht";
        if(bmi > 25 && bmi <= 30)
            return "Übergewicht";
        if(bmi > 30)
            return "Adipositas";

        return "BMI konnte nicht berechnet werden!";
    }

    public void printPerson(int gewicht){
        System.out.printf(getVorname() + " " + getNachname() + ", " + getAktivitaetslevel() + ", " + rechneBMI(gewicht));
    }
}


