public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
           System.out.println(i);
       }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задача 1
        System.out.println("Задача 1");
        int amount = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + amount;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        // Задача 2
        System.out.println("Задача 2");
         int amount_2 = 29000;
        int total_2 = 0;
        for (int i = 1; i <= 12; i++) {
            total_2 = total_2 + total_2/100;
            total_2 = total_2 + amount_2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total_2);
        }
    }
}