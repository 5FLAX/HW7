public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int targetAmount = 2_459_000; // Целевая сумма
        int monthlySavings = 15_000; // Ежемесячные накопления
        int totalSavings = 0; // Общая сумма накоплений
        int month = 0; // Счетчик месяцев

        while (totalSavings < targetAmount) {
            month++; // Увеличиваем счетчик месяцев
            totalSavings += monthlySavings; // Добавляем ежемесячные накопления
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей.");
        }

        System.out.println("Для накопления " + targetAmount + " рублей потребуется " + month + " месяцев.");


        System.out.println("Задание 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.println("Задание 3");

        int population = 12000000; // начальное население
        double birthRate = 17; // рождаемость на 1000 человек
        double deathRate = 8; // смертность на 1000 человек

        for (int year = 0; year < 10; year++) {
            population += (birthRate - deathRate) * population / 1000;
            System.out.println("Год " + (year + 1) + ", численность населения составляет " + population + ".");
        }

        System.out.println("Задание 4");
        double initialDeposit = 15000; // первоначальная сумма вклада
        int targetAmount1 = 12000000; // целевая сумма накоплений
        double monthlyInterestRate = 7; // процентная ставка банка в месяц (в процентах)
        monthlyInterestRate /= 100; // перевод процентов в десятичную дробь

        for (int month1 = 1; initialDeposit < targetAmount1; month1++) {
            initialDeposit += initialDeposit * monthlyInterestRate; // расчёт суммы после добавления процентов
            System.out.printf("Месяц %d: %.2f рублей%n", month1, initialDeposit); // вывод суммы накоплений за текущий месяц
        }

        System.out.println("Сумма накоплений по каждому месяцу:");
        double currentMonthBalance = initialDeposit;
        if (i <= month) {
            currentMonthBalance = Math.pow(1 + monthlyInterestRate, i - 1) * initialDeposit; // Расчёт суммы накоплений для каждого месяца
            System.out.printf("%d месяц: %.2f рублей%n", i, currentMonthBalance);
        }

        System.out.println("Задание 5");

        int monthlySavings1 = 29000; // Ежемесячные накопления
        double totalSavings1 = 0; // Общая сумма накоплений
        double interestRate = 0.01; // 1% ежемесячно (12% годовых)

        for (int month2 = 1; month2 <= 60; month2++) {
            totalSavings1 += monthlySavings1; // Ежемесячные накопления
            double interest = totalSavings1 * interestRate; // Процент (1% от текущей суммы)
            totalSavings1 += interest; // Проценты к общей сумме

            // Результат только для каждого шестого месяца
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + Math.round(totalSavings1) + " рублей.");
            }
        }

        System.out.println("Задание 6");

        double savings = 15000; // Начальная сумма
        double monthlyInterest = 0.07; // 7% ежемесячно
        int totalMonths = 9 * 12; // 9 лет в месяцах

        for (int month3 = 1; month3 <= totalMonths; month3++) {
            savings *= (1 + monthlyInterest); // Проценты
            if (month3 % 6 == 0) { // За каждые полгода
                System.out.printf("Через %d месяцев: %.2f рублей%n", month3, savings);
            }
        }

        System.out.println("Задание 7");

        int firstFriday = 5; // Первая пятница месяца (число от 1 до 7)
        int daysInMonth = 31; // Количество дней в месяце

        for (int day = firstFriday; day <= daysInMonth; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задание 8");

        int currentYear = 2023; // Текущий год
        int startYear = currentYear - 200; // Начало периода (200 лет назад)
        int endYear = currentYear + 100; // Конец периода (100 лет вперед)
        int cometInterval = 79; // Интервал пролета кометы (каждые 79 лет)

        // Ближайший год пролета кометы до текущего года
        int lastFlybyYear = currentYear - (currentYear % cometInterval);

        //Все годы пролета кометы за последние 200 лет
        System.out.println("Годы пролета кометы за последние 200 лет:");
        for (int year = lastFlybyYear; year >= startYear; year -= cometInterval) {
            System.out.println(year);
        }

        // Следующий год пролета кометы в ближайшие 100 лет
        System.out.println("Следующий год пролета кометы:");
        System.out.println(lastFlybyYear + cometInterval);
    }
    }