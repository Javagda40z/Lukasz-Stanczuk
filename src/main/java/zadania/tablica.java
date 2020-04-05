package zadania;

import javafx.css.Match;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;

public class tablica {
    public static void main(String[] args) {
        int[] tablica = new int[]{1,2,3};
        System.out.println(Arrays.toString(tablica));
       zamienPierwszyITrzeciElement(tablica);
        System.out.println(Arrays.toString(tablica));
        for (int i :tablica);
        Arrays.sort(tablica);
        int minimum = tablica[0];
        int maks = tablica[tablica.length -1];
        System.out.println("minimum "+ + minimum + " maks " + maks);
        System.out.println(NumberUtils.max(tablica));
//        Dla zadanej tablicy intów policz ile jest w niej liczb ujemnych. Jeśli takie występują
//        utwórz nową tablicę, do której przepisze tylko te ujemne liczby


    }
    public static void zamienPierwszyITrzeciElement(int[] tablica) {
        int zmienna = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = zmienna;

    }
}
