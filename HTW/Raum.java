public class Raum {
    private String raumNummer;
    private int kapazität;

    // construktor
    public Raum(String raumNummer, int kapazität) {
        this.raumNummer = raumNummer;
        this.kapazität = kapazität;
    }

    // Getter und Setter
    public String getRaumNummer() {
        return raumNummer;
    }

    public void setRaumNummer(String raumNummer) {
        this.raumNummer = raumNummer;
    }

    public int getKapazität() {
        return kapazität;
    }

    public void setKapazität(int kapazität) {
        this.kapazität = kapazität;
    }
}
