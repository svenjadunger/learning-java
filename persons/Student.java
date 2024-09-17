public class Student {
    //private, weil nur diese Klasse kann drauf zugreifen, deshalb braucht man get und set
    private String vorname;
    private String nachname;
    private int alter;
    private int matrikelNr;
    private String studienGang;
    private int semester;
    private String email;
    private int tele;
    public String[] belegteKurse = new String[10];

// getClasses ist meine funktion anstelle der printStudent
    private String getClasses(String[]belegteKurse){
        String classes = "";
        for(String belegterKurs : belegteKurse){
            if(belegterKurs != null){
                classes += belegterKurs + ", ";
            }
        
        }
        return classes;
    }

    public Student(String vorname, String nachname, int matrikelNr, String studienGang){ //Construktor um neue Ojekte zu erstellen mit Eigenschaften
        this.vorname = vorname;
        this.nachname= nachname;
        this.matrikelNr = matrikelNr;
        this.studienGang = studienGang;
        // this.alter = 0;
    }

    public Student(String vorname, String nachname){ //Construktor um neue Ojekte zu erstellen mit Eigenschaften
        this.vorname = vorname;
        this.nachname= nachname;
        
    }



public int getSemester(){
    return semester;
}



    //Namen ausgeben
public String getVorname(){
    return vorname;
} 

public String getAllData(){
    String fullData = vorname + " " + nachname + alter + matrikelNr + studienGang;
    System.out.println("Infos über Studierenden: ");
    System.out.println("Matrikelnr: " + matrikelNr);
    System.out.println("Alter " + alter);
    System.out.println("Studiengang: " + studienGang);
    System.out.println("Belegte Kurse : " + getClasses(belegteKurse));
    return fullData;
}
//public methode von überall aufrufen, private nur von der klasse aufrufen
public void setVorname(String vorname){
    this.vorname = vorname;
}

public void setMatrikelNr(int matrikelNr){
    this.matrikelNr = matrikelNr;
}

public void setStudiengang(String studienGang){
    this.studienGang = studienGang;
}

public int getAlter(){
    return alter;
}

public int getMatrikelNr(){
    return matrikelNr;
}

public String getStudienGang(){
    return studienGang;
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


