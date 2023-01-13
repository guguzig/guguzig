import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Введите пример типа х + у");
        String q = scanner.nextLine();
        System.out.println(calc(q));
    }
    public static String calc(String q) throws Exception {
        String[] q1 = q.split(" ");
        if (q1.length != 3) {
            throw new Exception("Введите пример типа х + у");
        }
        int n1, n2, res = 0;
        try {
            n1 = Integer.parseInt(String.valueOf(q1[0]));
            n2 = Integer.parseInt(String.valueOf(q1[2]));
            switch (q1[1]) {
                case "+" -> res = n1 + n2;
                case "-" -> res = n1 - n2;
                case "*" -> res = n1 * n2;
                case "/" -> res = n1 / n2;
                default -> throw new Exception("Try again");
            }
            if (n1 < 1 || n1 > 10 || n2 < 1 || n2 > 10) {
                throw new Exception("Введи цифры от 1 до 10");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
        return Integer.toString(res);
    }
}









