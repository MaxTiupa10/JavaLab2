
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Abiturient[] abiturients = arrayInput();

        checkNAME(abiturients);

        checkMark(abiturients);

        highestMark(abiturients);
    }

    public static Abiturient[] arrayInput() {
        System.out.println("������ ������� �������� : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Abiturient[] abiturients = new Abiturient[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%s �������\n", i + 1);
            System.out.println("������ id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("������ ������� : ");
            String surname = scanner.nextLine();
            System.out.println("������ ��'� : ");
            String name = scanner.nextLine();
            System.out.println("������ �� ������� : ");
            String midname = scanner.nextLine();
            System.out.println("������ ������ : ");
            String address = scanner.nextLine();
            System.out.println("������ ����� �������� :");
            int number = scanner.nextInt();
            System.out.println("������ ������� ��� : ");
            double mark = scanner.nextDouble();

            abiturients[i] = new Abiturient(id, name, surname, midname, address, number, mark);
        }
        return abiturients;
    }

    public static void checkNAME(Abiturient[] abiturients) {
        System.out.println("������ ��'� ��� ������ �������� : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Abiturient abiturient : abiturients) {
            abiturient.checkName(name);
        }
    }

    public static void checkMark(Abiturient[] abiturients) {
        System.out.println("������ ������� ��� ��� ������ ����� : ");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        for (Abiturient abiturient : abiturients) {
            abiturient.checkMark(mark);
        }
    }

    public static void highestMark(Abiturient[] abiturients) {
        System.out.println("������ ������� �������� � �������� ������� ����� :\n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Arrays.sort(abiturients, (a, b) -> Double.compare(b.getMark(), a.getMark()));
        for (int i = 0; i < n; i++) {
            System.out.println(abiturients[i]);
        }
    }
}
