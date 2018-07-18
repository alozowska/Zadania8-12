import java.util.Scanner;

public class Wspolrzedne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        Punkt punkt = new Punkt(x, y);
        if (x > 0 && y > 0) {
            System.out.println("Punkt (" + punkt.getX() + "," + punkt.getY() + ") leży w I ćwiartce układu współrzędnych");
        } else if (x < 0 && y > 0) {
            System.out.println("Punkt (" + punkt.getX() + "," + punkt.getY() + ") leży w II ćwiartce układu współrzędnych");
        } else if (x < 0 && y < 0) {
            System.out.println("Punkt (" + punkt.getX() + "," + punkt.getY() + ") leży w III ćwiartce układu współrzędnych");
        } else if (x > 0 && y < 0) {
            System.out.println("Punkt (" + punkt.getX() + "," + punkt.getY() + ") leży w IV ćwiartce układu współrzędnych");
        }
    }
}
