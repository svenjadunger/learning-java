public class Seminar {
    private String name;
    private Student[] participants;
    private String lecturer;
    private int maxParticipants; // maximale Anzahl der Teilnehmer
    private int currentParticipants; // aktuelle Anzahl der Teilnehmer


// construktor
public Seminar(String name, String lecturer, int maxParticipants) {
    this.name = name;
    this.lecturer = lecturer;
    this.maxParticipants = maxParticipants;
    this.participants = new Student[maxParticipants];
    this.currentParticipants = 0; // keine Teilnehmer am Anfang
}

 // Getter und Setter für name
 public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

// Getter und Setter für lecturer
public String getLecturer() {
    return lecturer;
}

public void setLecturer(String lecturer) {
    this.lecturer = lecturer;
}

// Getter und Setter für participants
public Student[] getParticipants() {
    return participants;
}

public void setParticipants(Student[] participants) {
    this.participants = participants;
}



// Methode zum Hinzufügen eines Teilnehmers
public boolean addParticipant(Student student) {
    if (currentParticipants < maxParticipants) {
        participants[currentParticipants] = student;
        currentParticipants++;
        return true;
    } else {
        System.out.println("Das Seminar ist voll.");
        return false;
    }
}



public void printSeminar(){
    String fullData = name + " " + lecturer + participants;
    System.out.println("Infos über Studierenden: ");
    System.out.println("Name: " + name);
    System.out.println("Lecturer " + lecturer);
    System.out.println("Participants: " + participants);
    for (int i = 0; i < currentParticipants; i++) {
        System.out.println(participants[i]);
    }
}

}