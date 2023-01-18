public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");

        int carrot = 100;
        System.out.println("Значение переменной carrot с типом int равно 100");

        byte apple = 90;
        System.out.println("Значение переменной apple с типом byte равно 90");

        short chicken = 32766;
        System.out.println("Значение переменной chicken с типом short равно 32766");

        long beef = 92000000;
        System.out.println("Значение переменной beef с типом long равно 92000000");

        float pork = 4.75F;
        System.out.println("Значение переменной pork с типом float равно 4.75");

        double salmon = 7.987;
        System.out.println("Значение переменной salmon с типом double равно 7.987");

        System.out.println("Задача 2");

        float dog = 27.12F;
        System.out.println(dog);

        long snake = (long) 987678965549.0;
        System.out.println(snake);

        double bird = 2.786;
        System.out.println(bird);

        boolean cat = 10 < 5;
        System.out.println(cat);

        int fox = 569;
        System.out.println(fox);

        short wolf = -159;
        System.out.println(wolf);

        int bear= 27897;
        System.out.println(bear);

        byte tiger = 67;
        System.out.println(tiger);

        System.out.println("Задача 3");

        short teacher1 = 23;
        short teacher2 = 27;
        short teacher3 = 30;
        int totalStudents = teacher1 + teacher2 + teacher3;
        short paper = 480;
        int paperStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte bottlesMinute = 16 / 2;
        byte minute = 20;
        int work20 = minute * bottlesMinute;
        System.out.println("За " + minute + " минут машина произвела бутылок " + work20 + " штук ");

        int hour24 = 24 * 60;
        int workHour = hour24 * bottlesMinute;
        System.out.println("За сутки машина произвела бутылок " + workHour + " штук ");

        int day = 3;
        int hour = 24;
        int minuteHour = 60;
        int dayMinute = day * hour * minuteHour;
        int dayWork = dayMinute * bottlesMinute;
        System.out.println("За " + day + " дня машина произвела бутылок " + dayWork + " штук ");

        int month = 31;
        int monthWork = month * workHour;
        System.out.println("За месяц машина произвела бутылок " + monthWork + " штук ");

        System.out.println("Задача 5");

        byte paint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        int totalClasses = paint / (whitePaintClass + brownPaintClass);
        int whitePaintSchool = whitePaintClass * totalClasses;
        int brownPaintSchool = brownPaintClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaintSchool+ " банок белой краски и " + brownPaintSchool + " банок коричневой краски");

        System.out.println("Задача 6");

        int bananas = 5;
        int banana1 = 80;
        int bananasWeight = bananas * banana1;

        float milk = 200;
        float milk1 = 105;
        float milkWeight = (milk * milk1) / 100;

        int iceCream = 2;
        int iceCream1 = 100;
        int iceCreamWeight = iceCream * iceCream1;

        int eggs = 4;
        int egg1 = 70;
        int eggsWeight = eggs * egg1;

        float totalWeightBreakfast = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalWeightKg = (bananasWeight + milkWeight + iceCreamWeight + eggsWeight) / 1000;
        System.out.println(totalWeightBreakfast + " грамм");
        System.out.println(totalWeightKg + " кг");

        System.out.println("Задача 7");

        int lose = 7;
        int lose1 = 1000;
        int haveToLoseGr = lose * lose1;

        int loseMin = 250;
        int loseMax = 500;
        int loseAverage = (loseMin + loseMax) / 2;

        int loseMinDay = haveToLoseGr / loseMin;
        int loseMaxDay = haveToLoseGr / loseMax;
        float loseAverageDay = haveToLoseGr / loseAverage;
        System.out.println("На похудение уйдет " + loseMinDay + " дней, если сбрасывать по " + loseMin + " грамм в день");
        System.out.println("На похудение уйдет " + loseMaxDay + " дней, если сбрасывать по " + loseMax + " грамм в день");
        System.out.println("На похудение уйдет " + loseAverageDay + " дней, если сбрасывать по " + loseAverage + " грамм в день");

        System.out.println("Задача 8");

        float wagesMarie = 67760;
        float wagesDen = 83690;
        float wagesChris = 76230;

        float wagesRises = 1.1f;
        float year = 12;

        float oldYearMarie = wagesMarie * year;
        float oldYearDen = wagesDen * year;
        float oldYearChris = wagesChris * year;

        float newYearMarie = oldYearMarie * wagesRises;
        float newYearDen = oldYearDen * wagesRises;
        float newYearChris = oldYearChris * wagesRises;

        float differenceMarie = newYearMarie - oldYearMarie;
        float differenceDen = newYearDen - oldYearDen;
        float differenceChris = newYearChris - oldYearChris;

        float monthMarie = wagesMarie * wagesRises;
        float monthDen = wagesDen * wagesRises;
        float monthChris = wagesChris * wagesRises;


        System.out.println("Маша теперь получает " + monthMarie + " рублей. Годовой доход вырос на " + differenceMarie + " рублей");
        System.out.println("Денис теперь получает " + monthDen + " рублей. Годовой доход вырос на " + differenceDen + " рублей");
        System.out.println("Кристина теперь получает " + monthChris + " рублей. Годовой доход вырос на " + differenceChris + " рублей");










    }
}