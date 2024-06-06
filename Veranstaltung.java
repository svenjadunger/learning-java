public class Veranstaltung {
    private String name;
    private Dozent dozent;
    private Student[] teilnehmer;
    private int currentTeilnehmer;
    private static final int MAX_KAPAZITAET = 40;

    // Konstruktor
    public Veranstaltung(String name) {
        this.name = name;
        this.teilnehmer = new Student[MAX_KAPAZITAET]; 
        this.currentTeilnehmer = 0; 
    }

    // Methode zur Rückgabe der maximalen Kapazität
    public int getKapazitaet() {
        return MAX_KAPAZITAET;
    }

    // Getter
    public String getName() {
        return name;
    }

    public Dozent getDozent() {
        return dozent;
    }

    public Student[] getTeilnehmer() {
        return teilnehmer;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDozent(Dozent dozent) {
        this.dozent = dozent;
    }

    public void setTeilnehmer(Student[] teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    // Methode zum Einschreiben eines Studenten
    public boolean belege(Student student) {
        if (currentTeilnehmer < MAX_KAPAZITAET) {
            teilnehmer[currentTeilnehmer] = student;
            currentTeilnehmer++;
            return true;
        } else {
            System.out.println("Das Seminar ist voll.");
            return false;
        }
    }

    // Methode zur Ausgabe der Veranstaltungsdetails
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Dozent: " + dozent);
        System.out.println("Teilnehmer:");
        for (int i = 0; i < currentTeilnehmer; i++) {
            System.out.println(teilnehmer[i]);
        }
    }
}
