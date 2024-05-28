public class Student {
    //private, weil nur diese Klasse kann drauf zugreifen, deshalb braucht man get und set
    private String vorname;
    private String nachname;
    private int alter;
    private int matrikelNr;
    private String fachbereich;
    private String adresse;
    private String email;
    private int tele;
    public String[] belegteKurse = new String[10];

    public Student(String vorname, String nachname){ //Construktor um neue Ojekte zu erstellen mit Eigenschaften
        this.vorname = vorname;
        this.nachname= nachname;
        this.alter = 0;
    }

    //Namen ausgeben
public String getVorname(){
    return vorname;
} 

public String getAllData(){
    String fullName = vorname + " " + nachname + alter;
    return fullName;
}
//public methode von überall aufrufen, private nur von der klasse aufrufen
public void setVorname(String vorname){
    this.vorname = vorname;
}


public int getAlter(){
    return alter;
}

public void setAlter(int alter){
    this.alter = alter;
}

    public void kursBelegen(String kursName) {
        //bei Kurs-TN hinzufügen
        //kurs zu belegteKurse hinzufügen
        for(int i=0; i<belegteKurse.length; i++){
            if(belegteKurse[i] == null){
                belegteKurse[i] = kursName;
                break;
            }

        }
    }

}


