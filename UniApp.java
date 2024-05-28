// import persons.Student;

public class UniApp {
    public static void main(String[] args){
        //Student= class Student, neues Objekt erstellen vom Typ Objekt, constructor weiß durch new bescheid
        Student svenja= new Student("svenja", "dunger");

        svenja.kursBelegen("Prog1");
        svenja.getVorname();
        svenja.setVorname("test");
        svenja.getAlter();
        svenja.setAlter(17);
        System.out.println((svenja));
        System.out.println(svenja.getAllData());
        
        // to print array
        for(int i=0; i < svenja.belegteKurse.length; i++){
            System.out.println(svenja.belegteKurse[i]);
        }

        Dozent martin = new Dozent("martin", "GSE");
        System.out.println(martin.getVorname());
        martin.setFachbereich("Prog-Tutorium");
    }
}
