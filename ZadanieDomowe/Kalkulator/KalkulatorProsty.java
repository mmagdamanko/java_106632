import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KalkulatorProsty
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Podaj pierwszą wartość: ");
            int x = Integer.parseInt( br.readLine() );

            System.out.print("Podaj drugą wartość: ");
            int y = Integer.parseInt( br.readLine() );

            System.out.print("Operator: ");
            String op = br.readLine();

            int z;

            if (op.equals("+"))
            {
                z = x + y;
            } else if (op.equals("-"))
            {
                z = x - y;
            } else if (op.equals("*"))
            {
                z = x * y;
            } else if (op.equals("/"))
            {
                z = x / y;
            } else
                {
                throw new java.lang.Error("Podano błędny operator");
                }
            System.out.println("Wynik: " + z);

        }
        catch (IOException w)
        {
            w.printStackTrace();
        }

    }
}

