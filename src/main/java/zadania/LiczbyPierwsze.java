package zadania;

import static zadania.MathUtils.czyPierwsza;

public class LiczbyPierwsze {
    public static void main(String[] args) {
//        Ciagi status = new Ciagi();
//        System.out.print( status.stworzCiag(5, 4, 8));

//        System.out.println(czyPierwsza(5));
//        System.out.println(czyPierwsza(789555));
        int []tablicaLiczbPierwszych = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        SprawdzatorLiczbPierwszych sprawdzator = new SprawdzatorLiczbPierwszych(tablicaLiczbPierwszych);
        System.out.println(sprawdzator.czyPierwsza(13));

        System.out.println(sprawdzator.czyPierwsza(98));


    }
}
