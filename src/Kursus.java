import java.util.Arrays;

public class Kursus {

    private int kursusNr;
    private String kursusNavn;
    private int antalEcts;

    private String ugeDag;

    private String tid;

    //private String[] deltagere;

    private Studerende[] deltagere;

    private int antalDeltagere;

    /*public Kursus() {
        antalDeltagere=0;  //Fra start er der 0 deltagere.
        deltagere=new String[40]; // Der er maks. plads til 40 deltagere på et kursus
    }*/

    public Kursus() {
        antalDeltagere=0;  //Fra start er der 0 deltagere.
        deltagere=new Studerende[40]; // Der er maks. plads til 40 deltagere på et kursus
    }

    public Kursus(int kursusNr, String kursusNavn, int antalEcts, String ugeDag, String tid) {
        this.kursusNr = kursusNr;
        this.kursusNavn = kursusNavn;
        this.antalEcts = antalEcts;
        this.ugeDag = ugeDag;
        this.tid = tid;
        antalDeltagere=0;  //Fra start er der 0 deltagere.
        deltagere=new Studerende[40]; // Der er maks. plads til 40 deltagere på et kursus
    }

    public Studerende[] getDeltagere() {
        return deltagere;
    }

    public void setDeltagere(Studerende[] deltagere) {
        this.deltagere = deltagere;
    }

    public int getAntalDeltagere() {
        return antalDeltagere;
    }

    public void setAntalDeltagere(int antalDeltagere) {
        this.antalDeltagere = antalDeltagere;
    }

    public int getKursusNr() {
        return kursusNr;
    }

    public void setKursusNr(int kursusNr) {
        this.kursusNr = kursusNr;
    }

    public String getKursusNavn() {
        return kursusNavn;
    }

    public void setKursusNavn(String kursusNavn) {
        this.kursusNavn = kursusNavn;
    }

    public int getAntalEcts() {
        return antalEcts;
    }

    public void setAntalEcts(int antalEcts) {
        this.antalEcts = antalEcts;
    }

    public String getUgeDag() {
        return ugeDag;
    }

    public void setUgeDag(String ugeDag) {
        this.ugeDag = ugeDag;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Kursus{" +
                "kursusNr=" + kursusNr +
                ", kursusNavn='" + kursusNavn + '\'' +
                ", antalEcts=" + antalEcts +
                ", ugeDag='" + ugeDag + '\'' +
                ", tid='" + tid + '\'' +
                '}';
    }

    /*public void tilfoejStuderende(String navn){
        deltagere[antalDeltagere] = navn;
        antalDeltagere++;
    }*/

    public void tilfoejStuderende(Studerende s){
        deltagere[antalDeltagere] = s;
        antalDeltagere++;
    }

    public void frameld(int stdnr){
        for (int i = 0; i < antalDeltagere; i++){
            if (stdnr == deltagere[i].getStdNr()){
                for (int j = i; j < antalDeltagere - 1; j++)
                    deltagere[j] = deltagere[j + 1];
            }
            antalDeltagere--;
        }
    }
}
