package instrumenty;

abstract public class InstrumentDetyBlaszany extends InstrumentDety{
    private InstrumentDetyBlaszanyTyp typ;
    private String ustnik;

    public InstrumentDetyBlaszany(String nazwa, String producent, int cena, InstrumentDetyBlaszanyTyp typ, String ustnik) {
        super(nazwa, producent, cena);
        this.typ = typ;
        this.ustnik = ustnik;
    }

    public InstrumentDetyBlaszanyTyp getTyp() {
        return typ;
    }

    public void setTyp(InstrumentDetyBlaszanyTyp typ) {
        this.typ = typ;
    }

    public String getUstnik() {
        return ustnik;
    }

    public void setUstnik(String ustnik) {
        this.ustnik = ustnik;
    }
}
