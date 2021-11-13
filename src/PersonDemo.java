public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Max", "Mustermann", 180, (byte)4 );
        Person p2 = new Person("Mann", "Mustermax", 178, (byte)1 );
        Person p3 = new Person("Muster", "Mannmax", 165, (byte)3 );


        p1.printPerson(80);
        System.out.printf("\n");
        p2.printPerson(94);
        System.out.printf("\n");
        p3.printPerson(60);

    }
}
