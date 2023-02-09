package Interface2;

public class Obobchenia {
    public static void main(String[] args) {
        Obob<Integer> isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("2 этo делитель 10");
        }
        if (isFactor.test(10, 3)) {
            System.out.println("3 нe делитель 10");
        }
        System.out.println(" ");

        Obob<Double> isFactor2 = (m, n) -> (n < m);
        if (isFactor2.test(2.3, 10.6)) {
            System.out.println("2 < 10");
        }
        if (isFactor2.test(10.6, 2.7)) {
            System.out.println("10!<2");
        }
        System.out.println(" ");

        Obob<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Обобщенный функциональный интерфейс, Слово";
        System.out.println("Test string: " + str);
        if (isIn.test(str, "Слово")) {
            System.out.println("Найдено!");
        } else {
            System.out.println("He найдено");
        }
    }
}
