//Zadanie 6:
//        Sprawdź jak zachowują się wyjątki.
//        1) Stwórz sytuację gdzie rzucane są dwa wyjątki gdzie jeden dziedziczy po drugim:
//        np. przekopiowując kod z laboratorium.
//
//        2) Sprawdź różne konfiguracje i kolejności klauzuli catch.
//        Które z nich są prawidłowe a których java nie pozwoli nam napisać.
//
//        3) Napisz kod rzucający błędem dziedziczącym po RuntimeException
//        (np. NullPointerException lub inny) a następnie podaj przykład jego obsługi.


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String args[])
    {
        try
        {
            new ExceptionExample().readFile();
            System.out.println("To jest tekst");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Brak pliku ! Powód: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println("Problem ogólny WE/WY. Powód: " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("TO złapie każdy wyjątek");
        }
//        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Obsługa kilku wyjątków naraz:" +  e.getMessage());
//        }

        String ptr = null;


        try
        {
            // throws NullPointerException
            // ponieważ ptr = null
            if (ptr.equals("gfg"))
                System.out.print("identyczny");
            else
                System.out.print("różny");
        }
        catch(NullPointerException e)
        {
            System.out.print("Złapano NullPointerException");
        }

    }

    public void readFile() throws IOException {
        FileReader fr = new FileReader("E://file.txt"); //throws FileNotException
        char[] a = new char[50]; //throws IoException
        fr.read(a);
        for(char c: a)
        {
            System.out.println(c);
        }
    }



}
