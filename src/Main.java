import java.util.Locale;

public class Main {
    public static void call(Class cls, String methodName) throws Exception {
        cls.getDeclaredMethod(methodName).invoke(null);
    }

    public static void main(String[] args) {
        var tasksCount = 8;
        for (var i = 1; i <= tasksCount; i++) {
            try {
                call(Main.class, "task" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void task1() {
        System.out.println("Задача 1");

        int intNumber = 1;
        byte byteNumber = 2;
        short shortNumber = 3;
        long longNumber = 4;
        float floatNumber = 5.0f;
        double doubleNumber = 6.0;

        System.out.println("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);
    }

    public static void task2() {
        System.out.println("Задача 2");

        double doubleNumber1 = 27.12;
        String tooLongNumber = "987 678 965 549";
        double doubleNumber2 = 2.786;
        float floatNumber = 569;
        short shortNumber = -159;
        int intNumber = 27897;
        byte smallNumber = 67;

        System.out.printf(Locale.US, "%.2f %s %.3f %.0f %d %d %d\n",
                doubleNumber1, tooLongNumber, doubleNumber2, floatNumber, shortNumber, intNumber, smallNumber);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int personsIn1Class = 23;
        int personsIn2Class = 27;
        int personsIn3Class = 30;
        int paperCount = 480;
        int paperPerPerson = paperCount / (personsIn1Class + personsIn2Class + personsIn3Class);

        System.out.println("На каждого ученика рассчитано " + paperPerPerson + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");

        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * (28 + 31) / 2;

        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");

        int totalPaint = 120;
        int whitePaintPerClassroom = 2;
        int brownPaintPerClassroom = 4;
        int classroomsCount = totalPaint / (whitePaintPerClassroom + brownPaintPerClassroom);
        int whitePaintBought = whitePaintPerClassroom * classroomsCount;
        int brownPaintBought = brownPaintPerClassroom * classroomsCount;

        System.out.println("В школе, где " + classroomsCount + " классов, нужно " +
                whitePaintBought + " банок белой краски и " + brownPaintBought + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");

        int bananasWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;

        int totalWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightInKg = totalWeight / (double) 1000;

        System.out.printf(Locale.US, "%d %.2f\n", totalWeight, totalWeightInKg);
    }

    public static void task7() {
        System.out.println("Задача 7");

        double loss250EveryDay = 7000 / (double) 250;
        double loss500EveryDay = 7000 / (double) 500;

        double meanDaysCount = (loss250EveryDay + loss500EveryDay) / 2;
        System.out.printf(Locale.US, "%.0f %.0f %.0f\n", loss250EveryDay, loss500EveryDay, meanDaysCount);
    }

    public static void task8() {
        System.out.println("Задача 8");

        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int ChristinaSalary = 76230;

        double MashaSalaryAfter = MashaSalary + MashaSalary * 0.1;
        double DenisSalaryAfter = DenisSalary + DenisSalary * 0.1;
        double ChristinaSalaryAfter = ChristinaSalary + ChristinaSalary * 0.1;

        double MashaIncomeDiff = MashaSalaryAfter * 12 - MashaSalary * 12;
        double DenisIncomeDiff = DenisSalaryAfter * 12 - DenisSalary * 12;
        double ChristinaSalaryDiff = ChristinaSalaryAfter * 12 - ChristinaSalary * 12;

        System.out.println("Маша теперь получает " + MashaSalaryAfter + " рублей. Годовой доход вырос на " + MashaIncomeDiff + " рублей");
        System.out.println("Денис теперь получает " + DenisSalaryAfter + " рублей. Годовой доход вырос на " + DenisIncomeDiff + " рублей");
        System.out.println("Кристина теперь получает " + ChristinaSalaryAfter + " рублей. Годовой доход вырос на " + ChristinaSalaryDiff + " рублей");
    }
}