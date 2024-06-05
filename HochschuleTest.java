public class HochschuleTest {
    public static void main(String[] args) {
        Student tala = new Student("Tala", "Karoum");
        Student diana = new Student("Diana", "Mitrachow");
        tala.setAlter(21);
        diana.setAlter(24);

        System.out.println(tala);
        System.out.println(diana);
    }
}
