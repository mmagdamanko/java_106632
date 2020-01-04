// Przeczytaj artykuł https://kobietydokodu.pl/niezbednik-juniora-kolekcje-w-jezyku-java/,
// a nstępnie wykonaj zadanie.

// Stwórz mapę typu: Map<Integer, Person> gdzie Key=numer PESEL, Value=Person.
// Pokaż jak łatwo z wykorzystaniem Mapy można znajdować osoby po numerach PESEL.
// Zaprezentuj w main korzystnie z tego mechanizmu.

import java.util.HashMap;
import java.util.Map;

public class Maps
{

    public static void main(String[] args)
    {

        Person person1 = new Person(960265780, "Jaroslaw");
        Person person2 = new Person(978063540, "Janina");
        Person person3 = new Person(884960741, "Zosia");
        Person person4 = new Person(957127102, "Malwina");


        Map <Integer, Person> map = new HashMap <Integer, Person>();

        System.out.println("\nCzy mapa jest pusta? " + map.size());
        System.out.println("Ilość elementów w mapie to: " + map.isEmpty());

        map.put(person1.pesel,person1);
        map.put(person2.pesel,person2);
        map.put(person3.pesel,person3);
        map.put(person4.pesel,person4);

        System.out.println("\nPo dodaniu do mapy");
        System.out.println("Czy mapa jest pusta? " + map.size());
        System.out.println("Ilość elementów w mapie to: " + map.isEmpty());
        System.out.println("czy mapa zawiera PESEL: 884960741 " + map.containsKey(884960741));
        System.out.println("czy mapa zawiera PESEL: 884960740 " + map.containsKey(884960740));
        System.out.println("czy mapa zawiera imie: Zosia " + map.containsValue(person3));
        System.out.println("czy mapa zawiera imie: Małgosia " + map.containsKey("Małgosia"));
        System.out.println("Pesel osoby z mapy to: " + map.get(960265780).pesel + "  Imie osoby to: " + map.get(960265780).imie );
    }

}

class Person
{
    public int pesel;
    public String imie;

    Person(int pesel, String imie)
    {
        this.pesel = pesel;
        this.imie = imie;
    }
}
