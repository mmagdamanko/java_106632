package ass;

public class MyCal
{
    /**glowna metoda, tu program sprawdza czy wystepuja nawiasy */
    public void mainMethod(String input)
    {   for(int i=0;i<2;i++)
        if(input.contains("("))
        {
            String tmpInput=bracket(input);// wycina nawias z input'a
            //zastap nawias wynikiem metody MD
            input=input.replace(input.substring(input.indexOf('('),input.indexOf(')')+1 ),MD(tmpInput));
        }
        else input=MD(input);//przypisz do inputa wynik dzialania metody MD
        System.out.println(input);
    }
    /**metoda  obslugujaca mnozenie i dzielenie */
    public String MD(String input)
    {
        // zmienna do przechowywania zmienionych wartosci (NAZWIJ JAKOS LADNIE ;D)
        String x="";
        // jezeli istnieje mnozenie i dzielenie jednoczesnie
        if(input.contains("*") && input.contains("/"))
        {
            // jezeli mnozenie wystepuje przed dzieleniem
            if(input.indexOf("*")<input.indexOf("/"))
            {
                x= isolateActionAndChange(input,'*');
            }
            else
            {
                x=isolateActionAndChange(input,'/');
            }
        }
        //jezeli istnieje tylko mnozenie
        else if(input.contains("*") )
        {
            x=isolateActionAndChange(input,'*');
        }
        //jezeli istenieje tylko dzielenie
        else if(input.contains("/") )
        {
            x= isolateActionAndChange(input,'/');
        }
        else if(input.contains("+"))
        {

        }
        else if(input.contains("-"))
        {

        }
        //zwroc x
        return x;
    }
    /** metoda wycinajace pojedyncze dzialanie */
    public static String isolateActionAndChange(String mainInput, Character sign)
    {
        String input=mainInput;
        for(int i=0;i<2;i++)
       if(input.contains("+") && sign!='+')
       {
           if(input.indexOf(sign) > input.indexOf("+"))
           {
               input = input.substring(input.indexOf("+") + 1);//L
           }
           else
               input =  input.substring(0,input.indexOf("+") );//L
       }
       else if(input.contains("-") && sign!='-')
       {
           if(input.indexOf(sign) > input.indexOf("-"))
               input =  input.substring(input.indexOf("-") + 1);//L
           else
               input =  input.substring(0,input.indexOf("-") );//L
       }
       else if(input.contains("/") && sign=='*')
       {
           input =  input.substring(0,input.indexOf("/"));
       }
       else if(input.contains("*") && sign=='/')
       {
           input =  input.substring(0,  input.indexOf("*"));
       }
       return mainInput.replace(input,String.valueOf(math(sign,input)));
    }

    public String bracket (String input)
    {
        return input.substring(input.indexOf("(")+1, input.indexOf(")"));//remove
    }
/** metoda zwracajaca wynik poszczegolnych dzialan*/
    public static int  math (Character sign,String input)
    {
                switch (sign)
        {
            case '+':
            {
                String[]v =input.split("\\+");
                return Integer.parseInt(v[0]) + Integer.parseInt(v[1]);
            }
            case '-':
            {
                String[]v =input.split("\\-");
                return Integer.parseInt(v[0]) - Integer.parseInt(v[1]);
            }
            case '*':
            {
                String[]v =input.split("\\*");
                return  Integer.parseInt(v[0]) * Integer.parseInt(v[1]);
            }
            case '/':
            {
                String[]v =input.split("\\/");
                return  Integer.parseInt(v[0]) / Integer.parseInt(v[1]);
            }
            default: throw new IllegalArgumentException();
        }
    }
 public static void main(String[] args)
 {
    // String input="2+2/2*2/2";
     String input="8/(2*2)";
     MyCal c= new MyCal();
     c.mainMethod(input);
 }
}
// Kalkulator jest nieskończony, nie ma menu oraz oliku jar zrobionego 
