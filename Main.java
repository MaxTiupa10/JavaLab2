
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Abiturient[] abiturients = arrayInput();

        checkNAME(abiturients);

        checkMark(abiturients);

        highestMark(abiturients);
    }

    public static Abiturient[] arrayInput() {
        System.out.println("¬вед≥ть к≥льк≥сть аб≥тур≥Їнт≥в : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Abiturient[] abiturients = new Abiturient[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%s јб≥тур≥Їнт\n", i + 1);
            System.out.println("¬вед≥ть id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("¬вед≥ть пр≥звище : ");
            String surname = scanner.nextLine();
            System.out.println("¬вед≥ть ≥м'€ : ");
            String name = scanner.nextLine();
            System.out.println("¬вед≥ть по батьков≥ : ");
            String midname = scanner.nextLine();
            System.out.println("¬вед≥ть адресу : ");
            String address = scanner.nextLine();
            System.out.println("¬вед≥ть номер телефону :");
            int number = scanner.nextInt();
            System.out.println("¬вед≥ть середн≥й бал : ");
            double mark = scanner.nextDouble();

            abiturients[i] = new Abiturient(id, name, surname, midname, address, number, mark);
        }
        return abiturients;
    }

    public static void checkNAME(Abiturient[] abiturients) {
        System.out.println("¬вед≥ть ≥м'€ дл€ пошуку аб≥тур≥Їнт≥в : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (Abiturient abiturient : abiturients) {
            abiturient.checkName(name);
        }
    }

    public static void checkMark(Abiturient[] abiturients) {
        System.out.println("¬вед≥ть середн≥й бал дл€ пошуку вищих : ");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        for (Abiturient abiturient : abiturients) {
            abiturient.checkMark(mark);
        }
    }

    public static void highestMark(Abiturient[] abiturients) {
        System.out.println("¬вед≥ть к≥льк≥сть јб≥тур≥Їнт≥в з найвищим середн≥м балом :\n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Arrays.sort(abiturients, (a, b) -> Double.compare(b.getMark(), a.getMark()));
        for (int i = 0; i < n; i++) {
            System.out.println(abiturients[i]);
        }
    }
}
