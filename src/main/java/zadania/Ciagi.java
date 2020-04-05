package zadania;

import java.util.ArrayList;
import java.util.List;

public class Ciagi {
    public static void main(String[] args) {
        System.out.println(stworzCiag(5, 1, 3));


    }

    public static List<Integer> stworzCiag(int dlugosc, int pierwszy, int roznica){
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i =pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i *roznica);
        }
    return ciag;
    }


}
