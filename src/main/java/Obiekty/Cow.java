package Obiekty;

public class Cow implements Animal {
    public void dajePleko(){
        // krowy dają mleko
    }
    @Override
    public void makeSound() {
        System.out.println("Muuuuu");

    }
}
