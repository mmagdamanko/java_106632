// Wczytaj z klawiatury kilka parametrów. Wyświetl je na ekran.
// Niech program pyta się o parametry dopóki użytkownik nie wpisze tekstu kończącego się literami "end".
// Spójrz na metody klasy String - aby znaleźć tą która to ułatwi.

import java.util.*;

public class StrEnd
{

    public static void main(String[] args)
    {
        String wprowadzonyTekst;

        System.out.println();
        System.out.println("Program zakończy wczytywanie znaków gdy na końcu wpisywanego tekstu pojawi sie 'end'");

        Scanner odczyty = new Scanner(System.in);
        do
        {
            System.out.println("Wprowadz ciąg znaków: ");
            wprowadzonyTekst = odczyty.nextLine();
            wprowadzonyTekst = wprowadzonyTekst.toLowerCase();
        } while (!wprowadzonyTekst.endsWith("end"));

        System.out.println("Koniec");
    }

}
