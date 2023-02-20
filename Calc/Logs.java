package Calc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;   
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//*Запись и вывод логов программы */
public class Logs {
    //*Запись логов в файл txt */
    public static void writeFile(String info) {
        try (FileWriter fw = new FileWriter("file.txt", true)) {
            fw.append(info);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //*Вывод содержимого файла */
    public static void readFile() {
        try {
            File file = new File("/C:/Users/Tarona/Desktop/oop/file.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
