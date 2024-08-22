import java.util.Scanner;

import static edu.misena.senaviewer.model.Book.addBook;

public class Main {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Movies.");
            System.out.println("2. Series.");
            System.out.println("3. Books.");
            System.out.println("4. Magazines.");
            System.out.println("5. Report.");
            System.out.println("6. Report Today.");
            System.out.println("0. Exit.");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    System.out.println("Salió de la aplicación.");
                    break;
                default:
                    System.out.println("Error, selecciona una opción valida.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}