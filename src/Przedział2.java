public class Przedział2 {
    public static void main(String[] args) {
        double number1 = 0;
        double number2 = 3;
        do {
            number1 = number1 + 0.1;
            System.out.printf("%.1f ", number1);
        } while (number1 < number2);
    }
}
