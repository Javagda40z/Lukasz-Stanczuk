package zadania;

import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        Liczby dodaj1 = new Liczby();
        System.out.println(dodaj1.dodaj(4, 8));
        System.out.println(dodaj1.dodaj(5,6));

    }
    public int dodaj(int a, int b ){
       return a+b;
    }
    public double dzielenie(double a, double b){
        return a/b;
    }
    public int mnozenie(int a, int b){
        return a*b;
    }
    public int odejmowanie(int a, int b){
        return a-b;
    }
    int []LiczybPierwszych = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};


}
