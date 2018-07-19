public class Parzyste {
    public static void main(String[] args) {
        int i = 0;

        int sum = 0;
        while (i <= 100) {
            System.out.println(i);
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
    }
}
