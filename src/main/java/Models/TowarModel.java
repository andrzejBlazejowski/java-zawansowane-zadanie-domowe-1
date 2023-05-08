package Models;

/**
 *
 * @author andrz
 */
public class TowarModel {
    private static int nextId = 1;
    private int id;
    private String nazwa;
    private double cenaNetto;
    private double stawkaVAT;
    private int ilosc;

    public TowarModel(String nazwa, double cenaNetto, double stawkaVAT, int ilosc) {
        this.id = nextId++;
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.stawkaVAT = stawkaVAT;
        this.ilosc = ilosc;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public double getStawkaVAT() {
        return stawkaVAT;
    }

    public void setStawkaVAT(double stawkaVAT) {
        this.stawkaVAT = stawkaVAT;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}