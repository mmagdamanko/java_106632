package java_106632;

import java.util.Arrays;	

import java.util.Scanner;

public class Zadanie z trójkątami
{
public static void main(String[] args)
{ 
Scanner scan = new Scanner(System.in);
// nagłówek ----------------- 
System.out.print("**** Program na zaliczenie  \n"
+ "**** laboratorium z Javy \n"
+ "**** 26.10.2019r \n"
+ "**** Program liczy różne właściwości trójkąta z podanych boków.\n");
// Wprowadzanie boków -----------
System.out.print("Podaj długości boków trójkąta: ");
double a = scan.nextDouble();
double b = scan.nextDouble();
double c = scan.nextDouble();
// Czy można złożyć trójkąt ------------------------------------
if (a+b>c && a+c>b && b+c>a)
{
// Można złożyć trójkąt ------------------------------------------------------------
System.out.print("\n**** Można złożyć trójkąt.");
// Obwód trójkąta ---------------------------------------
double obwod = a+b+c;
System.out.print("\n**** Obwód tego trójkąta to: " + obwod);

// Jaki to jest trójkąt ----------------------------------
if (a==b && a==c && b==c)
{
System.out.print("\n**** To jest trójkąt równoboczny i ");
}
else if (a==b || a==c || b==c)
{
System.out.print("\n**** To jest trójkąt równoramienny i ");
}
else
{
System.out.print("\n**** To jest trójkąt różnoboczny i ");
}
if (alfa>90 || beta>90 || gamma>90)
{
System.out.print("rozwartokątny.");
}
else if (alfa==90 || beta==90 || gamma==90)
{
System.out.print("prostokątny.");
}
else
{
System.out.print("ostrokątny.");
}
// Pole trójkąta ----------------------------------------
double p = obwód/2;
double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
System.out.println("\n**** Pole tego trójkąta to: " + pole);
// Kąty w trójkącie ------------------------------------
double alfa = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))/(2*b*c)) * 57.29577951308;
double beta = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2*a*c)) * 57.29577951308;
double gamma = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b)) * 57.29577951308;
alfa = Math.round(alfa); // zakrąglanie do pełnych stopni
beta = Math.round(beta); // zakrąglanie do pełnych stopni
gamma = Math.round(gamma); // zakrąglanie do pełnych stopni
System.out.print("\n**** Miary kątów w trójkącie: ");
System.out.print(alfa + " stopni(e)");
System.out.print(beta + " stopni(e)");
System.out.print(gamma + " stopni(e)");

// Wysokości w trójkącie ----------------------------------
double ha = (2*pole)/a;
double hb = (2*pole)/b;
double hc = (2*pole)/c;
System.out.print("\n**** Wysokości w trójkącie: ");
System.out.print(ha);
System.out.print(hb);
System.out.print(hc);
}
else
{
// Nie można złożyć trójkąta --------------------------------------------------------
System.out.print("Nie można złożyć trójkąta.");
System.out.print("Koniec działania programu.");
}
}
}
