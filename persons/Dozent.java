public class Dozent {
    private String name;
    private int age;
    private String fachbereich;
    public String[] lessons = new String[10];

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
}

