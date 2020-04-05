package petle;

public class Petle {
    public static void main(String[] args) {


        String napis = "Jestem na dobrej drodze";
        for (int i = napis.length() - 1; i >= 0; i--) {
            System.out.print(napis.charAt(i));
        }


        for (int i = 300; i <= 1000; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }


        }
    }
}