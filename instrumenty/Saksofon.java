package instrumenty;

public class Saksofon extends InstrumentDetyDrewniany implements Reklama {
    private String rodzajCzary;

    public Saksofon(String nazwa, String producent, int cena, InstrumentDetyDrewnianyTyp typ, String ustnik, String stroik, String rodzajCzary) {
        super(nazwa, producent, cena, typ, ustnik, stroik);
        this.rodzajCzary = rodzajCzary;
    }

    @Override
    public void info() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("\nSAKSOFON\n********************\nIndeks: ")
                .append(getIndeks())
                .append("\nNazwa: ")
                .append(getNazwa())
                .append("\nProducent: ")
                .append(getProducent())
                .append("\nCena: ")
                .append(getCena())
                .append(" zł\nTyp: ")
                .append(getTyp())
                .append("\nUstnik: ")
                .append(getUstnik())
                .append("\nStroik: ")
                .append(getStroik())
                .append("\nRodzaj czary: ")
                .append(getRodzajCzary())
                .append("\n********************");

        System.out.println(tmp.toString());
    }

    public String getRodzajCzary() {
        return rodzajCzary;
    }

    public void setRodzajCzary(String rodzajCzary) {
        this.rodzajCzary = rodzajCzary;
    }

    @Override
    public String getReklama(String param) {
        return "Saksofon " + getNazwa() + " jest " + param + "!!!!";
    }
}
