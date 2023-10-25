public class Studerende {

    private int stdNr;
    private String fnavn;
    private String enavn;

    private String adresse;

    private String mobil;

    public Studerende() {
    }

    public Studerende(int stdNr, String fnavn, String enavn, String adresse, String mobil) {
        this.stdNr = stdNr;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.adresse = adresse;
        this.mobil = mobil;
    }

    public int getStdNr() {
        return stdNr;
    }

    public void setStdNr(int stdNr) {
        this.stdNr = stdNr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "stdNr=" + stdNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", mobil='" + mobil + '\'' +
                '}';
    }
}
