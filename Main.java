import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите пример типа х + у");
        String q = scanner.nextLine();
        try {
        System.out.println(calc(q));}
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e)  {
        System.out.println("Не верное выражение");}
    }
    public static String calc(String q) {
        String[] q1 = q.split(" ");
            int n1,n2,res = 0;
            n1 = Integer.parseInt(String.valueOf(q1[0]));
            n2 = Integer.parseInt(String.valueOf(q1[2]));
        switch (q1[1]) {
            case "+": res = n1 + n2;
                break;
            case "-": res = n1 - n2;
                break;
            case "*": res = n1 * n2;
                break;
            case "/": res = n1 / n2;
                break;
            default: System.out.print("Error! Enter correct operator");
                break;}
            if (n1 < 1 || n1 > 10 || n2 < 1 || n2 > 10) {
                System.out.println("Не верное значение");
                System.exit(0);}
        return Integer.toString(res);}
}










