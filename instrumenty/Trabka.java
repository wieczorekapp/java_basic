package instrumenty;

public class Trabka extends InstrumentDetyBlaszany implements Reklama {
    private String powloka;

    public Trabka(String nazwa, String producent, int cena, InstrumentDetyBlaszanyTyp typ, String ustnik, String powloka) {
        super(nazwa, producent, cena, typ, ustnik);
        this.powloka = powloka;
    }

    @Override
    public void info() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("\nTRĄBKA\n********************\nIndeks: ")
                .append(getIndeks())
                .append("\nNazwa: ")
                .append(getNazwa())
                .append("\nProducent: ")
                .append(getProducent())
                .append("\nCena: ")
                .append(getCena())
                .append("\nTyp: ")
                .append(getTyp())
                .append(" zł\nUstnik: ")
                .append(getUstnik())
                .append("\nRodzaj powłoki: ")
                .append(getPowloka())
                .append("\n********************");

        System.out.println(tmp.toString());

    }

    public String getPowloka() {
        return powloka;
    }

    public void setPowloka(String powloka) {
        this.powloka = powloka;
    }

    @Override
    public String getReklama(String param) {
        return "Trąbka " + getNazwa() + " jest " + param + "!!!!";
    }
}
