package sklep;

import instrumenty.*;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static void header() {
        System.out.println("******************************");
        System.out.println("*       SKLEP MUZYCZNY       *");
        System.out.println("******************************");
        help();
    }

    private static void footer() {
        System.out.println("\n******************************");
        System.out.println("*          KONIEC            *");
        System.out.println("******************************\n");
    }

    private static void help() {
        System.out.println("\n1 - nowy instrument");
        System.out.println("2 - usuń wskazany instrument po indeksie");
        System.out.println("3 - wyświetl wszystkie instrumenty");
        System.out.println("4 - wyświtl instrumenty wybranej kategorii");
        System.out.println("5 - wyszukaj po nazwie instrument");
        System.out.println("6 - wyświetl reklamy");
        System.out.println("7 - wyświetl pomoc");
        System.out.println("8 - liczba unikatowych produktów w historii sklepu");
        System.out.println("9 - wyjście z programu");
        System.out.println("\nDomyślnie lub w przypadku nieznanej opcji wykona się operacja 7\n");
    }

    private static InstrumentDetyDrewnianyTyp chooseDrewnianyTyp(String x){
        InstrumentDetyDrewnianyTyp typ;

        switch (x) {
            case "1":
                typ = InstrumentDetyDrewnianyTyp.SOPRAN;
                break;
            case "2":
                typ = InstrumentDetyDrewnianyTyp.ALT;
                break;
            case "3":
                typ = InstrumentDetyDrewnianyTyp.TENOR;
                break;
            case "4":
                typ = InstrumentDetyDrewnianyTyp.BARYTON;
                break;
            default:
                typ = InstrumentDetyDrewnianyTyp.ALT;
                break;
        }

        return typ;
    }

    private static InstrumentDetyBlaszanyTyp chooseBlaszanyTyp(String x){
        InstrumentDetyBlaszanyTyp typ;

        switch (x) {
            case "1":
                typ = InstrumentDetyBlaszanyTyp.ALT;
                break;
            case "2":
                typ = InstrumentDetyBlaszanyTyp.TENOR;
                break;
            case "3":
                typ = InstrumentDetyBlaszanyTyp.BARYTON;
                break;
            case "4":
                typ = InstrumentDetyBlaszanyTyp.BAS;
                break;
            default:
                typ = InstrumentDetyBlaszanyTyp.BARYTON;
                break;
        }

        return typ;

    }

    private static void newInstrument(LinkedList<InstrumentDety> appMemory){
        Scanner console= new Scanner(System.in);
        System.out.println("\n1 - saksofon\n2 - klarnet\n3 - trąbka\n4 - puzon\n");
        System.out.print("Wybierz typ: ");
        String tmp = console.nextLine();

        String typ_s;

        String nazwa;
        String producent;
        int cena;

        switch (tmp){
            case "1":
                {
                    InstrumentDetyDrewnianyTyp typ;
                    String ustnik;
                    String stroik;
                    String rodzajCzary;

                    System.out.print("Podaj nazwę: ");
                    nazwa = console.nextLine();

                    System.out.print("Podaj producenta: ");
                    producent = console.nextLine();

                    System.out.print("Podaj cenę[w zł bez groszy]: ");
                    try {
                        cena = console.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Błędna wartość cenny! Koniec wprowadzania");
                        return;
                    }

                    console.nextLine();
                    System.out.print("Podaj typ instrumentu: 1 - sopran 2 - alt, 3 - tenor, 4 - baryton [domyślnie alt]: ");
                    typ_s = console.nextLine();
                    typ = chooseDrewnianyTyp(typ_s);

                    System.out.print("Podaj rodzaj ustnika: ");
                    ustnik = console.nextLine();

                    System.out.print("Podaj rodzaj stroika: ");
                    stroik = console.nextLine();


                    System.out.print("Podaj rodzaj czary: ");
                    rodzajCzary = console.nextLine();


                    appMemory.add(new Saksofon(nazwa, producent, cena, typ, ustnik, stroik, rodzajCzary));

                }
                break;
            case "2":
                {
                    InstrumentDetyDrewnianyTyp typ;
                    String ustnik;
                    String stroik;
                    String rodzajMechaniki;

                    System.out.print("Podaj nazwę: ");
                    nazwa = console.nextLine();

                    System.out.print("Podaj producenta: ");
                    producent = console.nextLine();

                    System.out.print("Podaj cenę[w zł bez groszy]: ");
                    try {
                        cena = console.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Błędna wartość cenny! Koniec wprowadzania");
                        return;
                    }

                    console.nextLine();
                    System.out.print("Podaj typ instrumentu: 1 - sopran 2 - alt, 3 - tenor, 4 - baryton [domyślnie alt]: ");
                    typ_s = console.nextLine();
                    typ = chooseDrewnianyTyp(typ_s);

                    System.out.print("Podaj rodzaj ustnika: ");
                    ustnik = console.nextLine();

                    System.out.print("Podaj rodzaj stroika: ");
                    stroik = console.nextLine();


                    System.out.print("Podaj rodzaj mechaniki: ");
                    rodzajMechaniki = console.nextLine();


                    appMemory.add(new Klarnet(nazwa, producent, cena, typ, ustnik, stroik, rodzajMechaniki));

                }
                break;
            case "3":
                {
                    InstrumentDetyBlaszanyTyp typ;
                    String ustnik;
                    String powloka;

                    System.out.print("Podaj nazwę: ");
                    nazwa = console.nextLine();

                    System.out.print("Podaj producenta: ");
                    producent = console.nextLine();

                    System.out.print("Podaj cenę[w zł bez groszy]: ");
                    try {
                        cena = console.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Błędna wartość cenny! Koniec wprowadzania");
                        return;
                    }

                    console.nextLine();
                    System.out.print("Podaj typ instrumentu: 1 - alt 2 - tenor, 3 - baryton, 4 - bas [domyślnie baryton]: ");
                    typ_s = console.nextLine();
                    typ = chooseBlaszanyTyp(typ_s);

                    System.out.print("Podaj rodzaj ustnika: ");
                    ustnik = console.nextLine();

                    System.out.print("Podaj rodzaj powłoki: ");
                    powloka = console.nextLine();


                    appMemory.add(new Trabka(nazwa, producent, cena, typ, ustnik, powloka));


                }
                break;
            case "4":
                {
                    InstrumentDetyBlaszanyTyp typ;
                    String ustnik;
                    String wentyle;

                    System.out.print("Podaj nazwę: ");
                    nazwa = console.nextLine();

                    System.out.print("Podaj producenta: ");
                    producent = console.nextLine();

                    System.out.print("Podaj cenę[w zł bez groszy]: ");
                    try {
                        cena = console.nextInt();
                    } catch (InputMismatchException e){
                        System.out.println("Błędna wartość cenny! Koniec wprowadzania");
                        return;
                    }

                    console.nextLine();
                    System.out.print("Podaj typ instrumentu: 1 - alt 2 - tenor, 3 - baryton, 4 - bas [domyślnie baryton]: ");
                    typ_s = console.nextLine();
                    typ = chooseBlaszanyTyp(typ_s);

                    System.out.print("Podaj rodzaj ustnika: ");
                    ustnik = console.nextLine();

                    System.out.print("Podaj rodzaj wentyli: ");
                    wentyle = console.nextLine();


                    appMemory.add(new Puzon(nazwa, producent, cena, typ, ustnik, wentyle));

                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór!!!");
        }
    }

    private static void deleteInstrument(LinkedList<InstrumentDety> appMemory){
        Scanner console= new Scanner(System.in);
        System.out.print("\nPodaj indeks do usunięcia: ");
        int tmp;

        try{
            tmp = console.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Indeks musi być liczbą naturalną!!!");
            return;
        }

        for(InstrumentDety x: appMemory){
            if(x.getIndeks() == tmp){
                appMemory.remove(x);
                System.out.println("Obiekt został usunięty");
                return;
            }
        }
        System.out.println("Nie ma takiego indeksu!!!");
    }

    private static void showAllInstrument(LinkedList<InstrumentDety> appMemory){
        for(InstrumentDety x: appMemory){
            x.info();
        }
    }

    private static void showInstrumentByType(LinkedList<InstrumentDety> appMemory){
        Scanner console= new Scanner(System.in);
        System.out.println("\n1 - saksofony\n2 - klarnety\n3 - trąbki\n4 - puzony\n5 - drewniane\n6 - blaszane\ninna - wszystkie\n");
        System.out.print("Wybierz typ: ");
        String tmp = console.nextLine();

        switch (tmp) {
            case "1":
                for(InstrumentDety x: appMemory){
                    if(x instanceof Saksofon){
                        x.info();
                    }
                }
                break;
            case "2":
                for(InstrumentDety x: appMemory){
                    if(x instanceof Klarnet){
                        x.info();
                    }
                }
                break;
            case "3":
                for(InstrumentDety x: appMemory){
                    if(x instanceof Trabka){
                        x.info();
                    }
                }
                break;
            case "4":
                for(InstrumentDety x: appMemory){
                    if(x instanceof Puzon){
                        x.info();
                    }
                }
                break;
            case "5":
                for(InstrumentDety x: appMemory){
                    if(x instanceof InstrumentDetyDrewniany){
                        x.info();
                    }
                }
                break;
            case "6":
                for(InstrumentDety x: appMemory){
                    if(x instanceof InstrumentDetyBlaszany){
                        x.info();
                    }
                }
                break;
            default:
                showAllInstrument(appMemory);

        }
    }

    private static void showInstrumentByName(LinkedList<InstrumentDety> appMemory){
        Scanner console= new Scanner(System.in);
        System.out.print("\nPodaj nazwę: ");
        String tmp = console.nextLine();

        for(InstrumentDety x: appMemory){
            if(x.getNazwa().contains(tmp)){
                x.info();
            }
        }

    }

    private static void showcase(LinkedList<InstrumentDety> appMemory){
        for(InstrumentDety x: appMemory){
            if(x instanceof Reklama){
                System.out.println(((Reklama) x).getReklama("wspaniały"));
            }
        }
    }

    private static void numberProductsInShop(){
        System.out.println("Liczba produktów w sklepie: " + InstrumentDety.ileObiektowStworzono());
    }

    public static void main(String[] args) {
	// write your code here
        Scanner console= new Scanner(System.in); // obiekt od odczytywania danych wejściowych
        LinkedList<InstrumentDety> appMemory = new LinkedList<>(); // pamięć na wszystkie obiekty
        boolean mainLoop = true; // zmienna kontrolująca działanie programu w pętli
        String options; // wybór opcji w głównym menu

        header(); // wyświetlenie powitania i możliwych poleceń
        System.out.println("=============================================");

        // TESTOWANIE
        appMemory.add(new Saksofon("YAS280", "Yamaha", 4800, InstrumentDetyDrewnianyTyp.BARYTON, "4C", "miękki", "bronz"));
        appMemory.add(new Trabka("TR500", "Admas", 8000, InstrumentDetyBlaszanyTyp.ALT, "50mm", "nikiel"));
        appMemory.add(new Klarnet("CL500", "Selmer", 5000, InstrumentDetyDrewnianyTyp.ALT, "4C", "miękki", "niemiecka"));
        appMemory.add(new Puzon("880T", "Bah", 10000, InstrumentDetyBlaszanyTyp.BAS, "80mm", "klasyczne"));
        appMemory.add(new Saksofon("YTS480", "Yamaha", 6800, InstrumentDetyDrewnianyTyp.TENOR, "5C", "półtwardy", "mosiądz"));


        while(mainLoop) {
            System.out.print("\nWybierz opcję: ");
            options = console.nextLine();

            switch (options) {
                case "1":
                    newInstrument(appMemory);
                    System.out.println("=============================================");
                    break;
                case "2":
                    deleteInstrument(appMemory);
                    System.out.println("=============================================");
                    break;
                case "3":
                    showAllInstrument(appMemory);
                    System.out.println("=============================================");
                    break;
                case "4":
                    showInstrumentByType(appMemory);
                    System.out.println("=============================================");
                    break;
                case "5":
                    showInstrumentByName(appMemory);
                    System.out.println("=============================================");
                    break;
                case "6":
                    showcase(appMemory);
                    System.out.println("=============================================");
                    break;
                case "7":
                    help();
                    System.out.println("=============================================");
                    break;
                case "8":
                    numberProductsInShop();
                    System.out.println("=============================================");
                    break;
                case "9":
                    mainLoop = false;
                    break;
                default:
                    help();
                    System.out.println("=============================================");
            }
        }

        console.close();
        footer();
    }

}
