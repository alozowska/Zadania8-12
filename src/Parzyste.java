public class Parzyste {
    public static void main(String[] args) {
        int i = 0;

        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
