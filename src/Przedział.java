public class Przedział {
    public static void main(String[] args) {

        double liczba1 = 0;
        double liczba2 = 3;
        while (liczba1 < liczba2) {
            liczba1 = liczba1 + 0.1;
            System.out.printf("%.1f ", liczba1);

        }
    }
}
