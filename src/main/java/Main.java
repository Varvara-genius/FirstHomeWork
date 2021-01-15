import java.util.Scanner;

public class Main {
    static int o = -41;
    static String name = "Виктор!";

    public static void main(String[] args) {
        System.out.println("e = " + mathExpression(1.1F, 2.2F, 3.3F, 4.4F));
        boolean bool = checking_numbers(17, 91);
        System.out.println(bool);
        System.out.println(positive_and_negative_numbers());
        System.out.println(positive_and_negative_numbers2());
        System.out.println(privet(name));
        System.out.println(leapYear());

    }

    public static void variables_of_all_types() {
        byte aByte = 8;
        short aShort = 16;
        int aInt = 32;
        long aLong = 64L;
        float aFloat = 32.01F;
        double aDouble = 64.01;
        boolean aBoolean = true;
        char aChar = 'C';
    }

    public static float mathExpression(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    public static boolean checking_numbers(int v, int g) {
        int sum = v + g;
        return sum >= 10 && sum <= 20;
    }

    public static String positive_and_negative_numbers() {
        if (o >= 0) {
            return "Положительное";
        } else return "Отрицательное";
    }

    public static boolean positive_and_negative_numbers2() {
        if (o <= 0) {
            return true;
        } else return false;
    }

    public static String privet(String name) {
        return ("Привет," + name);
    }

    public static String leapYear() {
        System.out.println("Введите год для проверки: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return ("Високосный");
            }return ("Не високосный");
        }return ("Не високосный");
    }
}