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

        System.out.println("Задание 3");

        int money = 1_500; // сумма
        int day = 1;
        while (money > 0) {
            day = day + 1;
            if (day % 5 == 0) {
                continue;
            }
            money = money - 100;
            System.out.println(day + " день, " + money + " денег на счете.");
        }
        System.out.println("Денги кончились.");
    }
}