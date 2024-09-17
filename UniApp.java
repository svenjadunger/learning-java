

public class UniApp {
    public static void main(String[] args) {
        // Student-
        Student svenja = new Student("Svenja", "Dunger ", 12345, " Informatik");

        svenja.kursBelegen("Prog1");
        svenja.setAlter(17);

        // Raum
        Raum raum = new Raum("H101", 30);

        // Dozent
        Dozent martin = new Dozent("Martin", "GSE");
        martin.setFachbereich("Prog-Tutorium");

        
        System.out.println(svenja);
        System.out.println(svenja.getAllData());

        
        // for(int i = 0; i < svenja.belegteKurse.length; i++){
        //     if (svenja.belegteKurse[i] != null) {
        //         System.out.println(svenja.belegteKurse[i]);
        //     }
        // }

        
        System.out.println("Dozent Vorname: " + martin.getVorname());
        // System.out.println("Neuer Fachbereich: " + martin.getFachbereich());

        
        System.out.println("Raum: " + raum.getRaumNummer());
    }

    // Dozenz profWider = new Dozent("Arif Wieder","GSE");
    //     profWider.printAllData();
    //    System.out.println(profWider.telefonNummmer);
    //    System.out.println(Dozent.anzahlDozenten);
    //     Dozent profMajuntke = new Dozent("Verena Majuntke", "Prog");
    //     profMajuntke.printAllData();
    //     System.out.println(Dozent.anzahlDozenten);
    
}

