public class Main {
    
    public static void main(String[] args)
    {

        try {
            System.out.println("wykonam się bo jestem przed wyjątkiem (try)"); // Instrukcje przed wyjątkiem wykonają się
            System.out.println(5 / 0);
            System.out.println("Nie wykonam się, gdy zajdzie wyjatek "); // Instrukcje po wystąpieniu wyjątku nie zostaną wykonane
        }
        // java.lang.ArithmeticException - klasa zawierająca wyjątki
        catch (ArithmeticException ex) // Nie musimy znać dokładnej nazwy wyjątku wystarczy, że użyjemy Klasy Exception
                                        // Wszystkie wyjątki dziedziczą z superklasy Exception
        {
            System.out.println("\n instrukcja catch");
            System.out.println("\n Powstał wyjątek: " + ex.getMessage());
        }
        finally
        {
            System.out.println("\n Coś co zawsze ZOSTANIE WYWOŁANE (finally)");
        }
            System.out.println("\n cokolwiek");

        // Testowanie stworzonego przez nas wyjątku

        System.out.println("\n Naszy wyjątek - testowanie");
        int a = 10;

        try
        {
            if(a == 10)
                throw new NaszWyjatek("a jest równe 10 - wyjatek");
            System.out.println(5/0); //Nie zostanie wypisane jeżeli w catch nie dodamy instrukcji odpowiedzialnej za
                                    // obsługę tego wyjątku
        }
        catch (NaszWyjatek | ArithmeticException ex) 
        {
            System.out.println(ex.getMessage());;
        }



    }
}

class NaszWyjatek extends Exception
{
    public NaszWyjatek(String string)
    {
        super(string);
    }
}
