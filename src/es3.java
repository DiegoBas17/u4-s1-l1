import java.util.Scanner;

import static java.lang.Math.sqrt;

public class es3 {
    public static void main(String[] args) {
        System.out.println(perimetroRettangolo());
        System.out.println(pariDispari());
        System.out.println(AreaTriangolo());
    }
    public static double perimetroRettangolo () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci la altezza del rettangolo");
        int altezza = Integer.parseInt(scanner.nextLine());
        return (base + altezza)*2;
    }
    public static int pariDispari () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero, se pari ti dirò:0 altimenti:1!");
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }

    }
    public static double AreaTriangolo () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao inserisci la lunghezza di un lato del triangolo");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci la lunghezza di un lato del triangolo");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserisci la lunghezza di un lato del triangolo");
        double c = Double.parseDouble(scanner.nextLine());
        scanner.close();
        double semiPerimetro = (a +b +c)/2;
        return Math.sqrt(semiPerimetro*(semiPerimetro-a)*(semiPerimetro-b)*(semiPerimetro-c));
    }

}

