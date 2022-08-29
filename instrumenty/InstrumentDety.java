package instrumenty;

abstract public class InstrumentDety {
    private int indeks;
    private String nazwa;
    private String producent;
    private int cena;
    private static int nextId = 0;

    public InstrumentDety(String nazwa, String producent, int cena) {
        this.indeks = InstrumentDety.nextId;
        this.nazwa = nazwa;
        this.producent = producent;
        this.cena = cena;

        InstrumentDety.nextId++;
    }

    abstract public void info();

    public static int ileObiektowStworzono(){
        return nextId;
    }

    public int getIndeks() {
        return indeks;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
