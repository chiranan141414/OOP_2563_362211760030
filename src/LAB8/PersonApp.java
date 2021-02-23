package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects

        Person p1 = new Person();
        p1.setName("Chiranan Chanrod");
        p1.setAge(34);

        Person p2 = new Teacher("RUTS");
        p2.setName("Chiranan Chanrod");
        p2.setAge(37);

        Person p3 = new Doctor("Chiranan Chanrod");
        p3.setName("chiranan");

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}