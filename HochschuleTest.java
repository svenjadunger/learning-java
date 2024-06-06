public class HochschuleTest {
    public static void main(String[] args) {
        Student tala = new Student("Tala", "Karoum");
        Student diana = new Student("Diana", "Mitrachow");
        tala.setAlter(21);
        diana.setAlter(24);

        System.out.println(tala);
        System.out.println(diana);


        Veranstaltung rechnernetze = new Veranstaltung("Rechnernetze");
      



        //Array von Student-Objekten
        Student[] studenten = new Student[6];

        studenten[0] = new Student("Svenja", "Dunger", 12345, "Wirtschaftsinformatik");
        studenten[1] = new Student("Tala", "Karoum", 12346, "Wirtschaftsinformatik");
        studenten[2] = new Student("Diana", "M", 12347, "Wirtschaftsinformatik");
        studenten[3] = new Student("John", "Doe", 12348, "Elektrotechnik");
        studenten[4] = new Student("Jane", "Smith", 12349, "Medizin");
        studenten[5] = new Student("Max", "Mustermann", 12350, "BWL");

rechnernetze.belege(tala);
rechnernetze.belege(diana);

        //alle student-objekte ausgeben

        for (Student student : studenten){
            System.out.println(student);
        }

    }
}
