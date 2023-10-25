public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Kursus k1 = new Kursus();
        //System.out.println(k1);

        Kursus k2 = new Kursus(1,"Programmering",30,"Mandag","9:00");
        //System.out.println(k2);

        Kursus k3 = new Kursus(2,"Systemudvikling",20,"Tirsdag","9:00");
        //System.out.println(k3);

        /*k2.tilfoejStuderende("Søren");
        System.out.println(k2);

        k2.tilfoejStuderende("Morten");
        System.out.println(k2);*/

        //udskrivKursus(k2);

        //Studerende s1 = new Studerende();
        //System.out.println(s1);

        Studerende s2 = new Studerende(1,"Søren","Sørensen","Skovvej 1", "12345678");
        //System.out.println(s2);

        Studerende s3 = new Studerende(2, "Morten", "Mortensen","Æblevej 1" , "87654321");
        //System.out.println(s3);

        k2.tilfoejStuderende(s2);
        k2.tilfoejStuderende(s3);
        System.out.println();
        udskrivKursus(k2);

        System.out.println();
        k2.frameld(2);
        udskrivKursus(k2);
        //System.out.println(k3);
    }

    public static void udskrivKursus(Kursus k) {
        System.out.println(k);
        Studerende[] a = k.getDeltagere();
        int antal = k.getAntalDeltagere();
        for (int i = 0; i < antal; i++)
            System.out.println(a[i]);
      }
}