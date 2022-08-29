package instrumenty;

public class Klarnet extends InstrumentDetyDrewniany {
    private String rodzajMechaniki;

    public Klarnet(String nazwa, String producent, int cena, InstrumentDetyDrewnianyTyp typ, String ustnik, String stroik, String rodzajMechaniki) {
        super(nazwa, producent, cena, typ, ustnik, stroik);
        this.rodzajMechaniki = rodzajMechaniki;
    }

    @Override
    public void info() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("\nKLARNET\n********************\nIndeks: ")
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
                .append("\nRodzaj mechaniki: ")
                .append(getRodzajMechaniki())
                .append("\n********************");

        System.out.println(tmp.toString());
    }

    public String getRodzajMechaniki() {
        return rodzajMechaniki;
    }

    public void setRodzajMechaniki(String rodzajMechaniki) {
        this.rodzajMechaniki = rodzajMechaniki;
    }
}
