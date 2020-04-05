package Obiekty;

import java.util.ArrayList;
import java.util.List;

public class KlasaTestowa {
    public static void main(String[] args) {
        Animal TablicaZwierzat [] = new Animal[5];
        List<Animal> listaZwierzat = new ArrayList<>();

        Dog reks = new Dog();
        Cat filemon = new Cat();
        Cow mucka = new Cow();
        TablicaZwierzat[0] = new Cat();
        TablicaZwierzat[1] = new Cat();
        TablicaZwierzat[2] = new Cow();
        TablicaZwierzat[3] = new Dog();
        TablicaZwierzat[4] = new Dog();

        listaZwierzat.add(new Dog());
        listaZwierzat.add(new Dog());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cow());
        listaZwierzat.add(new Cat());
        listaZwierzat.add(new Cat());
//        dajGlosyListyZwierzat(listaZwierzat);

//        dajGlosyDlaTablicyZwierzat(TablicaZwierzat);

    }
//    public static void dajGlosyDlaTablicyZwierzat (Animal TablicaZwierzat[]){
//        for (Animal animal:TablicaZwierzat) {
//            animal.makeSound();
//        }
//    }
//    public static void dajGlosyListyZwierzat (List<Animal> listaZwierzat[]){
//        for ( animal:listaZwierzat) {
//            animal.makeSound();
        }


//Zdefiniuj interface Animal z metodą makeSound. Zaimplementuj ten interejsw klasach Cat, Dog and Cow. Utwórz tablicę obiektów zwierząt różnych klas, wypisz wydawane przez nichodgłos