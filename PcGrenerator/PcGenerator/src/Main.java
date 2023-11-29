import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Виберіть тип збірки (Classic або Max): ");
        String buildType = scanner.nextLine();

        if (buildType.equalsIgnoreCase("1")) {
            Classic.createBasicBuild();


        } else if (buildType.equalsIgnoreCase("2")) {
          Max.createMaxBuild();

        } else {
            System.out.println("Неправильний вибір..");
        }
    }
}