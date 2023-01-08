import java.util.Scanner;

public class calc {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Введите пример типа х + у");
        String x = scanner.nextLine();
        int num1;
        int num2;
        int res;
        try {
            num1 = Integer.parseInt(i(x));
            num2 = Integer.parseInt(iii(x));


        switch (ii(x)) {
            case "+" -> res = num1 + num2;
            case "-" -> res = num1 - num2;
            case "*" -> res = num1 * num2;
            case "/" -> res = num1 / num2;
            default -> {
                System.out.print("Error! Enter correct operator");
                return;
            }
        }

            if (num1 > 10) {
                System.out.println("Не верное значение");
                System.exit(0);
            }
            else if (num1 < 1) {
                System.out.println("Не верное значение");
                System.exit(0);
            }
            else if (num2 > 10) {
                System.out.println("Не верное значение");
                System.exit(0);
            }
            else if (num2 < 1) {
                System.out.println("Не верное значение");
                System.exit(0);
            }



        System.out.printf(String.valueOf(res));
        }catch (NumberFormatException e) {
            System.out.println("Только целые цифры от 1 до 10");}
    }


        static String i (String x){
            String[] data = x.split(" ");
            return data[0];
        }

        static String ii (String x){
            String[] data = x.split(" ");
            return data[1];
        }
        static String iii (String x){
            String[] data = x.split(" ");
            return data[2];
        }

    }
