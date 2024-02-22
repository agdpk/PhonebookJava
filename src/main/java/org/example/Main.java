package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить номер");
            System.out.println("3. Удалить контакт");
            System.out.println("4. Показать контакты");
            System.out.println("5. Выход");
            System.out.print("Введите свой выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите контактный номер: ");
                    int number = scanner.nextInt();
                    phoneBook.addContact(name, number);
                    break;
                case 2:
                    System.out.print("Введите имя контакта: ");
                    String nameRemove = scanner.nextLine();
                    System.out.print("Введите контактный номер для удаления: ");
                    int numberRemove = scanner.nextInt();
                    phoneBook.removeNumber(nameRemove, numberRemove);
                    break;
                case 3:
                    System.out.print("Введите имя контакта для удаления: ");
                    String nameRemoveAll = scanner.nextLine();
                    phoneBook.removeContact(nameRemoveAll);
                    break;
                case 4:
                    phoneBook.showContacts();
                    break;
                case 5:
                    System.out.println("Выход из программы");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор, попробуйте еще раз");
            }
        }
    }
}