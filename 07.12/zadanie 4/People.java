package Zadanie4;

public class People implements Comparable< People >{
    String imie;
    String nazwisko;
    int wiek;

    public People()
    {

    }

    public People(String imie, String nazwisko, int wiek)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String printPeople()
    {
        return "Imie: " + imie  + " Nazwisko: " + nazwisko + " Wiek: " + wiek;
    }

    public Integer getWiek()
    {
        return wiek;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    @Override
    public int compareTo(People tmp)
    {
        return this.getWiek().compareTo(tmp.getWiek());
    }
}
