public class Es1 {
    public static void main(String[] args) {
        System.out.println(moltiplicazione(2,3));
        System.out.println(stringa("ciao mondo", 21));

        String[] arrayStringa1 = {"ciao", "mondo", "come", "andiamo", "questo java?"};
        for (int i = 0; i < arrayStringa(arrayStringa1, "un saluto!").length; i++) {
            System.out.println("Elemento corrente " + arrayStringa(arrayStringa1, "un saluto!")[i]);
        }
    }
    public static int moltiplicazione (int num1, int num2) {
        System.out.println("la moltiplicazione è: ");
        return num1 * num2;
    }
    public static String stringa (String parola, int num1) {
        System.out.println("la stringa è: ");
        return parola + num1;
    }

    public static String[] arrayStringa (String[] array, String parola) {

        String[] newArrayStringa = new String[6];
        newArrayStringa[0] = array[0];
        newArrayStringa[1] = array[1];
        newArrayStringa[2] = parola;
        newArrayStringa[3] = array[2];
        newArrayStringa[4] = array[3];
        newArrayStringa[5] = array[4];
        return newArrayStringa;
}
}
