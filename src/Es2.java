import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao inserisci il tuo nome");
        String nomeUtente = scanner.nextLine();
        System.out.println("inserisci il tuo cognome");
        String cognomeUtente = scanner.nextLine();
        System.out.println("dove vivi?");
        String luogo = scanner.nextLine();
        System.out.println("Ciao" + nomeUtente + " " + cognomeUtente + " che tempo fa a " +  luogo + "?");
        scanner.close();
    }
}
