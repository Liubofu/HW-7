//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int firstFriday = 7;
        for (int i = firstFriday; i <= 31; i += 7) {
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
        for (int i = start2; i > 0; i -= 500) {
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

        int day2 = 1;
        for (int money2 = 1_500; money2 > 0; ) {
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
        double total = 0;
        double moneySave = 15_000;
        double percent = 0.07;
        while (total < 12_000_000) {
            month++;
            total = total + moneySave;
            String formattedTotal = String.format("%.2f", total);
            System.out.println("Месяц " + month + ", накоплено " + formattedTotal);
            if (month % 6 == 0) {
                total = total + (total * percent);
                System.out.println(formattedTotal + " накоплено за " + month + " месяцев");
            }
            if (total >= 12_000_000) {
                System.out.println(formattedTotal + " цель достигнута за " + month + " месяцев");
                break;
            }
        }

        System.out.println("Задание 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Минута " + minute + ": Перегрев! Зарядка приостановлена на 2 минуты");
            }
            if (minute + 1 <= 100) {
                minute++;
                System.out.println("Минута " + minute + ": Зарядка приостановлена");
            }
            if (minute + 2 <= 100) {
                minute++;
                System.out.println("Минута " + minute + ": Зарядка возобновлена");
                continue;
            }
            charge = charge + 2;
            System.out.println("Минута " + minute + ": Текущий заряд: " + charge + "%");
            if (overheats >= 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
            }
            if (charge >= 100) {
                System.out.println("Устройство заряжено.");
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}

