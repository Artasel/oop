package Calc;

import java.util.Scanner;
//*Общение с пользователем */
public class UI {

    //*Приветствие */
    public static void hi() {
        System.out.println("Приветствуем вас в нашем калькуляторе!!!");
        System.out.println("Для выхода введите \"--\"");
        Logs.writeFile("Вход в приложение");
    }

    //*Прощание */
    public static void bai() {
        Logs.writeFile("Выход из приложения");
    }

    //*Ввод цифр */
    public static String num() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите цифру или число: ");
        String number = iScanner.nextLine();

        if (number.equals("--")) {
            System.out.println("Досвидания!");
            return "--";
        }

        boolean prov = isNumeric(number);

        if (prov) {
            Logs.writeFile("Введено " + number);
            return number;
        } else {
            System.out.println("некорректный ввод");
            Logs.writeFile("некорректный ввод");
            num();
        }
        return number;
    }

    //*Ввод символов */
    public static String action() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите + - * или /: ");
        String act = iScanner.nextLine();

        if (act.equals("--")) {
            System.out.println("Досвидания!");
            return "--";
        }

        if ("+, -, *, /".contains(act) && act.length() == 1) {
            Logs.writeFile("Введено " + act);
            return act;
        } else {
            System.out.println("Некорректный ввод");
            Logs.writeFile("некорректный ввод");
            action();
        }
        return act;
    }
    //*Проверка на число */
    public static boolean isNumeric(String string) { 
        double number; 
        
        if(string == null || string.equals("")) { 
            System.out.println("Некорректный ввод"); 
            return false; 
        } 
        
        try { 
            number = Double.parseDouble(string); 
            return true; 
        } catch (NumberFormatException e) { 
            System.out.println("Некорректный ввод"); 
        } 
        return false; 
        } 
}


