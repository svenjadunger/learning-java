public class Dozent {
    private String name;
    private int age;
    private String fachbereich;
    private long id;
    public String telefonNummer;
    private String emailAdresse;
    private String[] unterrichtetKurse;
    public String[] lessons = new String[10]; //hier ändern, Nicht 10
    public static int anzahlDozenten = 0;// mehrere dozenten beziehen sich auf instanzen, teilen sich; 
    // construktor
    public Dozent(String vorname, String fachbereich){ 
        this.name = vorname;
        this.fachbereich = fachbereich;
    }

    // Get
    public String getVorname(){
        return name;
    }

    // Set methode
    public void setFachbereich(String fachbereich){
        this.fachbereich = fachbereich;
    }

    // Methode für lektionen hinzuf.
    public void giveLessons(String l){
        for(int i=0; i<lessons.length; i++){
            if(lessons[i] == null){
                lessons[i] = l;
                break;
            }
        }
    }
// nicht static, weil wir uns auf ein Objekt beziehen, bei static heißt attribut gehört zu einer instanz der klasse (ein einzelner dozent) bezieht
    public void printAllData(){
        System.out.println("Dozent");
        System.out.println("Name");
        System.out.println("Fachbereich");
        System.out.println("email: " + this.emailAdresse);
    }
}

