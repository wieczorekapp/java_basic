package instrumenty;

abstract public class InstrumentDetyDrewniany extends InstrumentDety{
    private InstrumentDetyDrewnianyTyp typ;
    private String ustnik;
    private String stroik;

    public InstrumentDetyDrewniany(String nazwa, String producent, int cena, InstrumentDetyDrewnianyTyp typ, String ustnik, String stroik) {
        super(nazwa, producent, cena);
        this.typ = typ;
        this.ustnik = ustnik;
        this.stroik = stroik;
    }

    public InstrumentDetyDrewnianyTyp getTyp() {
        return typ;
    }

    public void setTyp(InstrumentDetyDrewnianyTyp typ) {
        this.typ = typ;
    }

    public String getUstnik() {
        return ustnik;
    }

    public void setUstnik(String ustnik) {
        this.ustnik = ustnik;
    }

    public String getStroik() {
        return stroik;
    }

    public void setStroik(String stroik) {
        this.stroik = stroik;
    }
}
