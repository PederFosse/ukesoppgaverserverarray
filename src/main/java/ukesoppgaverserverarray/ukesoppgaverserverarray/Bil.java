package ukesoppgaverserverarray.ukesoppgaverserverarray;

public class Bil {
    private String personnr;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String merke;
    private String bilType;

    public Bil(String personnr, String navn, String adresse, String kjennetegn, String merke, String bilType) {
        this.personnr = personnr;
        this.navn = navn;
        this.adresse = adresse;
        this.kjennetegn = kjennetegn;
        this.merke = merke;
        this.bilType = bilType;
    }

    public Bil() {}

    public String getPersonnr() {
        return personnr;
    }

    public void setPersonnr(String personnr) {
        this.personnr = personnr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getbilType() {
        return bilType;
    }

    public void setbilType(String bilType) {
        this.bilType = bilType;
    }

    public String toString() {
        return merke + " med kjennetegn " + kjennetegn;
    }
}
