// Utwórz klasę dziedziczšcš po Thread, której zadaniem jest wypisanie wszystkich liczb
// podzielnych przez 3 z zakresu liczb od X do Y.
// Utwórz kod, który wystartuje równolegle 5 wštków,
// gdzie każdy z wštków wypisze owe liczby na ekran w zakresach liczb odpowiednio 0-100,  101-200, 201-300 


class Divisibility extends Thread{
	public void run() {
		for (int i=0;i<=100;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		for (int i=101;i<=200;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		for (int i=201;i<=300;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		for (int i=301;i<=400;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		for (int i=401;i<=500;i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Divisibility d = new Divisibility();
		d.start();
	    }
	
}
