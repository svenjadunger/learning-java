public class Professor extends Dozent{
    private String habilitationsThema;




    public Professor(String name, String fachbereich, String habilitationsThema){
        super(name, fachbereich);

        this.habilitationsThema = habilitationsThema;
    }
}
