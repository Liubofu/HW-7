//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int firstFriday = 7;
        int i = firstFriday;
        for (; i <= 31; i += 7) {
            System.out.println("Сегодня пятница " + i + " -е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задание 2, первая часть"); // с испольованием do-while

        int start = 42_195;
        do {
            System.out.println("Держитесь! Осталось " + start + " метров.");
            start = start - 500;
        }
        while (start > 0);

        System.out.println("Задание 2, вторая часть"); // с испольованием for

        int start2 = 42_195;
        for (i = start2; i > 0; i -= 500) {
            System.out.println("Держитесь! Осталось " + i + " метров.");
        }

        System.out.println("Задание 3, первая часть"); // с конструкцией while

        int money = 1_500; // сумма
        int day = 1;
        while (money > 0) {
            day = day + 1;
            if (day % 5 == 0) {
                continue;
            }
            money = money - 100;
            System.out.println(day + " день, " + money + " рублей на счете.");
        }
        System.out.println("Денги кончились.");

        System.out.println("Задание 3, вторая часть"); // с конструкцией for

        int money2 = 1_500;
        int day2 = 1;
        for (; money2 > 0; ) {
            day2 = day2 + 1;
            if (day2 % 5 == 0) {
                continue;
            }
            money2 = money2 - 100;
            System.out.println(day2 + " день, " + money2 + " рублей на счете.");
        }
        System.out.println("Денги кончились.");

        System.out.println("Задание 4");

        int month = 0;
        int total = 0;
        int moneySave = 15_000;
        while (total < 12_000_000) {
            month++;
            total = total + moneySave;
            System.out.println("Месяц " + month + ", накоплено " + total);
            if (month % 6 == 0) {
                total = (int) (total + total * 1.07);
                System.out.println(total + " накоплено за " + month + " месяцев");
            }
            if (total >= 12_000_000) {
                System.out.println(total + " цель достигнута за " + month + " месяцев");
                break;
            }
        }

        System.out.println("Задание 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            charge = charge + 2;
            if (overheats == 3) {
                break;
            }
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                continue;
            } System.out.println("Случился перегрев " + overheats + ", зарядка остановлена.");
            System.out.println("Время зарядки составило " + minute + " минут.");
        }
    }
}
