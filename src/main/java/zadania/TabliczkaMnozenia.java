package zadania;

public class TabliczkaMnozenia {
    private final int liczba;

    public TabliczkaMnozenia(int liczba) {
        this.liczba = liczba;
    }

    public int getLiczba() {
        return liczba;
    }

    public void wypiszTabliczke() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(liczba + "x" + i + "=" + liczba * i);

        }
    }
}
