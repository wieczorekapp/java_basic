package instrumenty;

public class Puzon extends InstrumentDetyBlaszany {
    private String wentyle;

    public Puzon(String nazwa, String producent, int cena, InstrumentDetyBlaszanyTyp typ, String ustnik, String wentyle) {
        super(nazwa, producent, cena, typ, ustnik);
        this.wentyle = wentyle;
    }

    @Override
    public void info() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("\nPUZON\n********************\nIndeks: ")
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
                .append("\nRodzaj wentyli: ")
                .append(getWentyle())
                .append("\n********************");

        System.out.println(tmp.toString());
    }

    public String getWentyle() {
        return wentyle;
    }

    public void setWentyle(String wentyle) {
        this.wentyle = wentyle;
    }
}
