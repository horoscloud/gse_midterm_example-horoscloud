package at.campus02.wagenhofer;

import java.util.ArrayList;
import java.util.HashSet;

public class EinkaufslisteApp {

    public static void main(String[] args) {

        ArrayList<Einkauf> einkaufsliste = new ArrayList<>();
        einkaufsliste.add(new Einkauf("Käse", 1.29));
        einkaufsliste.add(new Einkauf("Fleisch", 3.2));
        einkaufsliste.add(new Einkauf("Milch", 1.69));
        einkaufsliste.add(new Einkauf("Eier", 2.89));
        einkaufsliste.add(new Einkauf("Brot", 3.2));
        einkaufsliste.add(new Einkauf("Wurst", 0.98));

        HashSet<Einkauf> unique = unique(einkaufsliste);


        System.out.println("Liste-Summe: " + sum(einkaufsliste));
        System.out.println("Alle Items: " + unique);
        System.out.println("HashSet-Summe: " + sum(unique));
    }

    public static double sum(ArrayList<Einkauf> einkaufsliste){

        double result = 0;

        for (Einkauf einkauf : einkaufsliste) {
            result += einkauf.getPreis();
        }
        return result;
    }

    public static double sum(HashSet<Einkauf> einkaufsliste){

        double result = 0;

        for (Einkauf einkauf : einkaufsliste) {
            result += einkauf.getPreis();
        }
        return result;
    }

    public static HashSet<Einkauf> unique(ArrayList<Einkauf> einkaufsliste){
        HashSet<Einkauf> sum = new HashSet<>();
        sum.addAll(einkaufsliste);

        return sum;
    }
}
