//Dla klasy People2 zobacz jak działa HashSet.
//	1) Dodaj kilka osób do zbioru
//	2) Stwórz dwa obiekty  tak samo się nazywające i mające tyle samo lat (takie same osoby).
//		Spróbuj dodać te elementy do zbioru. Udało się?
//	3) Zaimplementuj poprawnie hashCode() oraz equals(...)
//		i sprawdź teraz czy się powyższa procedura powiodła
//	4) Utwórz TreeSet dla People i niech będzie domyślnie
//		sortowany po Comparable (wiek rosnąco)
//	5) Utwórz kolejny TreeSet ale posortowany po wieku malejąco.

package Zadanie5;

import java.util.*;

public class People2
{

    public static void main(String[] args)
    {
        List <People> list = new ArrayList <People>();

        People people1 = new People("Asia", "Zubek", 12);
        People people2 = new People("Julia", "Kłos", 15);
        People people3 = new People("Zenek", "Olszewski", 22);
        People people4 = new People("Kuba", "Kupczyk", 12);
        People people5 = new People("Pola", "Polkowska", 5);
        People people5_1 = new People("Pola", "Polkowska", 5);
//
        list.add(people1);
        list.add(people2);
        list.add(people3);
        list.add(people4);
        list.add(people5);
//

        HashSet<People> hashSet = new HashSet<>();
        hashSet.add(people1);
        hashSet.add(people2);
        hashSet.add(people3);
        hashSet.add(people4);
        hashSet.add(people5);
        hashSet.add(people5_1);

        System.out.println("Drukowanie początkowe");
        for (People tmp: hashSet)
        {
            System.out.println(tmp.printPeople());
        }

        /*
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nDrukowanie Listy posortowanej malejąco według wieku 'comparable' ");
        for (People tmp: list)
        {
            System.out.println(tmp.printPeople());
        }

        Comparator<People> compareByNazwisko = new Comparator<People>()
        {
            @Override
            public int compare(People o1, People o2)
            {
                return o1.getNazwisko().compareTo(o2.getNazwisko());
            }
        };

        Collections.sort(list, compareByNazwisko.reversed());

        System.out.println("\nDrukowanie Listy posortowanej malejąco po nazwiskou przy uzyciu komparatora ");
        for (People tmp: list)
        {
            System.out.println(tmp.printPeople());
        }

         */

    }

}
