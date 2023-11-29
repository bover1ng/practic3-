import java.util.Scanner;
public class Select {
    public static int getUserChoice(Component type) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Оберіть компонент ");
        int select = scanner.nextInt();
        if (select >= 1 && select <= 6) {
            return select;
        } else {
            System.out.println("Неправильний вибір. Спробуйте ще раз.");
            return getUserChoice(type);
        }
    }
}
