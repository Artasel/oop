package Dree;

import java.util.Scanner;

public class Hud {
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




// for (String i : listMan) {
//     String arr[];
//     arr = i.split(" ");
//     if (!listChild.containsKey(arr[1] + " " + arr[2])) {
//         listChild.put(arr[4] + " " + arr[5], arr[1] + " " + arr[2] + " " + arr[3]);
//     } else {
//         listChild.put(arr[4] + " " + arr[5], listChild.get(arr[4] + " " + arr[5]) +  arr[1] + " " + arr[2] + " " + arr[3]);
//     }

//     System.out.println(listChild);
// }