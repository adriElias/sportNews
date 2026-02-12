package org.sport;

import java.util.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Editor> editors = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("---- SPORT NEWS ----");

        int option;
        while(true) {
            menu();
            option = selectOption("Option: ");

            switch (option) {
                case 1:
                    addEditor();
                    break;
                case 2:
                    removeEditor();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void menu() {
        System.out.println("MENU");
        System.out.println("1. Add editor");
        System.out.println("2 Remove an editor");
        System.out.println("Exit");
    }

    private static int selectOption(String message) {
        System.out.print("Message: " + message);
        while (!scanner.hasNextInt()) {
            System.out.print("Select a option: ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    private static void addEditor() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("DNI: ");
        String DNI = scanner.nextLine();
        editors.add(new Editor(DNI, name));

        System.out.println("Added correctly");

    }

    private static void removeEditor() {
        System.out.println("Insert your DNI");
        String DNI = scanner.nextLine();
        editors.removeIf(editor -> editor.getDNI().equals(DNI));

        System.out.println("Deleted correctly");
    }
}
