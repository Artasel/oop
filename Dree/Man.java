package Dree;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

class Man {
    private static String id;

    private String name;
    private String surName;
    private String patronymic;
    private String mom;
    private String dad;

    static ArrayList<String> listMan = new ArrayList<>();

    public Man(String name, String surName, String patronymic, String mom, String dad) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.mom = mom;
        this.dad = dad;

        id = searchId();

        addList(id, name, surName, patronymic, mom, dad);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getMom() {
        return mom;
    }

    public String getDad() {
        return dad;
    }

    static void addList(String id, String name, String surName, String patronymic, String mom, String dad) {
        listMan.add("Уникальный идентификатор: " + id);
        listMan.add("Имя: " + name);
        listMan.add("Фамилия: " + surName);
        listMan.add("Отчество: " + patronymic);
        listMan.add("Мама: " + mom);
        listMan.add("Папа: " + dad);
        listMan.add(" ");
    }

    static void readList() {
        for (String i : listMan) {
            System.out.println(i);
        }
    }

    static String searchId() {
        if (listMan.size() != 0) {

            if (listMan.size() != 7) {
                int num = 0;
                int maxInd = 0;

                for (int i = 0; i < listMan.size(); i++) {
                    if (listMan.get(i) == " " && i > maxInd) {
                        maxInd = i;
                    }
                }

                maxInd -= 6;

                String contein = listMan.get(maxInd);

                for (int i = 0; i < contein.length(); i++) {
                    char c = contein.charAt(i);
                    if (Character.isDigit(c)) {
                        num = Character.getNumericValue(c);
                        num++;
                    }
                }

                String number = String.valueOf(num);
                return number;
            } else {
                return "1";
            }
        } else {
            return "0";
        }
    }

    static String searchMan() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите id человека, которого надо найти: ");
        String idInput = iScanner.nextLine();
     //   iScanner.close();

        boolean prov = false;
        String name = "";
        String surName = "";
        String patronymic = "";
        String nameRes = "";
        String arr[];

        for (int i = 0; i < listMan.size(); i++) {
            char id = listMan.get(i).charAt(listMan.get(i).length() - 1);
            String idString = Character.toString(id);
            if (idString.equals(idInput)) {
                for (int j = i; j < 6 + i; j++) {
                    System.out.println(listMan.get(j));

                    if (listMan.get(j).contains("Имя")) {
                        arr = listMan.get(j).split(" ");
                        name = arr[1];
                    }
        
                    // if (listMan.get(j).contains("Фамилия")) {
                    //     arr = listMan.get(j).split(" ");
                    //     surName = arr[1];
                    // }
        
                    if (listMan.get(j).contains("Отчество")) {
                        arr = listMan.get(j).split(" ");
                        patronymic = arr[1];
                    }

                    if (name != "" && patronymic != "") {
                        nameRes = name + " " + patronymic;
                    }
                }
                prov = true;
                break;
            }
        }
        if (prov == false) {
            System.out.println("Такого id нет.");
        }

        return nameRes;
    }
    
    static void addMan() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();

        System.out.printf("Введите фамилию: ");
        String surName = iScanner.nextLine();

        System.out.printf("Введите отчество: ");
        String patronymic = iScanner.nextLine();

        System.out.printf("Введите фио матери: ");
        String mom = iScanner.nextLine();

        System.out.printf("Введите фио отца: ");
        String dad = iScanner.nextLine();
     //   iScanner.close();

        man(name, surName, patronymic, mom, dad);
    }

    private static void man(String name, String surName, String patronymic, String mom, String dad) {
        id = searchId();

        addList(id, name, surName, patronymic, mom, dad);
    }

    static void delMan() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите id человека, которого надо удалить: ");
        String idDel = iScanner.nextLine();
      //  iScanner.close();
        
        boolean prov = false;

        for (int i = 0; i < listMan.size(); i++) {
            char cont = listMan.get(i).charAt(listMan.get(i).length() - 1);
            String conteiner = Character.toString(cont);
            if (conteiner.equals(idDel)) {
                for (int j = i; j < 6 + i; j++) {
                    listMan.remove(i);
                }
                prov = true;
                break;
            }
        }

        if (prov == false) {
            System.out.println("Такого id нет.");
        }

        readList();
    }
}

class Relationships extends Man {

    public Relationships(String name, String surName, String patronymic, String mom, String dad) {
        super(name, surName, patronymic, mom, dad);
    }

    static void searChildren(String names) {
        Map<String, String> listChild = new HashMap<>();
        String name = "";
        String surName = "";
        String patronymic = "";
        String mom = "";
        String dad = "";

        String arr[];

        for (String i : listMan) {
            if (i.contains("Имя")) {
                arr = i.split(" ");
                name = arr[1];
            }

            if (i.contains("Фамилия")) {
                arr = i.split(" ");
                surName = arr[1];
            }

            if (i.contains("Отчество")) {
                arr = i.split(" ");
                patronymic = arr[1];
            }

            if (i.contains("Мама")) {
                arr = i.split(" ");
                mom = arr[1] + " " + arr[2];
            }

            if (i.contains("Папа")) {
                arr = i.split(" ");
                dad = arr[1] + " " + arr[2];
            }

            if (name != "" && surName != "" && patronymic != "" && mom != "" && dad != "") {
                String res = surName + " " + name + " " + patronymic;

                if (listChild.containsKey(mom)) {
                    if (!listChild.get(mom).contains(res)) {
                        listChild.put(mom, listChild.get(mom) + ", " + res);
                    }
                } else {
                    listChild.put(mom, res);
                }

                if (listChild.containsKey(dad)) {
                    if (!listChild.get(dad).contains(res)) {
                        listChild.put(dad, listChild.get(dad) + ", " + res);
                    }
                } else {
                    listChild.put(dad, res);
                }

                name = "";
                surName = "";
                patronymic = "";
                mom = "";
                dad = "";
            }
        }

        boolean prov = false;
        for (String j : listChild.keySet()) {
            if (j.contains(names)) {
                System.out.printf("Дети: " + listChild.get(j));
                System.out.println();
                System.out.println();
                prov = true;
            }
        }

        if (prov == false) {
            System.out.println("Детей нет");
        }
    }
}