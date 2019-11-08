package java_106632;


import java.io.File;	
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Quiz
{
public static void main(String[] args) throws FileNotFoundException 
{
int punktacja = 0;
// ścieżka do pliku z pytaniami
File file = new File("pytania.txt");
Scanner scan = new Scanner(System.in);
Scanner scanner = new Scanner(file);
int licznik = 1;
while (scanner.hasNext())
{
System.out.println("** PYTANIE " + licznik + " **");
String pytanie = scanner.nextLine();
System.out.println(pytanie);
String a = scanner.nextLine();
System.out.print("a) ");
System.out.println(a);
String b = scanner.nextLine();
System.out.print("b) ");
System.out.println(b);
String c = scanner.nextLine();
System.out.print("c) ");
System.out.println(c);
String d = scanner.nextLine();
System.out.print("d) ");
System.out.println(d);
String prawidlowaOdp = scanner.nextLine();
System.out.println("* Twoja odpowiedz: ");
String odp = scan.nextLine();
if (odp.equals(prawidlowaOdp))
{
System.out.println("To jest prawidłowa odpowiedz. +1 punkt\n");
punktacja++;
}
else
{
System.out.println("Błędna odpowiedz. Nie dostajesz punktu. Prawidłowa odpowiedż to " + prawidlowaOdp + "\n");
}
licznik++;
}
licznik --;
double procent = (double)punktacja / licznik * 100;
System.out.println("Koniec QUIZ-u. Zdobyłeś:" + punktacja + " punkty(ów). Daje to " + procent + "%.");
if (procent == 100)
{
System.out.println("Geniusz!");
}
else if (procent >= 80)
{
System.out.println("Jesteś świetny w tej dziedzinie.");
}
else if (procent == 0)
{
System.out.println("Ups, chyba musisz się podszkolić.");
}
else
{
System.out.println("Następnym razem pójdzie Ci lepiej");
}
}
}	

