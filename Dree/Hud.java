package Dree;

import java.util.Scanner;

//*Общение с пользователем */
public class Hud {
    //*Приветствие и возможности программы */
    static void hello() {
        System.out.println("Приветствуем вас в нашем приложении!!!");
    }

    static String opportunities() {
        System.out.println("1- Показать список");
        System.out.println("2- Добавить нового члена семьи");
        System.out.println("3- Удалить из списка");
        System.out.println("4- Найти человека");
        System.out.println("5- Выйти");

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Ваш выбор: ");
        String choice = iScanner.nextLine();
        // iScanner.close();

        System.out.println();
        return choice;
    }       
}

