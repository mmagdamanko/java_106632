
// Napisz własna implementacje klasy Figure (figura) implementujacej interfejs NumberOfSidesPrintable,
// a nastepnie napisz klase: Square (kwadrat), ktora dziedziczy po Figure oraz implementuje interfejs Resetable.
// Pokaz w klasie Zadanie uzycie kodu.



class Zadanie { 
	
	public static void main(String[] args) {
	
	// podaj przyklad zastosowania
		
		Square s1 = new Square();
		s1.resetAllAttributes();
		s1.printSidesNumber();

	}
}


public class Square extends Figure implements Resetable
{
    private String rodzaj;
    private String ksztalt;
    private int iloscWierzcholkow;
    private int iloscKatow;
}

