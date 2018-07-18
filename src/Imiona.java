import java.util.Arrays;

public class Imiona {
    public static void main(String[] args) {
        String[] tablica = new String[3];
        tablica[0] = "Agata";
        tablica[1] = "Agnieszka";
        tablica[2] = "Maksymilian";
        String arrayString = Arrays.toString(tablica);
        System.out.println(arrayString);
    }
}
