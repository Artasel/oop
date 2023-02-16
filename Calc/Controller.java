package Calc;

public class Controller {
    public static void butenClick() {
        UI.hi();
        while (true) {
            String num1 = UI.num();

            if (num1.equals("--")) {
                UI.bai();
                break;
            }

            String num2 = UI.num();

            if (num2.equals("--")) {
                UI.bai();
                break;
            }

            String znak = UI.action();

            if (znak.equals("--")) {
                UI.bai();
                break;
            }

            double x = Double.parseDouble(num1);
            double y = Double.parseDouble(num2);

            if ("+".contains(znak)) {
                System.out.println(x + y);
                double res = x + y;
                String res2 = String.valueOf(res);
                Logs.writeFile(res2);
            }
            
            if ("-".contains(znak)) {
                System.out.println(x - y);
                double res = x - y;
                String res2 = String.valueOf(res);
                Logs.writeFile(res2);
            }
            
            if ("*".contains(znak)) {
                System.out.println(x * y);
                double res = x * y;
                String res2 = String.valueOf(res);
                Logs.writeFile(res2);
            }
            
            if ("/".contains(znak)) {
                System.out.println(x / y);
                double res = x / y;
                String res2 = String.valueOf(res);
                Logs.writeFile(res2);
            }
        }
    }
}
