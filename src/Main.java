import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hejka Świecie!");

        int liczba = 1;

        while (liczba < 4) {
            System.out.println("Jazda z koksem");
            liczba++;
            System.out.println("Koniec");
        }

        for (liczba = 1; liczba < 4; liczba++) {
            System.out.println("Walimy");
        }
        System.out.println("Już nie");

        do System.out.println("Drukujemy");
        while (liczba > 4);

        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        for (Object listaliczb : lista) {
            System.out.println("Liczba " + listaliczb);
        }

    }

}


