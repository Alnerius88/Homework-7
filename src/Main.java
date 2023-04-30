public class Main {
    public static void main(String[] args){
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    };
    public static void task1 () {
        System.out.println("Задача 1");
        int money = 0;
        int salary = 15000;
        while (money < 2_459_000) {
            money = money + salary;
            int month = money / salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        for (;n > 0;n--) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int born = 17;
        int die = 8;
        int totalPopulace = 10_000_000;
        int year = 1;
        for (; year <= 10; year++) {
            totalPopulace = totalPopulace + ( (17-8) * (totalPopulace/1000));
            System.out.println("Год "+ year + " численность населения составляет " + totalPopulace + " человек.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int account = 15000;
        int months = 0;
        while (account < 12_000_000) {
            account = account + (7 * (account / 100));
            months = months + 1;
            System.out.println("На месяц " + months + " сумма накоплений достигла " + account + " рублей.");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int account = 15000;
        int months = 0;
        while (account < 12_000_000) {
            account = account + (7 * (account / 100));
            months = months + 1;
            if (months % 6 == 0) {
                System.out.println("На месяц " + months + " сумма накоплений достигла " + account + " рублей.");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int account = 15000;
        int months = 0;
        while (months < 12 * 9 ) {
            account = account + (7 * (account / 100));
            months = months + 1;
            if (months % 6 == 0) {
                System.out.println("На месяц " + months + " сумма накоплений достигла " + account + " рублей.");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");

        int firstFriday = 4;
        for (int dayNumber = 1 ;dayNumber <= 31; dayNumber = dayNumber + 1) {
           if (dayNumber == firstFriday || (dayNumber - firstFriday) % 7 == 0) {
               System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
           }
        }

    }
    public static void task8 () {
        System.out.println("Задача 8");
        for (int year = 0; year <= 3000; year = year + 79) {
            if (year >= 1823 && year <= 2123) {
                System.out.println(year);
            }
        }
    }
}